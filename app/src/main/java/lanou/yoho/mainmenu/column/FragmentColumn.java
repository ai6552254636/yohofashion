package lanou.yoho.mainmenu.column;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import java.util.ArrayList;

import lanou.yoho.R;
import lanou.yoho.base.BaseFragment;
import lanou.yoho.bean.databean.columnbean.ColumnBean;
import lanou.yoho.bean.databean.columnbean.CommentBean;
import lanou.yoho.interfaces.OnRecyclerViewItemClickListener;
import lanou.yoho.tools.VolleySingleton;
import lanou.yoho.tools.gosntools.GsonRequest;
import lanou.yoho.urllines.Urilines;

/**
 * Created by dllo on 16/11/23.
 * 栏目的Fragment
 */
public class FragmentColumn extends BaseFragment {

    private RecyclerView recyclerView;
    private RVAdapterColumn mAdapter; //RecyclerView适配器
    private ImageView mIcon;

    @Override
    protected int getLayout() {
        return R.layout.fragment_column;
    }

    @Override
    protected void initViews(View view) {
        initViewsId();
    }


    @Override
    protected void initData() {
        container();
        titleMethod();
        gsonMethod();

    }

    /**
     * findViewId 控件Id
     */
    private void initViewsId () {
        recyclerView = bindView(R.id.fragment_column_recycler);



    }

    /**
     * 绑定适配器,添加布局管理器的一些相关操作container容器
     * 次方法为定义的全局适配器由于请求的是两个接口的数据,
     * 所以适配器要定义全局的不然可能会出现适配器内给控件参数赋值为空的情况
     */
    private void container () {
        mAdapter = new RVAdapterColumn();
        recyclerView.setAdapter(mAdapter);
        StaggeredGridLayoutManager manager =
                new StaggeredGridLayoutManager(1, LinearLayout.VERTICAL);
        recyclerView.setLayoutManager(manager);
    }


    /**
     * Gson方法实现gson解析titleMethod方法,球鞋大夫的数据
     */
    private void titleMethod() {
        GsonRequest<CommentBean> sGsonRequest = new GsonRequest<CommentBean>
                (CommentBean.class, Urilines.URLCOLUMN_COMMENT, new Response.Listener<CommentBean>() {
                    @Override
                    public void onResponse(CommentBean response) {
                        Log.d("FragmentColumn", "球鞋大夫数据请求成功");
                        Log.d("FragmentColumn", "response.getData().getData():" + response.getData().getTitle());
                        Log.d("FragmentColumn", response.getData().getBanner());

                        CommentBean.DataBean1 dataBean1 = (CommentBean.DataBean1) response.getData();
                            mAdapter.setBannerBeanList(dataBean1);

//               TODO (栏目球大夫) 接口回调 实现 RecyclerView 的 Item 的点击监听
                        mAdapter.setOnRecyclerViewItemClickListener(new OnRecyclerViewItemClickListener() {
                            @Override
                            public void onItemClick(int position) {

                            }
                        });
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("FragmentColumn", "球鞋大夫数据请求失败");
                    }
                });
        VolleySingleton.getInstance().addRequest(sGsonRequest);
    }

    /**
     * Gson方法实现gson解析Method方法 菜单内的数据
     */
    private void gsonMethod() {
        GsonRequest mGsonRequest = new GsonRequest<ColumnBean>
                (ColumnBean.class, Urilines.URLCOLUMN_MENULINE, new Response.Listener<ColumnBean>() {
                    @Override
                    public void onResponse(ColumnBean response) {
                        Log.d("FragmentColumn", "栏目数据请求成功");

                        ArrayList<ColumnBean.DataBean> dataBeanArrayList = (ArrayList<ColumnBean.DataBean>) response.getData();
                        mAdapter.setColumnBeanArraylist(dataBeanArrayList);

//        TODO RecyclerView的布局管理器StaggeredGridLayoutManager;  参数1:所有显示的Item有几个  参数2:布局形式
//                        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(1, LinearLayout.VERTICAL);
//                        recyclerView.setLayoutManager(manager);
//        TODO (栏目) 接口回调 实现 RecyclerView 的 Item 的点击监听
                        mAdapter.setOnRecyclerViewItemClickListener(new OnRecyclerViewItemClickListener() {
                            @Override
                            public void onItemClick(int position) {

                            }
                        });
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("FragmentColumn", "栏目数据请求失败");
                    }
                });
        VolleySingleton.getInstance().addRequest(mGsonRequest);
    }
}