package lanou.yoho.bean.databean.magazinebean;

import java.util.List;

/**
 * Created by dllo on 16/12/1.
 * 杂志 对应Tab杂志的数据类,第二行
 */
public class TBmagazineBean2 {




    private String status;
    private int code;
    private String message;


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
        private String magId;
        private String shareTitle;
        private int app;
        private String title;
        private String cover;
        private String magType;
        private int deviceType;
        private String journal;
        private String summary;
        private String summarys;
        private String releaseDate;
        private int bytes;
        private double size;
        private int idfbytes;
        private int idfsize;
        private String address;
        private String idfAddress;
        private String description;
        private int isH5;
        /**
         * deviceType : 0
         * sectionId : 1
         * sectionTitle : YOHO!GIRL第114期 | 回到过去和看见未来的酷女孩们
         * sectionThumb : http://static0.myoho.net/2016/11/10/11/ezineimg/ac5146480003de1427587bcd92c4eb8e.jpg?v=1478772130
         * sectionUrl : http://h5api.myoho.net/index.php?r=share/share&magId=10161&secId=1&updateTime=1478772130
         * sectionAddress : http://staticzine.myoho.net/10161/1/1.zip?v=1478772130
         * sectionBytes : 949986
         * sectionSize : 0.91
         * sectionRealBytes : 1170776
         * sharePic : http://static0.myoho.net/2016/11/10/11/ezineimg/7461e75c577781f88014e32780ea831f.jpg?v=1478772130
         */

        private List<MagChapterBean> magChapter;

        public String getMagId() {
            return magId;
        }

        public void setMagId(String magId) {
            this.magId = magId;
        }

        public String getShareTitle() {
            return shareTitle;
        }

        public void setShareTitle(String shareTitle) {
            this.shareTitle = shareTitle;
        }

        public int getApp() {
            return app;
        }

        public void setApp(int app) {
            this.app = app;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getMagType() {
            return magType;
        }

        public void setMagType(String magType) {
            this.magType = magType;
        }

        public int getDeviceType() {
            return deviceType;
        }

        public void setDeviceType(int deviceType) {
            this.deviceType = deviceType;
        }

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getSummarys() {
            return summarys;
        }

        public void setSummarys(String summarys) {
            this.summarys = summarys;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        public int getBytes() {
            return bytes;
        }

        public void setBytes(int bytes) {
            this.bytes = bytes;
        }

        public double getSize() {
            return size;
        }

        public void setSize(double size) {
            this.size = size;
        }

        public int getIdfbytes() {
            return idfbytes;
        }

        public void setIdfbytes(int idfbytes) {
            this.idfbytes = idfbytes;
        }

        public int getIdfsize() {
            return idfsize;
        }

        public void setIdfsize(int idfsize) {
            this.idfsize = idfsize;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getIdfAddress() {
            return idfAddress;
        }

        public void setIdfAddress(String idfAddress) {
            this.idfAddress = idfAddress;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getIsH5() {
            return isH5;
        }

        public void setIsH5(int isH5) {
            this.isH5 = isH5;
        }

        public List<MagChapterBean> getMagChapter() {
            return magChapter;
        }

        public void setMagChapter(List<MagChapterBean> magChapter) {
            this.magChapter = magChapter;
        }

        public static class MagChapterBean {
            private int deviceType;
            private String sectionId;
            private String sectionTitle;
            private String sectionThumb;
            private String sectionUrl;
            private String sectionAddress;
            private String sectionBytes;
            private double sectionSize;
            private String sectionRealBytes;
            private String sharePic;

            public int getDeviceType() {
                return deviceType;
            }

            public void setDeviceType(int deviceType) {
                this.deviceType = deviceType;
            }

            public String getSectionId() {
                return sectionId;
            }

            public void setSectionId(String sectionId) {
                this.sectionId = sectionId;
            }

            public String getSectionTitle() {
                return sectionTitle;
            }

            public void setSectionTitle(String sectionTitle) {
                this.sectionTitle = sectionTitle;
            }

            public String getSectionThumb() {
                return sectionThumb;
            }

            public void setSectionThumb(String sectionThumb) {
                this.sectionThumb = sectionThumb;
            }

            public String getSectionUrl() {
                return sectionUrl;
            }

            public void setSectionUrl(String sectionUrl) {
                this.sectionUrl = sectionUrl;
            }

            public String getSectionAddress() {
                return sectionAddress;
            }

            public void setSectionAddress(String sectionAddress) {
                this.sectionAddress = sectionAddress;
            }

            public String getSectionBytes() {
                return sectionBytes;
            }

            public void setSectionBytes(String sectionBytes) {
                this.sectionBytes = sectionBytes;
            }

            public double getSectionSize() {
                return sectionSize;
            }

            public void setSectionSize(double sectionSize) {
                this.sectionSize = sectionSize;
            }

            public String getSectionRealBytes() {
                return sectionRealBytes;
            }

            public void setSectionRealBytes(String sectionRealBytes) {
                this.sectionRealBytes = sectionRealBytes;
            }

            public String getSharePic() {
                return sharePic;
            }

            public void setSharePic(String sharePic) {
                this.sharePic = sharePic;
            }
        }
    }
}
