package com.lqh.day7.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017/7/27.
 */

public class BingPic {

    @SerializedName("images")
    public List<BaseBingPic> bingPicList;

    public class BaseBingPic {
        @SerializedName("url")
        public String bingUrl;


    }
}
