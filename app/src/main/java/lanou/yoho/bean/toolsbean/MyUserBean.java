package lanou.yoho.bean.toolsbean;

import cn.bmob.v3.BmobUser;

/**
 * Created by dllo on 16/11/25.
 * 继承云端登录的BmobUser
 */
public class MyUserBean extends BmobUser {
    private String icon;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
