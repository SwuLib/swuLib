package com.heart.dto;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/7.
 */
public class PhotoDto implements Serializable {

    private int pId;
    private int pType;
    private String pName;
    private String pUrl;
    private String pContont;
    private String pDate;

    public int getpType() {
        return pType;
    }
    public void setpType(int pType) {
        this.pType = pType;
    }
    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpUrl() {
        return pUrl;
    }

    public void setpUrl(String pUrl) {
        this.pUrl = pUrl;
    }

    public String getpContont() {
        return pContont;
    }

    public void setpContont(String pContont) {
        this.pContont = pContont;
    }

    public String getpDate() {
        return pDate;
    }

    public void setpDate(String pDate) {
        this.pDate = pDate;
    }
}
