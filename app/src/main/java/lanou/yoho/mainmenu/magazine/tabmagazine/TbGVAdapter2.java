package lanou.yoho.mainmenu.magazine.tabmagazine;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import lanou.yoho.R;
import lanou.yoho.bean.databean.magazinebean.TBmagazineBean3;
import lanou.yoho.tools.CommonVH;

/**
 * Created by dllo on 16/12/1.
 */
public class TbGVAdapter2 extends BaseAdapter {

    ArrayList<TBmagazineBean3.DataBean> thirdBeanArrayList;

    //    传值
    public void setThirdBeanArrayList(ArrayList<TBmagazineBean3.DataBean> thirdBeanArrayList) {
        this.thirdBeanArrayList = thirdBeanArrayList;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return thirdBeanArrayList == null ? 0 :thirdBeanArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return thirdBeanArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        CommonVH commonVH = CommonVH.getViewHolder(convertView,viewGroup, R.layout.item_gridlayout_third);

//      获取图片,刊数 第三行
        String ImgUrl3 =  thirdBeanArrayList.get(i).getCover();
        String Issue3 = thirdBeanArrayList.get(i).getJournal();

//      解析 第三行
        commonVH.setImage(R.id.item_grid_image3,ImgUrl3);
        commonVH.setText(R.id.item_grid_textview3,Issue3);

        return commonVH.getItemView();
    }

}
