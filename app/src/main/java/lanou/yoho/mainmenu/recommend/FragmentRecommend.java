package lanou.yoho.mainmenu.recommend;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.bartoszlipinski.recyclerviewheader.RecyclerViewHeader;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;
import java.util.List;

import lanou.yoho.MainActivity;
import lanou.yoho.R;
import lanou.yoho.base.BaseFragment;
import lanou.yoho.bean.databean.RecommendBean;

import lanou.yoho.bean.databean.bannerbeans.RecommendBannerBean;
import lanou.yoho.interfaces.GlideImageLoader;
import lanou.yoho.interfaces.OnRecyclerViewItemClickListener;
import lanou.yoho.tools.VolleySingleton;
import lanou.yoho.tools.gosntools.GsonRequest;
import lanou.yoho.urllines.UriColumn;

/**
 * Created by dllo on 16/11/23.
 * 对应推荐界面的Fragment
 */
public class FragmentRecommend extends BaseFragment implements View.OnClickListener{

    private RecyclerView recyclerView;
    private GsonRequest<RecommendBean> mGsonRequest;
    private GsonRequest<RecommendBannerBean> sGsonRequest;
    private LinearLayoutManager manager;
    private RecyclerViewHeader mHeader;
    private Banner mBanner;
    private ImageView mTitleImage ;
    private DrawerLayout mTiroir;


    @Override
    protected int getLayout() {
        return R.layout.fragment_recommend;
    }

    @Override
    protected void initViews(View view) {
        initViewsId();

//    布局管理器初始化,获取管理权限
        manager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(manager);
//    添加头布局给RecyclerView
        mHeader.attachTo(recyclerView,true);
        bannerNetworkRequest();  //轮播图网络请求
    }

//    findViewid
    private void initViewsId () {
        recyclerView = bindView(R.id.fragment_re_recycler);
        mBanner = bindView(R.id.banner);
        mHeader = bindView(R.id.fragment_re_recyclerheader);
        //      Fragment布局当中  推荐页左上角,被包裹登录图片的id
        mTitleImage = (ImageView)getView().findViewById(R.id.include).findViewById(R.id.title_include_Login);
//      MainActivity布局中  DrawerLayout控件的ID
        mTiroir = (DrawerLayout) getActivity().findViewById(R.id.title_rootdraw);
        mTitleImage.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        gsonMethod();
    }

    /**
     *点击事件方法
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.title_include_Login:
                mTiroir.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);
                mTiroir.openDrawer(Gravity.LEFT);
                break;
            default:
                break;
        }
    }

    /**
     * Gson方法实现gson解析及相关的操作
     */
    private void gsonMethod () {
        mGsonRequest = new GsonRequest<RecommendBean>(RecommendBean.class,
                UriColumn.urllines1, new Response.Listener<RecommendBean>() {

            @Override
            public void onResponse(RecommendBean response) {
                Log.d("FragmentRecommend", "推荐数据请求成功");
                ArrayList<RecommendBean.DataBean.ParamsBean> paramsBeanArrayList =
                        (ArrayList<RecommendBean.DataBean.ParamsBean>)
                                response.getData().get(0).getParams();

                RVAdapterRecommend adapter = new RVAdapterRecommend();
                adapter.setRecommendBeanArrayList(paramsBeanArrayList);
                recyclerView.setAdapter(adapter);
                StaggeredGridLayoutManager manager =new StaggeredGridLayoutManager(1, LinearLayout.VERTICAL);
                recyclerView.setLayoutManager(manager);

//                 TODO (推荐)   接口回调 实现 RecyclerView 的 Item 的点击监听
                adapter.setOnRecyclerViewItemClickListener(new OnRecyclerViewItemClickListener() {
                    @Override
                    public void onItemClick(int position) {

                    }
                });
            }
        },new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("FragmentRecommend", "推荐数据请求失败");
            }
        });
        VolleySingleton.getInstance().addRequest(mGsonRequest);
    }

    /**
     * 轮播图的网络请求及设置(三方banner)
     */
    private void bannerNetworkRequest () {
        sGsonRequest = new GsonRequest<RecommendBannerBean>(RecommendBannerBean.class, UriColumn.urllines2,
                new Response.Listener<RecommendBannerBean>() {
                    @Override
                    public void onResponse(RecommendBannerBean response) {
                        Log.d("FragmentRecommend", "轮播图网络请求成功");
                        ArrayList<RecommendBannerBean.DataBean> bannerbean =
                                (ArrayList<RecommendBannerBean.DataBean>) response.getData();

                        ArrayList<String> imgUrls = new ArrayList<>();


                        for (int i = 0; i < bannerbean.size(); i++) {
                            RecommendBannerBean.DataBean dataBean = bannerbean.get(i);
                            imgUrls.add(dataBean.getImage());
                        }
                        mBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);  //样式
                        mBanner.setImageLoader(new GlideImageLoader()); //图片加载器
                        mBanner.setImages(imgUrls); //设置图片集合
                        mBanner.setBannerAnimation(Transformer.DepthPage); //设置动画效果
                        mBanner.isAutoPlay(true);
                        mBanner.setDelayTime(3000); // 设置轮播时间
                        mBanner.setIndicatorGravity(BannerConfig.CENTER); //设置轮播指示器位置
                        mBanner.start();  //启动轮播

                    }
                    },new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("FragmentRecommend", "轮播图网络请求失败");
            }
        });
        VolleySingleton.getInstance().addRequest(sGsonRequest);
    }


}
