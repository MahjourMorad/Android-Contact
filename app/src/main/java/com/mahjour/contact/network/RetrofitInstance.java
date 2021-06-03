package com.mahjour.contact.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static Retrofit retrofit;
    private static final String BASE_URL = "http://192.168.43.54:8090";
    public static Retrofit getInstance(){       if(retrofit==null)       {
    retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();}
    return retrofit;
    }}

