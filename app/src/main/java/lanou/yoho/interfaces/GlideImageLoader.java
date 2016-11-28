package lanou.yoho.interfaces;

import android.content.Context;
import android.widget.ImageView;

import com.android.volley.RequestQueue;
import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;


/**
 * Created by dllo on 16/11/24.
 */
public class GlideImageLoader extends ImageLoader {


    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {

        //        需要导Glide包
        Glide.with(context).load(path).into(imageView);

    }
}
