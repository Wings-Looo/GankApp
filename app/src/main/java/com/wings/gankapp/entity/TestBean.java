package com.wings.gankapp.entity;

import java.util.List;

/**
 * Created by wings on 2017/3/30.
 */

public class TestBean {

    @Override
    public String toString() {
        return "TestBean{" +
                "error=" + error +
                ", results=" + results +
                '}';
    }

    /**
     * error : false
     * results : [{"_id":"56cc6d29421aa95caa708236","createdAt":"2016-01-28T07:50:39.415Z","desc":"1.29","publishedAt":"2016-01-29T04:18:12.684Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1f0f9fkzu78j20f00qo0xl.jpg","used":true,"who":"张涵宇"}]
     */



    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 56cc6d29421aa95caa708236
         * createdAt : 2016-01-28T07:50:39.415Z
         * desc : 1.29
         * publishedAt : 2016-01-29T04:18:12.684Z
         * type : 福利
         * url : http://ww4.sinaimg.cn/large/7a8aed7bjw1f0f9fkzu78j20f00qo0xl.jpg
         * used : true
         * who : 张涵宇
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }

        @Override
        public String toString() {
            return "ResultsBean{" +
                    "_id='" + _id + '\'' +
                    ", createdAt='" + createdAt + '\'' +
                    ", desc='" + desc + '\'' +
                    ", publishedAt='" + publishedAt + '\'' +
                    ", type='" + type + '\'' +
                    ", url='" + url + '\'' +
                    ", used=" + used +
                    ", who='" + who + '\'' +
                    '}';
        }
    }
}
