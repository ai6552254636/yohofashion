package lanou.yoho.mainmenu.magazine.tabmagazine;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import lanou.yoho.R;
import lanou.yoho.bean.databean.magazinebean.TBmagazineBean2;
import lanou.yoho.tools.CommonVH;

/**
 * Created by dllo on 16/12/1.
 */
public class TbGVAdapter1 extends BaseAdapter {

    ArrayList<TBmagazineBean2.DataBean> secondBeanArrayList;

    //    传值
    public void setSecondBeanArrayList(ArrayList<TBmagazineBean2.DataBean> secondBeanArrayList) {
        this.secondBeanArrayList = secondBeanArrayList;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return secondBeanArrayList == null ? 0 :secondBeanArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return secondBeanArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        CommonVH commonVH = CommonVH.getViewHolder(convertView,viewGroup, R.layout.item_gridlayoutsecond);
//      获取第二行数据
        String ImgUrl2 = secondBeanArrayList.get(i).getCover();
        String Issue2 = secondBeanArrayList.get(i).getJournal();

//      解析 第二行
        commonVH.setImage(R.id.item_grid_image2,ImgUrl2);
        commonVH.setText(R.id.item_grid_textview2,Issue2);

        return commonVH.getItemView();
    }

}
