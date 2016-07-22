package com.wanda.creditapp.user.domain;

import com.wanda.creditapp.common.domain.BaseDomain;

public class AccumulationAccount extends BaseDomain {
    private String tabs;

    private String datas;

    /**
     * 所属的用户ID
     */
    private Integer userId;

    /**
     * 记录版本号
     */
    private Integer dataVersion;

    public String getTabs() {
        return tabs;
    }

    public void setTabs(String tabs) {
        this.tabs = tabs == null ? null : tabs.trim();
    }

    public String getDatas() {
        return datas;
    }

    public void setDatas(String datas) {
        this.datas = datas == null ? null : datas.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(Integer dataVersion) {
        this.dataVersion = dataVersion;
    }
}