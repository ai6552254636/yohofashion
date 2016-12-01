package lanou.yoho.mainmenu.video.livetab;

import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import java.util.ArrayList;

import lanou.yoho.R;
import lanou.yoho.base.BaseFragment;
import lanou.yoho.bean.databean.videosbean.TBLiveBean;
import lanou.yoho.tools.VolleySingleton;
import lanou.yoho.tools.gosntools.GsonRequest;
import lanou.yoho.urllines.Urilines;

/**
 * Created by dllo on 16/11/30.
 * 视频 tablayout 直播的Fragment
 */
public class FragmentTBLive extends BaseFragment {

    private ListView mListView;

    @Override
    protected int getLayout() {
        return R.layout.fragment_tablive;
    }

    @Override
    protected void initViews(View view) {
        mListView = bindView(R.id.fragment_tblive_listview);
    }

    @Override
    protected void initData() {
        gsonMethod();
    }

    /**
     * 网络请求的方法
     */
    protected void gsonMethod () {
        GsonRequest<TBLiveBean> gsonRequest = new GsonRequest<TBLiveBean>
                (TBLiveBean.class, Urilines.URLVIDEO_LIVELINES, new Response.Listener<TBLiveBean>() {
                    @Override
                    public void onResponse(TBLiveBean response) {
                        Log.d("FragmentTBLive", "网络请求成功");
                        ArrayList<TBLiveBean.DataBean.ContentBean> contentBeanArrayList =
                                (ArrayList<TBLiveBean.DataBean.ContentBean>) response.getData().getContent();

                        LVAdapterTbLive adapter = new LVAdapterTbLive();
                        adapter.setLiveBeanArrayList(contentBeanArrayList);
                        mListView.setAdapter(adapter);
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("FragmentTBLive", "网络请求失败");
                    }
                });
        VolleySingleton.getInstance().addRequest(gsonRequest);
    }
}


