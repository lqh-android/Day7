package com.lqh.day7.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/7/26.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
