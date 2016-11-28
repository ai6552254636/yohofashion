package lanou.yoho;


import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import lanou.yoho.base.BaseActivity;
import lanou.yoho.login.LoginActivity;
import lanou.yoho.mainmenu.column.FragmentColumn;
import lanou.yoho.mainmenu.recommend.FragmentRecommend;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private RadioGroup mRadioGroup;
    private RadioButton mBtnRecommend;
    private RadioButton mBtnColumn;
    private RadioButton mBtnCommunity;
    private RadioButton mBtnViedo;
    private RadioButton mMagazine;
    private ImageView mTirImage;


    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
        initViewsID();
    }

    @Override
    protected void initData() {

    }

//    findviewID  替换布局
    protected void initViewsID () {
        mRadioGroup = bindView(R.id.main_radiogroup);
        mBtnRecommend = bindView(R.id.mainrbtn_recommend);
        mBtnColumn = bindView(R.id.mainrbtn_column);
        mBtnCommunity = bindView(R.id.mainrbtn_community);
        mBtnViedo = bindView(R.id.mainrbtn_video);
        mMagazine = bindView(R.id.mainrbtn_magazine);
        mTirImage = bindView(R.id.maintiroir_image);
        mTirImage.setOnClickListener(this);

//        获取管理者权限替换布局   推荐页
        FragmentTransaction manager = getSupportFragmentManager().beginTransaction();
        manager.replace(R.id.main_framelayout,new FragmentRecommend());
        manager.commit();

//        设置RadioGroup的监听事件
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                judeRadioButtonIsChecked(i);
            }
        });
        Log.d("MainActivity", "控件Id已获取");
    }

    /**
     * 点击事件
     * @param view
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.maintiroir_image:    //跳转到注册界面
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

//    点击事件  被initViewsId调用 替换布局
    protected void judeRadioButtonIsChecked (int checkedId) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        switch (checkedId) {
            case R.id.mainrbtn_recommend:
                transaction.replace(R.id.main_framelayout,new FragmentRecommend());
                break;
            case R.id.mainrbtn_column:
                transaction.replace(R.id.main_framelayout,new FragmentColumn());
                break;
            case R.id.mainrbtn_community:
                break;
            case R.id.mainrbtn_video:
                break;
            case R.id.mainrbtn_magazine:
                break;
            default:
                break;
        }
        transaction.commitAllowingStateLoss();
        Log.d("MainActivity", "替换布局");
    }

//    抽屉在MainActivity的静态方法 在fragment中被调用
    public static void tiroir(DrawerLayout drawerLayout ){
        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNDEFINED);
        drawerLayout.openDrawer(Gravity.LEFT);
    }


}