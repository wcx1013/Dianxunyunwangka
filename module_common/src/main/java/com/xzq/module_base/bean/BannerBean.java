package com.xzq.module_base.bean;

import java.util.List;

public class BannerBean {

    /**
     * status : success
     * data : [{"id":67,"adTypeId":5,"adTitle":"测试图片","materialType":1,"portType":3,"width":null,"height":null,"materialTypeString":"图片","bannerUrl":"https://file.jysydn.com/201912/1577776917120.png","materialUrl":"https://file.jysydn.com/https://file.jysydn.com/","detailsPage":0,"detailsPageString":"无","sort":40,"top":true,"topString":"是","status":0,"statusString":"停用","createTime":"2019-12-31","createTimeString":"2019-12-31 15:22:09","updateTime":"2020-05-09","updateTimeString":"2020-05-09 09:22:05","remark":null,"content":"","adTypeName":"移动端首页","portTypeString":"移动端"},{"id":27,"adTypeId":5,"adTitle":"1","materialType":1,"portType":3,"width":null,"height":null,"materialTypeString":"图片","bannerUrl":"https://file.jysydn.com/201910/1572419047357.png","materialUrl":"https://file.jysydn.com/","detailsPage":0,"detailsPageString":"无","sort":1,"top":false,"topString":"否","status":1,"statusString":"启用","createTime":"2019-10-30","createTimeString":"2019-10-30 15:04:16","updateTime":"2019-12-25","updateTimeString":"2019-12-25 09:25:26","remark":null,"content":"","adTypeName":"移动端首页","portTypeString":"移动端"},{"id":57,"adTypeId":5,"adTitle":"新品","materialType":1,"portType":3,"width":null,"height":null,"materialTypeString":"图片","bannerUrl":"https://file.jysydn.com/201912/1577237346505.png","materialUrl":"https://file.jysydn.com/","detailsPage":0,"detailsPageString":"无","sort":3,"top":false,"topString":"否","status":1,"statusString":"启用","createTime":"2019-12-25","createTimeString":"2019-12-25 09:29:20","updateTime":"2019-12-25","updateTimeString":"2019-12-25 11:43:32","remark":null,"content":"","adTypeName":"移动端首页","portTypeString":"移动端"}]
     */

    private String status;
    private List<DataBean> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 67
         * adTypeId : 5
         * adTitle : 测试图片
         * materialType : 1
         * portType : 3
         * width : null
         * height : null
         * materialTypeString : 图片
         * bannerUrl : https://file.jysydn.com/201912/1577776917120.png
         * materialUrl : https://file.jysydn.com/https://file.jysydn.com/
         * detailsPage : 0
         * detailsPageString : 无
         * sort : 40
         * top : true
         * topString : 是
         * status : 0
         * statusString : 停用
         * createTime : 2019-12-31
         * createTimeString : 2019-12-31 15:22:09
         * updateTime : 2020-05-09
         * updateTimeString : 2020-05-09 09:22:05
         * remark : null
         * content :
         * adTypeName : 移动端首页
         * portTypeString : 移动端
         */

        private int id;
        private int adTypeId;
        private String adTitle;
        private int materialType;
        private int portType;
        private Object width;
        private Object height;
        private String materialTypeString;
        private String bannerUrl;
        private String materialUrl;
        private int detailsPage;
        private String detailsPageString;
        private int sort;
        private boolean top;
        private String topString;
        private int status;
        private String statusString;
        private String createTime;
        private String createTimeString;
        private String updateTime;
        private String updateTimeString;
        private Object remark;
        private String content;
        private String adTypeName;
        private String portTypeString;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAdTypeId() {
            return adTypeId;
        }

        public void setAdTypeId(int adTypeId) {
            this.adTypeId = adTypeId;
        }

        public String getAdTitle() {
            return adTitle;
        }

        public void setAdTitle(String adTitle) {
            this.adTitle = adTitle;
        }

        public int getMaterialType() {
            return materialType;
        }

        public void setMaterialType(int materialType) {
            this.materialType = materialType;
        }

        public int getPortType() {
            return portType;
        }

        public void setPortType(int portType) {
            this.portType = portType;
        }

        public Object getWidth() {
            return width;
        }

        public void setWidth(Object width) {
            this.width = width;
        }

        public Object getHeight() {
            return height;
        }

        public void setHeight(Object height) {
            this.height = height;
        }

        public String getMaterialTypeString() {
            return materialTypeString;
        }

        public void setMaterialTypeString(String materialTypeString) {
            this.materialTypeString = materialTypeString;
        }

        public String getBannerUrl() {
            return bannerUrl;
        }

        public void setBannerUrl(String bannerUrl) {
            this.bannerUrl = bannerUrl;
        }

        public String getMaterialUrl() {
            return materialUrl;
        }

        public void setMaterialUrl(String materialUrl) {
            this.materialUrl = materialUrl;
        }

        public int getDetailsPage() {
            return detailsPage;
        }

        public void setDetailsPage(int detailsPage) {
            this.detailsPage = detailsPage;
        }

        public String getDetailsPageString() {
            return detailsPageString;
        }

        public void setDetailsPageString(String detailsPageString) {
            this.detailsPageString = detailsPageString;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public boolean isTop() {
            return top;
        }

        public void setTop(boolean top) {
            this.top = top;
        }

        public String getTopString() {
            return topString;
        }

        public void setTopString(String topString) {
            this.topString = topString;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getStatusString() {
            return statusString;
        }

        public void setStatusString(String statusString) {
            this.statusString = statusString;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getCreateTimeString() {
            return createTimeString;
        }

        public void setCreateTimeString(String createTimeString) {
            this.createTimeString = createTimeString;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getUpdateTimeString() {
            return updateTimeString;
        }

        public void setUpdateTimeString(String updateTimeString) {
            this.updateTimeString = updateTimeString;
        }

        public Object getRemark() {
            return remark;
        }

        public void setRemark(Object remark) {
            this.remark = remark;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAdTypeName() {
            return adTypeName;
        }

        public void setAdTypeName(String adTypeName) {
            this.adTypeName = adTypeName;
        }

        public String getPortTypeString() {
            return portTypeString;
        }

        public void setPortTypeString(String portTypeString) {
            this.portTypeString = portTypeString;
        }
    }
}
