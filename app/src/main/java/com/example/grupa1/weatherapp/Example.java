package com.example.grupa1.weatherapp;

public class Example {
    public class Example {


        @SerializedName("weather")
        @Expose
        private List<Weather> weather = null;


        public class Weather {

            @SerializedName("main")
            @Expose
            private String main;
            @SerializedName("description")
            @Expose
            private String description;
        }
}
