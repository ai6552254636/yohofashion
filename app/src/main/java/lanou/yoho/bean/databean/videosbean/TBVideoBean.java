package lanou.yoho.bean.databean.videosbean;

import java.util.List;

/**
 * Created by dllo on 16/11/29.
 * 视频的数据类
 */
public class TBVideoBean {



    private String status;
    private int code;


    private DataBean data;
    private String message;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        private int total;
        /**
         * id : 22273
         * cid : 13089
         * create_time : 1480399717
         * publishURL : http://www.yohoboys.com/channel/detail/index/id/13089
         * image : http://img01.yohoboys.com/contentimg/2016/11/29/14/01a878106f9e905a28b3c4bdb0fc91d03d.jpg
         * width : 1180
         * height : 664
         * contentType : 1
         * title : 余文乐用视频亲自告诉你，#玩潮到底#的终极奥义
         * titleFont : c
         * subTitleFont : c
         * subtitle :
         * summary : 期待了辣么久的代言人@余文乐 最新视频终于出炉！新加入YOHO!大家庭的他是如何定义潮流的？看完就有答案！什么？想知道六叔口中的#玩潮到底#究竟是什么？不要急，后天让他亲口告诉你！
         * app : 1
         * updateMd5 : eddd27b8a749141a6daaec5a480ae7cb
         * imgNum : 0
         * type : 1
         * tag : [{"tag_name":"视频","type":1,"tag_id":"0"}]
         * videoUrl : http://video.yohoboys.com/2016/11/29/14/video1480399450813193.mp4
         */

        private List<ContentBean> content;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<ContentBean> getContent() {
            return content;
        }

        public void setContent(List<ContentBean> content) {
            this.content = content;
        }

        public static class ContentBean {
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
            private String videoUrl;
            /**
             * tag_name : 视频
             * type : 1
             * tag_id : 0
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

            public String getVideoUrl() {
                return videoUrl;
            }

            public void setVideoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
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
