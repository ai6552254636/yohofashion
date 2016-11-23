package lanou.yoho;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import lanou.yoho.base.BaseActivity;
import lanou.yoho.mainmenu.recommend.FragmentRecommend;

public class MainActivity extends BaseActivity {

    private RadioGroup mRadioGroup;
    private RadioButton mBtnRecommend;
    private RadioButton mBtnColumn;
    private RadioButton mBtnCommunity;
    private RadioButton mBtnViedo;
    private RadioButton mMagazine;

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
//        获取管理者权限替换布局   推荐这业的布局这个是
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

//    点击事件  被initViewsId调用 替换布局
    protected void judeRadioButtonIsChecked (int checkedId) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        switch (checkedId) {
            case R.id.mainrbtn_recommend:
                transaction.replace(R.id.main_framelayout,new FragmentRecommend());
                break;
            case R.id.mainrbtn_column:
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

}