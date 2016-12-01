package lanou.yoho.urllines;

import android.net.Uri;

/**
 * Created by dllo on 16/11/22.
 * 栏目的所有接口
 */
public class Urilines {

//    推荐页的请求
    public static final String urllines1 = "http://new.yohoboys.com/yohoboyins/v5/channel/recommendList";
    String key1 =  "parameters";
    String values1 = "%7B%22platform%22%3A%224%22%2C%22scale%22%3A2%2C%22num%22%3A0%2C%22curVersion%22%3A%225.0.5%22%2C%22new" +
            "sEndtime%22%3A0%2C%22authInfo%22%3A%7B%22udid%22%3A%220000000000000005158d5733dbef8e1%22%7D%2C%22locale%22%3A%22zh" +
            "-Hans%22%2C%22magazineType%22%3A3%2C%22udid%22%3A%220000000000000005158d5733dbef8e1%22%2C%22language%22%3A%22zh-Hans" +
            "%22%2C%22WallpaperType%22%3A3%2C%22otherEndTime%22%3A0%7D&";

//    推荐页轮播图的接口
    public static final String urllines2 = "http://new.yohoboys.com/yohoboyins/v5/channel/newBanner";
    String key2 = "parameters";
    String values2 = "{\"language\":\"zh-Hans\",\"platform\":\"4\",\"locale\":\"zh-Hans\",\"udid\":\"0000000000000008a6f01ecf9fce05c\",\"curVersion\":\"5.0.5\",\"authInfo\":{\"udid\":\"0000000000000008a6f01ecf9fce05c\"}}&\n";

//    栏目头布局评论 球鞋大夫
      public static final String URLCOLUMN_COMMENT= "http://new.yohoboys.com/yohoboyins/v5/comment/shoseList";
      String key3 = "parameters";
      String values3 = "%7B%22limit%22%3A12%2C%22uid%22%3A%22%22%2C%22platform%22%3A%224%22%2C%22curVersion%22%3A%225.0.5%22%2C%22authInfo%22%3A%7B%22udid%22%3A%220000000000000005158d5733dbef8e1%22%7D%2C%22locale%22%3A%22zh-Hans%22%2C%22lastTime%22%3A%220%22%2C%22udid%22%3A%220000000000000005158d5733dbef8e1%22%2C%22language%22%3A%22zh-Hans%22%7D&";

//    栏目主要菜单的url
    public static final String  URLCOLUMN_MENULINE = "http://new.yohoboys.com/yohoboyins/v5/channel/aggregationIndex";
    String key4 ="parameters";
    String values4 ="%7B%22startTime%22%3A%220%22%2C%22limit%22%3A%2212%22%2C%22platform%22%3A%224%22%2C%22curVersion%22%3A%225.0.5%22%2C%22authInfo%22%3A%7B%22udid%22%3A%220000000000000005158d5733dbef8e1%22%7D%2C%22locale%22%3A%22zh-Hans%22%2C%22lastTime%22%3A%220%22%2C%22udid%22%3A%220000000000000005158d5733dbef8e1%22%2C%22language%22%3A%22zh-Hans%22%7D&";

//    球鞋大夫图片网络请求
    public static final String URLCOLUMN_ICON = "\"http://img01.yohoboys.com/contentimg/2016/08/11/16/018305d86c1b6813f7599b04cf9ccd3975.jpg";

//    视频VIDEO的接口
    public static final String URLVIDEO_LINES ="http://new.yohoboys.com/yohoboyins/v5/media/videoList";
    String key5 = "parameters";
    String values5 = "%7B%22startTime%22%3A%220%22%2C%22limit%22%3A%2230%22%2C%22platform%22%3A%224%22%2C%22curVersion%22%3A%225.0.5%22%2C%22authInfo%22%3A%7B%22udid%22%3A%220000000000000005158d5733dbef8e1%22%7D%2C%22locale%22%3A%22zh-Hans%22%2C%22udid%22%3A%220000000000000005158d5733dbef8e1%22%2C%22language%22%3A%22zh-Hans%22%7D& ";

//    视频直播的接口
    public static final String URLVIDEO_LIVELINES = "http://new.yohoboys.com/yohoboyins/v5/media/qcloudList";
    String getKey6 = "parameters";
    String values6 = "%7B%22startTime%22%3A%220%22%2C%22limit%22%3A%2230%22%2C%22platform%22%3A%224%22%2C%22curVersion%22%3A%225.0.5%22%2C%22authInfo%22%3A%7B%22udid%22%3A%220000000000000005158d5733dbef8e1%22%7D%2C%22locale%22%3A%22zh-Hans%22%2C%22udid%22%3A%220000000000000005158d5733dbef8e1%22%2C%22language%22%3A%22zh-Hans%22%7D&";

//    杂志  tab杂志的接口 第一行
    public static final String URLMAGAZINE_LINES1 = "http://h5api.myoho.net/index.php?r=Apiemag/magList&startTime=0&lastTime=1479786199&magCount=3&magType=1&width=1080&height=1776&ppi=480&num=3";
    String getKey7 = "parameters";
    String values7 = "{\"platform\":\"4\",\"locale\":\"zh-Hans\",\"app\":\"efashion\",\"language\":\"zh-Hans\",\"udid\":\"00000000000000063aa461b71c4cfcf\",\"curVersion\":\"5.0.4\",\"authInfo\":{\"udid\":\"00000000000000063aa461b71c4cfcf\"}}&";
//    杂志  tab杂志的接口 第二行
    public static final String URLMAGAZINE_LINES2 = "http://h5api.myoho.net/index.php?r=Apiemag/magList&startTime=0&lastTime=1479786199&magCount=3&magType=3&width=1080&height=1776&ppi=480&num=3";
    String getKey8 = "parameters";
    String values8 = "{“platform\":\"4\",\"locale\":\"zh-Hans\",\"app\":\"efashion\",\"language\":\"zh-Hans\",\"udid\":\"00000000000000063aa461b71c4cfcf\",\"curVersion\":\"5.0.4\",\"authInfo\":{\"udid\":\"00000000000000063aa461b71c4cfcf\"}}&";
//    杂志  tab杂志的接口 第三行
    public static final String URLMAGAZINE_LINES3 = "http://h5api.myoho.net/index.php?r=Apiemag/magList&startTime=0&lastTime=1479784306&magCount=3&magType=5&width=1080&height=1776&ppi=480&num=3";
    String getKey9 = "parameters";
    String values9 = " {“platform”:\"4\",\"locale\":\"zh-Hans\",\"app\":\"efashion\",\"language\":\"zh-Hans\",\"udid\":\"00000000000000063aa461b71c4cfcf\",\"curVersion\":\"5.0.4\",\"authInfo\":{\"udid\":\"00000000000000063aa461b71c4cfcf\"}}&";


}
