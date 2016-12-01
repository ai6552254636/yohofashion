package lanou.yoho.mainmenu.video.livetab;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import lanou.yoho.R;
import lanou.yoho.bean.databean.videosbean.TBLiveBean;
import lanou.yoho.tools.CommonVH;

/**
 * Created by dllo on 16/11/30.
 * 视频 tablayout , ListView直播的适配器
 */
public class LVAdapterTbLive extends BaseAdapter{

    private ArrayList<TBLiveBean.DataBean.ContentBean> liveBeanArrayList;

    public void setLiveBeanArrayList(ArrayList<TBLiveBean.DataBean.ContentBean> liveBeanArrayList) {
        this.liveBeanArrayList = liveBeanArrayList;
    }

    @Override
    public int getCount() {
        return liveBeanArrayList == null ? 0 :liveBeanArrayList.size();
    }

    @Override
    public Object getItem(int postion) {
        return liveBeanArrayList.size();
    }

    @Override
    public long getItemId(int postion) {
        return postion;
    }

    @Override
    public View getView(int postion, View convertView, ViewGroup viewGroup) {
//        获取对应的视频直播图片,标题,类型
        String ImageVideo = liveBeanArrayList.get(postion).getImage();
        String title = liveBeanArrayList.get(postion).getTitle();
        String type = liveBeanArrayList.get(postion).getTag().get(0).getTag_name();

        CommonVH commonVH ;
        commonVH = CommonVH.getViewHolder(convertView,viewGroup, R.layout.item_live);
        commonVH.setImage(R.id.item_live_image,ImageVideo);
        commonVH.setText(R.id.item_live_titletextview,title);
        commonVH.setText(R.id.item_live_sourcetextview,type);

        return commonVH.getItemView();
    }


}
