package lanou.yoho.mainmenu.magazine.tabmagazine;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import lanou.yoho.R;
import lanou.yoho.bean.databean.magazinebean.TBmagazineBean1;
import lanou.yoho.bean.databean.magazinebean.TBmagazineBean2;
import lanou.yoho.bean.databean.magazinebean.TBmagazineBean3;
import lanou.yoho.tools.CommonVH;

/**
 * Created by dllo on 16/12/1.
 *  用于tab杂志的GridView中数据的适配器
 */
public class TbGVAdapter extends BaseAdapter {

    ArrayList<TBmagazineBean1.DataBean> firstBeanArrayList;

    //    传值
    public void setFirstBeanArrayList(ArrayList<TBmagazineBean1.DataBean> firstBeanArrayList) {
        this.firstBeanArrayList = firstBeanArrayList;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return firstBeanArrayList == null ? 0 :firstBeanArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return firstBeanArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        CommonVH commonVH = CommonVH.getViewHolder(convertView,viewGroup, R.layout.item_gridlayoutfirst);

//      获取图片,刊数 第一行
        String ImgUrl1 = firstBeanArrayList.get(i).getCover();
        String Issue1 = firstBeanArrayList.get(i).getJournal();


//      解析 第一行
        commonVH.setImage(R.id.item_grid_image1,ImgUrl1);
        commonVH.setText(R.id.item_grid_textview1,Issue1);

        return commonVH.getItemView();
    }
}
