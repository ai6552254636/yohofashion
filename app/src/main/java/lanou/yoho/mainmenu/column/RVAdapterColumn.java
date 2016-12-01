package lanou.yoho.mainmenu.column;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

import lanou.yoho.R;
import lanou.yoho.base.MyApp;
import lanou.yoho.bean.databean.columnbean.ColumnBean;
import lanou.yoho.bean.databean.columnbean.CommentBean;
import lanou.yoho.interfaces.OnRecyclerViewItemClickListener;
import lanou.yoho.tools.CommonVH;

/**
 * Created by dllo on 16/11/28.
 *  Column栏目RecyclerView的适配器
 *  TODO 此页刷新数据没有写
 */
public class RVAdapterColumn extends RecyclerView.Adapter{


    private ArrayList<ColumnBean.DataBean> columnBeanArraylist; //下面主菜单数据类的集合
    private OnRecyclerViewItemClickListener onRecyclerViewItemClickListener;     //接口回调实现实现RecyclerView的点击
    private CommentBean.DataBean1 bannerBeanList;  //球鞋大夫大图数据类的集合
    private Context mContext;   //给下面加载本地图片


//    set方法将数据传回到主线程中去

    public void setBannerBeanList(CommentBean.DataBean1 bannerBeanList) {
        this.bannerBeanList = bannerBeanList;
        Log.d("数据", this.bannerBeanList.getBanner());
        notifyDataSetChanged();
    }

    public void setColumnBeanArraylist(ArrayList<ColumnBean.DataBean> columnBeanArraylist) {
        this.columnBeanArraylist = columnBeanArraylist;
        notifyDataSetChanged();
    }

    public void setOnRecyclerViewItemClickListener(OnRecyclerViewItemClickListener onRecyclerViewItemClickListener) {
        this.onRecyclerViewItemClickListener = onRecyclerViewItemClickListener;
    }

//    对应Item返回对应的标题
    @Override
    public int getItemViewType(int position) {

        if (position == 0){
            return 0;
        }else {
            return 1;
        }


    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CommonVH commonVH;

        switch (viewType) {
            case 0:
                commonVH = CommonVH.getViewHolder(parent, R.layout.item_shoes);
                break;
            default:
                commonVH = CommonVH.getViewHolder(parent,R.layout.item_column);
                break;
        }
        return commonVH;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        int type = getItemViewType(position);
        CommonVH commonVH = (CommonVH)holder;

//        判断第一个返回的下标  不然menu下面的列表图解析出来会少一张
        if (position == 0){
            position = 1;
        }

//        获取栏目里面的图片,标题,篇数
        String imgUrl1 = columnBeanArraylist.get(position -1).getCover();
        String title1= columnBeanArraylist.get(position - 1).getSummary();
        String article1 =columnBeanArraylist.get(position -1).getTotal();

//        获取球大夫标题里面的图片,标题,位症案
            String imagUrl2 = bannerBeanList.getBanner();
            String title2 = bannerBeanList.getDescription();
            String article2 = bannerBeanList.getAnswers();
//        获取球大夫评论里面评论者的头像,名称,问题内容
        String Icon = bannerBeanList.getData().get(0).getHeadpic();
        String name = bannerBeanList.getData().get(0).getNick();
        String content = bannerBeanList.getData().get(0).getQuestion();
//        获取球鞋大夫评论里面大夫的头像,名称,回答答案

        String Qcontent = bannerBeanList.getData().get(0).getAnswer();


//        不同返回值对应不同的行布局内容
        switch (type) {
            case 0:   //            球大夫
                commonVH.setImage(R.id.item_comment_image,imagUrl2);
                commonVH.setText(R.id.item_comment_textview1,title2);
                commonVH.setText(R.id.item_comment_textview2,article2);
                //        对应的评论里面评论者的头像,名字,内容
                commonVH.setCircleImage(R.id.include_shoesiamge1,Icon);
                commonVH.setText(R.id.include_shoes_netname1,name);
                commonVH.setText(R.id.include_shoes_content1,content);
                //        对应的评论里面回答者的头像,名字,内容

                Bitmap bitmap =     // 加载本地图片
                        BitmapFactory.decodeResource(MyApp.getContext().getResources(),R.mipmap.docotor123);
                commonVH.setCircleImage(R.id.include_shoesiamge2,bitmap);

                commonVH.setText(R.id.include_shoes_netname2,"球鞋大夫");
                commonVH.setText(R.id.include_shoes_content2,Qcontent);

                break;
            default:
                //        把相应的数据赋给对应的控件,图片,标题,篇数
                commonVH.setImage(R.id.item_column_image,imgUrl1);
                commonVH.setText(R.id.item_column_textview1,title1);
                commonVH.setText(R.id.item_column_textview2,article1);

                break;
        }

//        Item的监听
        commonVH.getItemView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return columnBeanArraylist == null ? 0 :columnBeanArraylist.size();
    }
}
