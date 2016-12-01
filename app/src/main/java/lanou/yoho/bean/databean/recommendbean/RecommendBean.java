package lanou.yoho.bean.databean.recommendbean;

import java.util.List;

/**
 * Created by dllo on 16/11/23.
 * 推荐当页的数据类
 */
public class RecommendBean {



    private String status;
    private int code;
    private String message;
    /**
     * type : 0
     * params : [{"id":"22051","cid":"12913","create_time":"1479882516","publishURL":"http://www.yohoboys.com/channel/detail/index/id/12913","image":"http://img02.yohoboys.com/contentimg/2016/11/23/14/02aec03e64e5fe2577cdddce55c0598d4f.jpg","width":1024,"height":682,"contentType":4,"title":"成为下一代经典？！adidas推出全新lniki Runner Boost","titleFont":"c","subTitleFont":"c","subtitle":"","summary":"adidas专利的Boost tooling都成为了各种球鞋美学设计时的参考因素，比如说今年最火爆的NMD、Yeezy Boost、还有一系列的Ultra Boost和Ultra Boost Uncaged都受其影响。近日，adidas在其经

    private String status;
    private int code;
    private String message;
    /**
     * type : 0
     * params : [{"id":"22051","cid":"12913","create_time":"1479882516","publishURL":"http://www.yohoboys.com/channel/detail/index/id/12913","image":"http://img02.yohoboys.com/contentimg/2016/11/23/14/02aec03e64e5fe2577cdddce55c0598d4f.jpg","width":1024,"height":682,"contentType":4,"title":"成为下一代经典？！adidas推出全新lniki Runner Boost","titleFont":"c","subTitleFont":"c","subtitle":"","summary":"adidas专利的Boost tooling都成为了各种球鞋美学设计时的参考因素，比如说今年最火爆的NMD、Yeezy Boost、还有一系列的Ultra Boost和Ultra Boost Uncaged都受其影响。近日，adidas在其经典的Boost鞋型的基础上，推出了全新的极具复古风格的ln","app":"1","updateMd5":"5109d6ec6115deb4c89433b8cf878a9a","imgNum":5,"type":0,"tag":[{"tag_name":"球鞋","type":1,"tag_id":"3"}]},{"id":"22039","cid":"12901","create_time":"1479875606","publishURL":"http://www.yohoboys.com/channel/detail/index/id/12901","image":"http://img01.yohoboys.com/contentimg/2016/11/23/11/01b7a7b318ccc8c44848f8bbdd2a792ba2.jpg","width":796,"height":531,"contentType":4,"title":"三角军团新品发售，Palace \u201cUltimo\u201d系列致敬2Pac引回忆","titleFont":"c","subTitleFont":"c","subtitle":"","summary":"来自英国伦敦的滑板品牌Palace一直被誉为Supreme的接棒者，其三角Logo更加成功抢占潮流爱好者的眼球。因而现在每一季Palace推出的新品自然也受到瞩目。在最新一季2016秋冬系列当中以\u201cUltimo\u201d作为主题，更使用美国传奇Hip-Hop歌手2Pac相关的图案与元素进行设计，致敬味道甚浓","app":"1","updateMd5":"7c27042c0b2f7f3d08777e7fc722e9af","imgNum":31,"type":0,"tag":[{"tag_name":"时尚","type":1,"tag_id":"2-17"}]},{"id":"22038","cid":"12900","create_time":"1479873301","publishURL":"http://www.yohoboys.com/channel/detail/index/id/12900","image":"http://img01.yohoboys.com/contentimg/2016/11/23/11/01c9a8c9890505e0ebae5a3653b8769261.jpg","width":738,"height":1164,"contentType":0,"title":"日本东京打卡新潮点，NikeLab即将落户","titleFont":"c","subTitleFont":"c","subtitle":"","summary":"NikeLab绝对是全球顶尖门店的等级，得益于Nike的重金打造以及优势资源汇聚，令到NikeLab长期都有不同的联名或者限定产品发售。对于潮流爱好者来说NikeLab简直就是梦想中的店铺。而最新的NikeLab即将来到日本东京，选址此前藤原浩开设the POOL aoyama的南青山旧址。全新的N","app":"1","updateMd5":"94bda6f6cc895341b06a14b75eb90e00","imgNum":0,"type":0,"tag":[{"tag_name":"时尚","type":1,"tag_id":"2-17"}]}]
     */

    private List<DataBean> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private int type;
        /**
         * id : 22051
         * cid : 12913
         * create_time : 1479882516
         * publishURL : http://www.yohoboys.com/channel/detail/index/id/12913
         * image : http://img02.yohoboys.com/contentimg/2016/11/23/14/02aec03e64e5fe2577cdddce55c0598d4f.jpg
         * width : 1024
         * height : 682
         * contentType : 4
         * title : 成为下一代经典？！adidas推出全新lniki Runner Boost
         * titleFont : c
         * subTitleFont : c
         * subtitle :
         * summary : adidas专利的Boost tooling都成为了各种球鞋美学设计时的参考因素，比如说今年最火爆的NMD、Yeezy Boost、还有一系列的Ultra Boost和Ultra Boost Uncaged都受其影响。近日，adidas在其经典的Boost鞋型的基础上，推出了全新的极具复古风格的ln
         * app : 1
         * updateMd5 : 5109d6ec6115deb4c89433b8cf878a9a
         * imgNum : 5
         * type : 0
         * tag : [{"tag_name":"球鞋","type":1,"tag_id":"3"}]
         */

        public List<ParamsBean> params;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public List<ParamsBean> getParams() {
            return params;
        }

        public void setParams(List<ParamsBean> params) {
            this.params = params;
        }

        public static class ParamsBean {
            private String id;
            private String cid;
            private String create_time;
            private String publishURL;
            private String image;
            private int width;
            private int height;
            private int contentType;
            private String title;
            private String titleFont;
            private String subTitleFont;
            private String subtitle;
            private String summary;
            private String app;
            private String updateMd5;
            private int imgNum;
            private int type;
            /**
             * tag_name : 球鞋
             * type : 1
             * tag_id : 3
             */

            private List<TagBean> tag;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getCid() {
                return cid;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public String getPublishURL() {
                return publishURL;
            }

            public void setPublishURL(String publishURL) {
                this.publishURL = publishURL;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getContentType() {
                return contentType;
            }

            public void setContentType(int contentType) {
                this.contentType = contentType;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTitleFont() {
                return titleFont;
            }

            public void setTitleFont(String titleFont) {
                this.titleFont = titleFont;
            }

            public String getSubTitleFont() {
                return subTitleFont;
            }

            public void setSubTitleFont(String subTitleFont) {
                this.subTitleFont = subTitleFont;
            }

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }

            public String getApp() {
                return app;
            }

            public void setApp(String app) {
                this.app = app;
            }

            public String getUpdateMd5() {
                return updateMd5;
            }

            public void setUpdateMd5(String updateMd5) {
                this.updateMd5 = updateMd5;
            }

            public int getImgNum() {
                return imgNum;
            }

            public void setImgNum(int imgNum) {
                this.imgNum = imgNum;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public List<TagBean> getTag() {
                return tag;
            }

            public void setTag(List<TagBean> tag) {
                this.tag = tag;
            }

            public static class TagBean {
                private String tag_name;
                private int type;
                private String tag_id;

                public String getTag_name() {
                    return tag_name;
                }

                public void setTag_name(String tag_name) {
                    this.tag_name = tag_name;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTag_id() {
                    return tag_id;
                }

                public void setTag_id(String tag_id) {
                    this.tag_id = tag_id;
                }
            }
        }
    }
}
