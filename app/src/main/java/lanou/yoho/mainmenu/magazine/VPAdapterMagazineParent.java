package lanou.yoho.mainmenu.magazine;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;


/**
 * Created by dllo on 16/12/1.
 * 杂志的ViewPager 的适配器
 */
public class VPAdapterMagazineParent extends FragmentPagerAdapter{


    private String[] titles = new String[] {"杂志","壁纸"};
    private ArrayList<Fragment> fragmentArrayList;

    public void setFragmentArrayList(ArrayList<Fragment> fragmentArrayList) {
        this.fragmentArrayList = fragmentArrayList;
        notifyDataSetChanged();
    }

    public VPAdapterMagazineParent(FragmentManager fm) {
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
