package lanou.yoho.bean.databean.databean;

import java.util.List;

/**
 * Created by dllo on 16/11/28.
 *栏目 最上面评论的数据类
 */
public class CommentBean {



    private String status;
    private int code;


    private DataBean1 data;
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

    public DataBean1 getData() {
        return data;
    }

    public void setData(DataBean1 data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean1 {
        private String banner;
        private String title;
        private String description;
        private String answers;
        /**
         * id : 2407
         * uid : 35892336
         * img : []
         * question : 推荐几款休闲鞋子，价格不要太贵,学生党👟
         * answer : 那大夫就推荐一些平价好搭的休闲鞋子给你，VANS Old Skool 、VANS Sk8-Hi、Converse Chuck Taylor 1970s All Star  、Converse PL 76 、adidas Originals  Stan Smith、adidas Originals Superstar， Nike Air Force 1、PUMA Suede等，以上大多是帆布鞋和板鞋希望可以帮助到你。
         * createtime : 1480146024
         * replytime : 1480301315
         * token : BF23E18F-47AB-435A-9AF2-79AAD2B434D1
         * num : 547
         * headpic : http://wx.qlogo.cn/mmopen/tP4e89ZvYdGtqPzqH16t6mGMc5PBJXonETNFoSXc5ycTrxzuhic3qaibqgC1Yf91x9nL7iaDmwClnqf7AX0yD8XXpiaRiblpLVIFu/0
         * nick : 可乐223d3e4
         * source : wechat
         * share : http://new.yohoboys.com/channel/shosedoctor/index/id/2407
         * type : 0
         */

        private List<DataBean2> data;

        public String getBanner() {
            return banner;
        }

        public void setBanner(String banner) {
            this.banner = banner;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getAnswers() {
            return answers;
        }

        public void setAnswers(String answers) {
            this.answers = answers;
        }

        public List<DataBean2> getData() {
            return data;
        }

        public void setData(List<DataBean2> data) {
            this.data = data;
        }

        public static class DataBean2 {
            private String id;
            private String uid;
            private String question;
            private String answer;
            private String createtime;
            private String replytime;
            private String token;
            private String num;
            private String headpic;
            private String nick;
            private String source;
            private String share;
            private int type;
            private List<?> img;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getQuestion() {
                return question;
            }

            public void setQuestion(String question) {
                this.question = question;
            }

            public String getAnswer() {
                return answer;
            }

            public void setAnswer(String answer) {
                this.answer = answer;
            }

            public String getCreatetime() {
                return createtime;
            }

            public void setCreatetime(String createtime) {
                this.createtime = createtime;
            }

            public String getReplytime() {
                return replytime;
            }

            public void setReplytime(String replytime) {
                this.replytime = replytime;
            }

            public String getToken() {
                return token;
            }

            public void setToken(String token) {
                this.token = token;
            }

            public String getNum() {
                return num;
            }

            public void setNum(String num) {
                this.num = num;
            }

            public String getHeadpic() {
                return headpic;
            }

            public void setHeadpic(String headpic) {
                this.headpic = headpic;
            }

            public String getNick() {
                return nick;
            }

            public void setNick(String nick) {
                this.nick = nick;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getShare() {
                return share;
            }

            public void setShare(String share) {
                this.share = share;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public List<?> getImg() {
                return img;
            }

            public void setImg(List<?> img) {
                this.img = img;
            }
        }
    }
}
