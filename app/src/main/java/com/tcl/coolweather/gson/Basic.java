package com.tcl.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 404664 on 2017/8/22.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
