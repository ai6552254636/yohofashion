package lanou.yoho.mainmenu.magazine;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.ArrayList;

import lanou.yoho.R;
import lanou.yoho.base.BaseFragment;
import lanou.yoho.mainmenu.magazine.tabmagazine.FragmentTbMagazine;
import lanou.yoho.mainmenu.magazine.tabwallpaper.FragmentTbWallPaper;

/**
 * Created by dllo on 16/12/1.
 * 杂志的主Fragment  包含 杂志/壁纸
 */
public class FragmentMagazineParent extends BaseFragment {

    private ArrayList<Fragment> fragmentArrayList;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    @Override
    protected int getLayout() {
        return R.layout.fragment_magazine;
    }

    @Override
    protected void initViews(View view) {
        initViesID();
    }

    @Override
    protected void initData() {

    }

    /**
     * findViewID  在杂志界面替换TabLayout中的两个Fragment分别是杂志/壁纸
     */
    protected void initViesID () {
        mViewPager = bindView(R.id.fragment_magazine_viewpager);
        mTabLayout = bindView(R.id.fragment_magazine_tablayout);

        fragmentArrayList = new ArrayList<>();
        fragmentArrayList.add(new FragmentTbMagazine());
        fragmentArrayList.add(new FragmentTbWallPaper());

        VPAdapterMagazineParent mVpAdapter = new VPAdapterMagazineParent(getChildFragmentManager());
        mVpAdapter.setFragmentArrayList(fragmentArrayList);
        mViewPager.setAdapter(mVpAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

        //    分割线颜色
        mTabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.colorWhite));
    }

}
