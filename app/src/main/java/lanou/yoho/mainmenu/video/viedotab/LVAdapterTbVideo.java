package lanou.yoho.mainmenu.video.viedotab;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import lanou.yoho.R;
import lanou.yoho.bean.databean.videosbean.TBVideoBean;
import lanou.yoho.tools.CommonVH;

/**
 * Created by dllo on 16/11/29.
 * 视频VIDEO的ListView的适配器
 */
public class LVAdapterTbVideo extends BaseAdapter {

    private ArrayList<TBVideoBean.DataBean.ContentBean> mVideoBeanArrayList;

//    set方法传值
    public void setmVideoBeanArrayList(ArrayList<TBVideoBean.DataBean.ContentBean> mVideoBeanArrayList) {
        this.mVideoBeanArrayList = mVideoBeanArrayList;
    }

    @Override
    public int getCount() {
        return mVideoBeanArrayList == null ? 0 :mVideoBeanArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return mVideoBeanArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

//        获取Video 当前页面显示的视频Image,标题,类型
        String ImgViedo = mVideoBeanArrayList.get(i).getImage();
        String title = mVideoBeanArrayList.get(i).getTitle();
        String type = mVideoBeanArrayList.get(i).getTag().get(0).getTag_name();
//        时间戳转换,发布日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
//        String finalTime = sdf.format(new Date ( mVideoBeanArrayList.get(0).getCreate_time()) );

        CommonVH commonVH;
//        对应解析出来的标题赋给相应的,控件,视频,标题,类型
        commonVH = CommonVH.getViewHolder(convertView,viewGroup, R.layout.item_video);
        commonVH.setImage(R.id.item_video_image,ImgViedo);
        commonVH.setText(R.id.item_video_titletextview,title);
        commonVH.setText(R.id.item_video_sourcetextview,type);

        return commonVH.getItemView();
    }
}
