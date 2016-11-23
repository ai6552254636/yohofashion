package lanou.yoho.mainmenu.recommend;

import android.support.v7.widget.RecyclerView;

import android.view.View;
import android.view.ViewGroup;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import lanou.yoho.R;
import lanou.yoho.bean.databean.RecommendBean;
import lanou.yoho.interfaces.OnRecyclerViewItemClickListener;
import lanou.yoho.tools.CommonVH;

/**
 * Created by dllo on 16/11/23.
 * 推荐页的适配器
 */
public class RVAdapterRecommend extends RecyclerView.Adapter {

    private ArrayList<RecommendBean.DataBean.ParamsBean> recommendBeanArrayList;
    private OnRecyclerViewItemClickListener onRecyclerViewItemClickListener;     //接口回调实现实现RecyclerView的点击

//    set方法将数据传回到主线程中去


    public void setRecommendBeanArrayList(ArrayList<RecommendBean.DataBean.ParamsBean> recommendBeanArrayList) {
        this.recommendBeanArrayList = recommendBeanArrayList;
    }

    public void setOnRecyclerViewItemClickListener(OnRecyclerViewItemClickListener onRecyclerViewItemClickListener) {
        this.onRecyclerViewItemClickListener = onRecyclerViewItemClickListener;
        notifyDataSetChanged();
    }


//   对应的type返回的标题
    @Override
    public int getItemViewType(int position) {
        String title = recommendBeanArrayList.get(position).getTitle();
        if (title == null) {
            return 0;     //对应的返回值给下面的缓存类调用即RecyclerView.ViewHolder
        }                  //0代表正常的前三个行布局   1代表不同的行布局
        return 1;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        CommonVH commonVH;
        switch (viewType) {
            case 0:
                commonVH = CommonVH.getViewHolder(parent,R.layout.item_recommend1);
                break;
            default:
                commonVH = CommonVH.getViewHolder(parent,R.layout.item_recommend2);
                break;
        }
       return commonVH;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        int type = getItemViewType(position);
        CommonVH commonVH = (CommonVH) holder;


//        获取图片,标题栏,标题发布者
        String imgUrl = recommendBeanArrayList.get(position).getImage();
        String title = recommendBeanArrayList.get(position).getTitle();
        String source = recommendBeanArrayList.get(position).getTitleFont();
//        时间戳转换,发布日期
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy - MM - dd HH:mm:ss");
//        String finalTime = sdf.format(new Date (recommendBeanArrayList.
//                get(position).getCreate_time()) );

        switch (type) {
            case 0:
                commonVH.setImage(R.id.item_re_image,imgUrl);
                commonVH.setText(R.id.item_re_title,title);
                commonVH.setText(R.id.item_re_source,source);
//                commonVH.setText(R.id.item_re_date,finalTime);
                break;
            default:

                break;
        }
        commonVH.getItemView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onRecyclerViewItemClickListener.onItemClick(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return recommendBeanArrayList == null ? 0 :recommendBeanArrayList.size();
    }
}
