package lanou.yoho.tools;

import android.graphics.Bitmap;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

import lanou.yoho.R;
import lanou.yoho.base.MyApp;

/**
 * Created by dllo on 16/11/22.
 */
public class VolleySingleton {

    // 懒汉式单例类
    // 将需要用单例方式 初始化的 类或对象在该类里实现初始化
    // context 方式传参在这里不适合, 可能导致内存泄漏
    // 用Application的context更恰当,
    // 具体在 MyApp 类中实现, MyApp 需要注册

    private static VolleySingleton volleySingleton;

    private com.android.volley.RequestQueue requestQueue;
    private ImageLoader imageLoader; // 用来请求图片的 ImageLoader类

    private VolleySingleton() {
        requestQueue = Volley.newRequestQueue(MyApp.getContext());
        imageLoader = new ImageLoader(requestQueue, new MyImageCache());    // 自定义的MyImageCache类
    }
    //    private staic Object object = new Object;
    public static VolleySingleton getInstance() {
        if (volleySingleton == null) {
            synchronized (VolleySingleton.class) { // 同步锁
                if (volleySingleton == null) {
                    volleySingleton = new VolleySingleton();
                }
            }
        }

        return volleySingleton;
    }

    /** 获得RequestQueue */
    public com.android.volley.RequestQueue getRequestQueue(){
        return requestQueue;
    }

    /** 向请求队列 添加 请求 */
    public <T> void addRequest(Request<T> request){
        requestQueue.add(request);
    }


    /** 请求图片 方法1,  // 不带 动画效果的请求图片 */
    public void getImage(String url, final ImageView imageView) {
        imageLoader.get(url, new ImageLoader.ImageListener() {
            @Override
            public void onResponse(ImageLoader.ImageContainer response, boolean isImmediate) {

                Bitmap bitmap = response.getBitmap();
                if (bitmap == null) {
                    // 图片还在请求中, 先给一张默认的图片
//                    imageView.setImageResource(R.mipmap.ic_launcher);
                } else {
                    // 图片请求成功
                    imageView.setImageBitmap(bitmap);
                }
            }

            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
    }




    /** 请求图片 方法2 带有动画效果 */
    public void getAnimImage(String url, ImageView imageView) {
        // 带渐变动画效果的请求图片   AnimImageListener为自定义的类
        imageLoader.get(url, new AnimImageListener(imageView));
    }

    /** 请求图片 实现图片的圆形显示 */
    public void getCircleImage(String url, final ImageView imageView) {

        imageLoader.get(url, new ImageLoader.ImageListener() {
            @Override
            public void onResponse(ImageLoader.ImageContainer response, boolean isImmediate) {

                Bitmap bitmap = response.getBitmap();
                if (bitmap == null) {
                    // 图片还在请求中, 先给一张默认的图片
                    imageView.setImageResource(R.mipmap.ic_launcher);
                } else {
                    // 图片请求成功
                    // TODO  CircleDrawable为自定义的类 主要用Draw方法实现画圆
                    CircleDrawable drawable = new CircleDrawable(bitmap);
                    imageView.setImageDrawable(drawable);
                }
            }

            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

    }


}
