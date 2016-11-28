package lanou.yoho.login;

import android.content.Intent;
import android.content.SharedPreferences;

import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.gitonway.lee.niftymodaldialogeffects.lib.Effectstype;
import com.gitonway.lee.niftymodaldialogeffects.lib.NiftyDialogBuilder;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;
import lanou.yoho.MainActivity;
import lanou.yoho.R;
import lanou.yoho.base.BaseActivity;

import lanou.yoho.bean.databean.MyUserBean;

/**
 * Created by dllo on 16/11/25.
 * 登录和注册界面的临时
 */

//TODO 修改变量名字  和注册界面的布局  实现了云端的登录和注册功能
public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private Button mBtnSignedin;  //登录按钮
    private Button mBtnSignedout; //注册按钮
    private EditText mEdtAccount;  //账号框
    private EditText mEdtPassword;  //密码框
    private CheckBox mCheckBox1;
    private CheckBox mCheckBox2;
    private SharedPreferences.Editor editor;
    private Button mBtnReturn;
    private TextView mTextBuyHave;

    @Override
    protected int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void initViews() {
        initViewsId();
        spvoid();
    }

    //    获取控件id
    protected void initViewsId () {
        mBtnSignedin = bindView(R.id.btn_denglu);
        mBtnSignedout = bindView(R.id.btn_zhuce);
        mEdtAccount = bindView(R.id.edt_zhanghao);
        mEdtPassword = bindView(R.id.edt_mima);
        mCheckBox1 = bindView(R.id.checkBox1);
        mCheckBox2 = bindView(R.id.checkBox2);
        mBtnReturn = bindView(R.id.loginreturn_btn);
        mTextBuyHave = bindView(R.id.loginpop_textview);  //有百货点击相应的TextView内容弹出Dialog对话框


        mBtnSignedin.setOnClickListener(this);
        mBtnSignedout.setOnClickListener(this);
        mCheckBox2.setOnClickListener(this);
        mBtnReturn.setOnClickListener(this);
        mTextBuyHave.setOnClickListener(this);

    }

    @Override
    protected void initData() {

    }

    /**
     * 点击事件
     * @param view
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_denglu:
                login();
                break;
            case R.id.btn_zhuce:
                createuser();
                break;

            case R.id.checkBox2:
                //        判断框内密码是否显示   是否勾选CheckBox
                if(mCheckBox2.isChecked()) {
                    mEdtPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    Toast.makeText(this, "选中", Toast.LENGTH_SHORT).show();
                } else {
                    mEdtPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    Toast.makeText(this, "未选中", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.loginreturn_btn:
                finish();
                break;
            case R.id.loginpop_textview:
                promptDialog();
                Toast.makeText(this, "被点击", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

    //    用户名数据持久化的方式
    protected void spvoid () {
        SharedPreferences preferences = getSharedPreferences("UserInfo",MODE_PRIVATE);
        editor = preferences.edit();

        /**
         * 启动程序时首先检查sharedPreferences中是否储存有用户名和密码
         若无，则将checkbox状态显示为未选中
         若有，则直接中sharedPreferences中读取用户名，并将checkbox状态显示为已选中
         这里getString()方法需要两个参数，第一个是键，第二个是值。
         启动程序时我们传入需要读取的键，值填null即可。若有值则会自动显示，没有则为空。
         */

//        判断框内是否有账号显示 是否勾选CheckBox
        String name = preferences.getString("userName" , null);
        if (name == null) {
            mCheckBox1.setChecked(false);
        } else {
            mEdtAccount.setText(name);
            mCheckBox1.setChecked(true);
        }
    }


// 登录方法
    private void login() {
        BmobUser bmobUser = new BmobUser();
        bmobUser.setUsername(mEdtAccount.getText().toString());
        bmobUser.setPassword(mEdtPassword.getText().toString());
        bmobUser.login(new SaveListener<MyUserBean>() {
            @Override
            public void done(MyUserBean myUserBean, BmobException e) {
                if (e == null) {
                    //跳转到第三个Activity然后在那边执行onRestart方法mainfest注册Activity的启动模式为singletask
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                    Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                    //如果用户选择了记住用户名
                    //将用户输入的用户名存入储存中，键为userName
                    if (mCheckBox1.isChecked()) {
                        editor.putString("userName", mEdtAccount.getText().toString());
                        editor.commit();
                    } else {
                        //否则用户名将被清除
                        editor.remove("userName");
                        editor.commit();
                    }
                    //外部判断,如果用户名登录密码正确可以正常登录,
                    //否则登录失败清空密码,重新登录
                } else {
                    editor.remove("userPassword");
                    editor.commit();
                    Toast.makeText(LoginActivity.this, "登录失败请重新输入", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


//   Dialog  账号可登录有百汇
    private void promptDialog () {
        NiftyDialogBuilder dialogBuilder = NiftyDialogBuilder.getInstance(this);
        dialogBuilder.withTitle("YOHO!Family");
        dialogBuilder.withMessage("Yoho!Family账号可登录YohoBuy!有货、Yoho!Now及SHOW");
//        标题字体的颜色FFFFFF
        dialogBuilder.withTitleColor("#000000");
//        分割线颜色
        dialogBuilder.withDividerColor("#FFFFFF");
//        内容字体颜色
        dialogBuilder.withMessageColor("#000000");
//        对话框颜色
        dialogBuilder.withDialogColor("#FFFFFF");
//        加载头像
//        dialogBuilder.withIcon(getResources().getDrawable(R.mipmap.ic_launcher));
//        对话框持出现的动画时间
        dialogBuilder.withDuration(1000);
//        动画效果    http://tympanus.net/Development/ModalWindowEffects/ 动画效果网址
//        Fadein, Slideleft, Slidetop, SlideBottom,
//                Slideright, Fall, Newspager, Fliph, Flipv,
//                RotateBottom, RotateLeft, Slit, Shake, Sidefill
        dialogBuilder.withEffect(Effectstype.SlideBottom);
        dialogBuilder.withButton1Text("确定");
//        dialogBuilder.withButton2Text("Cancel");
//       点击触摸屏外是否退出
        dialogBuilder.isCancelableOnTouchOutside(true);
//       框内自定义布局的方法
//        dialogBuilder.setCustomView(R.layout.custom_view,v.getContext());

//        按钮1.2的点击事件
        dialogBuilder.setButton1Click(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        dialogBuilder.show();
    }

// 创建用户的方法
    private void createuser() {
        BmobUser bmobUser = new BmobUser();

        bmobUser.setUsername(mEdtAccount.getText().toString()); // 用户名"asddbbb"
        bmobUser.setPassword(mEdtPassword.getText().toString()); // 密码1111111
        bmobUser.signUp(new SaveListener<BmobUser>() {
            @Override
            public void done(BmobUser bmobUser, BmobException e) {
                if (e == null) {
                    Toast.makeText(LoginActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                    Log.d("LoginActivity", "注册成功");
                } else {
                    Toast.makeText(LoginActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    Log.d("LoginActivity", e.getMessage());
                }
            }
        });
    }
}
