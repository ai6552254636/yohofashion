package lanou.yoho.mainmenu.video;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by dllo on 16/11/29.
 * 视频的ViewPager 的适配器
 */
public class VPAdapterVideoParent extends FragmentPagerAdapter {

    private String[] titles = new String[] {"VIDEO","直播"};
    private ArrayList<Fragment> fragmentArrayList;

    public void setFragmentArrayList(ArrayList<Fragment> fragmentArrayList) {
        this.fragmentArrayList = fragmentArrayList;
        notifyDataSetChanged();
    }

    public VPAdapterVideoParent(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentArrayList == null ? 0 :fragmentArrayList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles [position];
    }
}
