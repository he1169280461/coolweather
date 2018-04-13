package com.example.hechang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HE on 2018/4/10.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
