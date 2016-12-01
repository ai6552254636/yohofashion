package lanou.yoho.mainmenu.video.viedotab;

import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import java.util.ArrayList;

import lanou.yoho.R;
import lanou.yoho.base.BaseFragment;
import lanou.yoho.bean.databean.videosbean.TBVideoBean;
import lanou.yoho.tools.VolleySingleton;
import lanou.yoho.tools.gosntools.GsonRequest;
import lanou.yoho.urllines.Urilines;

/**
 * Created by dllo on 16/11/30.
 * 视频 tablayout VIDEO的Fragment
 */
public class FragmentTBVideo extends BaseFragment {
    private ListView mListView;

    @Override
    protected int getLayout() {
        return R.layout.fragment_tbvideo;
    }

    @Override
    protected void initViews(View view) {
        initViewsId();
    }

    @Override
    protected void initData() {
        gsonMethod();
    }

    /**
     * findViewId
     */
    protected void initViewsId () {
        mListView = bindView(R.id.fragment_tbvideo_listview);
    }

    /**
     * 网络请求的方法
     */
    protected void gsonMethod () {
        GsonRequest<TBVideoBean> gsonRequest = new GsonRequest<TBVideoBean>
                (TBVideoBean.class, Urilines.URLVIDEO_LINES, new Response.Listener<TBVideoBean>() {
                    @Override
                    public void onResponse(TBVideoBean response) {
                        Log.d("FragmentTBVideo", "Video网络请求成功" + response);

                        ArrayList<TBVideoBean.DataBean.ContentBean> contentBeanArrayList =
                                (ArrayList<TBVideoBean.DataBean.ContentBean>) response.getData().getContent();

                        LVAdapterTbVideo adapter = new LVAdapterTbVideo();
                        adapter.setmVideoBeanArrayList(contentBeanArrayList);
                        mListView.setAdapter(adapter);
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("FragmentTBVideo", "网络请求失败");
                    }
                });
        VolleySingleton.getInstance().addRequest(gsonRequest);
    }
}
