package lanou.yoho.mainmenu.magazine.tabmagazine;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import java.util.ArrayList;

import lanou.yoho.R;
import lanou.yoho.base.BaseFragment;
import lanou.yoho.bean.databean.magazinebean.TBmagazineBean1;
import lanou.yoho.bean.databean.magazinebean.TBmagazineBean2;
import lanou.yoho.bean.databean.magazinebean.TBmagazineBean3;
import lanou.yoho.tools.VolleySingleton;
import lanou.yoho.tools.gosntools.GsonRequest;
import lanou.yoho.urllines.Urilines;

/**
 * Created by dllo on 16/11/23.
 * 杂志Fragment 对应的tab杂志Fragment
 */
public class FragmentTbMagazine extends BaseFragment {

    private GridView mGridview1;
    private GridView mGridview2;
    private GridView mGridview3;



    @Override
    protected int getLayout() {
        return R.layout.fragment_tabmagazine;
    }

    @Override
    protected void initViews(View view) {
        mGridview1 = bindView(R.id.fragment_magazine_gridview1);
        mGridview2 = bindView(R.id.fragment_magazine_gridview2);
        mGridview3 = bindView(R.id.fragment_magazine_gridview3);

    }

    @Override
    protected void initData() {
        gsonMethod1();
        gsonMethod2();
        gsonMethod3();
    }

    /**tab 杂志第一行gson解析*/
    private void gsonMethod1() {
        GsonRequest<TBmagazineBean1> gsonRequest = new GsonRequest<TBmagazineBean1>
                (TBmagazineBean1.class, Urilines.URLMAGAZINE_LINES1,
                        new Response.Listener<TBmagazineBean1>() {
                            @Override
                            public void onResponse(TBmagazineBean1 response) {
                                Log.d("FragmentTbMagazine", "数据请求成功1" + response);
                                //访问成功,第一行tab杂志
                                TbGVAdapter gridviewAdapter = new TbGVAdapter();
                                ArrayList<TBmagazineBean1.DataBean> dataBeanArrayList =
                                        (ArrayList<TBmagazineBean1.DataBean>) response.getData();

                                gridviewAdapter.setFirstBeanArrayList(dataBeanArrayList);
                                mGridview1.setAdapter(gridviewAdapter);

                                // 数据铺建好后, 就应该进行点击监听了
                                mGridview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                    @Override
                                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                        Log.d("FragmentTbMagazine", "GridView监听1");
                                    }
                                });
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("FragmentTbMagazine", "数据请求失败1");
                    }
                });
        VolleySingleton.getInstance().addRequest(gsonRequest);
    }
    /**tab 杂志第二行gson解析*/
    private void gsonMethod2() {
        GsonRequest<TBmagazineBean2> gsonRequest = new GsonRequest<TBmagazineBean2>
                (TBmagazineBean2.class, Urilines.URLMAGAZINE_LINES2,
                        new Response.Listener<TBmagazineBean2>() {
                            @Override
                            public void onResponse(TBmagazineBean2 response) {
                                Log.d("FragmentTbMagazine", "数据请求成功2" + response);
                                //访问成功,第一行tab杂志
                                TbGVAdapter1 gridviewAdapter1 = new TbGVAdapter1();
                                ArrayList<TBmagazineBean2.DataBean> dataBeanArrayList =
                                        (ArrayList<TBmagazineBean2.DataBean>) response.getData();

                                gridviewAdapter1.setSecondBeanArrayList(dataBeanArrayList);
                                mGridview2.setAdapter(gridviewAdapter1);

                                // 数据铺建好后, 就应该进行点击监听了
                                mGridview2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                    @Override
                                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                        Log.d("FragmentTbMagazine", "GridView监听2");
                                    }
                                });
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("FragmentTbMagazine", "数据请求失败2");
                    }
                });
        VolleySingleton.getInstance().addRequest(gsonRequest);
    }
    /**tab 杂志第三行gson解析*/
    private void gsonMethod3() {
        GsonRequest<TBmagazineBean3> gsonRequest = new GsonRequest<TBmagazineBean3>
                (TBmagazineBean3.class, Urilines.URLMAGAZINE_LINES3,
                        new Response.Listener<TBmagazineBean3>() {
                            @Override
                            public void onResponse(TBmagazineBean3 response) {
                                Log.d("FragmentTbMagazine", "数据请求成功." + response);
                                //访问成功,第一行tab杂志
                                TbGVAdapter2 gridviewAdapter2 = new TbGVAdapter2();
                                ArrayList<TBmagazineBean3.DataBean> dataBeanArrayList =
                                        (ArrayList<TBmagazineBean3.DataBean>) response.getData();

                                gridviewAdapter2.setThirdBeanArrayList(dataBeanArrayList);
                                mGridview3.setAdapter(gridviewAdapter2);

                                // 数据铺建好后, 就应该进行点击监听了
                                mGridview3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                    @Override
                                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                        Log.d("FragmentTbMagazine", "GridView监听3");
                                    }
                                });
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("FragmentTbMagazine", "数据请求失败3");
                    }
                });
        VolleySingleton.getInstance().addRequest(gsonRequest);
    }


}
