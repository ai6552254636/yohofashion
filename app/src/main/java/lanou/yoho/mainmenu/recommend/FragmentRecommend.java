package lanou.yoho.mainmenu.recommend;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.widget.LinearLayout;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import java.util.ArrayList;

import lanou.yoho.R;
import lanou.yoho.base.BaseFragment;
import lanou.yoho.bean.databean.RecommendBean;

import lanou.yoho.interfaces.OnRecyclerViewItemClickListener;
import lanou.yoho.tools.VolleySingleton;
import lanou.yoho.tools.gosntools.GsonRequest;
import lanou.yoho.urllines.UriColumn;

/**
 * Created by dllo on 16/11/23.
 */
public class FragmentRecommend extends BaseFragment{

    private RecyclerView recyclerView;
    private GsonRequest<RecommendBean> gsonRequest;

    @Override
    protected int getLayout() {
        return R.layout.fragment_recommend;
    }

    @Override
    protected void initViews() {
        recyclerView = bindView(R.id.fragment_re_recycler);
    }


    @Override
    protected void initData() {
        gsonMethod();
    }

    /**
     * Gson方法实现gson解析及相关的操作
     */
    private void gsonMethod () {
        gsonRequest = new GsonRequest<RecommendBean>(RecommendBean.class,
                UriColumn.urllines, new Response.Listener<RecommendBean>() {

            @Override
            public void onResponse(RecommendBean response) {
                ArrayList<RecommendBean.DataBean.ParamsBean> paramsBeanArrayList =
                        (ArrayList<RecommendBean.DataBean.ParamsBean>)
                                response.getData().get(0).getParams();

                RVAdapterRecommend adapter = new RVAdapterRecommend();
                adapter.setRecommendBeanArrayList(paramsBeanArrayList);
                recyclerView.setAdapter(adapter);
                StaggeredGridLayoutManager manager =new StaggeredGridLayoutManager(1, LinearLayout.VERTICAL);
                recyclerView.setLayoutManager(manager);

//                 TODO 接口回调 实现 RecyclerView 的 Item 的点击监听
                adapter.setOnRecyclerViewItemClickListener(new OnRecyclerViewItemClickListener() {
                    @Override
                    public void onItemClick(int position) {

                    }
                });
            }
        },new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("FragmentRecommend", "数据请求失败");
            }
        });
        VolleySingleton.getInstance().addRequest(gsonRequest);
    }


}
