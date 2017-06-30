package com.upzou.weather.bean;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city")
    public String cityName;//城市名

    @SerializedName("id")
    public String weatherId;//城市对应的天气id

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;//天气的更新时间

    }

}
