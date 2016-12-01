package lanou.yoho.mainmenu.video;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.ArrayList;

import lanou.yoho.R;
import lanou.yoho.base.BaseFragment;
import lanou.yoho.mainmenu.video.livetab.FragmentTBLive;
import lanou.yoho.mainmenu.video.viedotab.FragmentTBVideo;

/**
 * Created by dllo on 16/11/23.
 * 视频当中的Fragment界面  里面包含VIDEO/直播
 */
public class FragmentVideoParent extends BaseFragment{

    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private ArrayList<Fragment> fragmentArrayList;

    @Override
    protected int getLayout() {
        return R.layout.fragment_videos;
    }

    @Override
    protected void initViews(View view) {
        initViesID();
    }

    @Override
    protected void initData() {

    }


    /**
     * findViewID  在视频界面替换TabLayout中的两个Fragment分别是Video,直播
     */
    protected void initViesID () {
        mViewPager = bindView(R.id.fragment_video_viewpager);
        mTabLayout = bindView(R.id.fragment_video_tablayout);

        fragmentArrayList = new ArrayList<>();
        fragmentArrayList.add(new FragmentTBVideo());
        fragmentArrayList.add(new FragmentTBLive());

        VPAdapterVideoParent mVpAdapter = new VPAdapterVideoParent(getChildFragmentManager());
        mVpAdapter.setFragmentArrayList(fragmentArrayList);
        mViewPager.setAdapter(mVpAdapter);
        mTabLayout.setupWithViewPager(mViewPager);


//    分割线颜色
        mTabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.colorWhite));

    }


}
