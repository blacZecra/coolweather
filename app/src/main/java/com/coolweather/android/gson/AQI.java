package com.coolweather.android.gson;

/**
 * Created by hasee on 2017/8/25.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
