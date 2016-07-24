package com.example.lithium.anichartunofficial.Models;

import com.example.lithium.anichartunofficial.Constants.Build;
import com.example.lithium.anichartunofficial.Models.POJOs.AnimeModel;
import com.example.lithium.anichartunofficial.Models.POJOs.TokenModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApplicationModel {

    public Gson gson;
    public Retrofit mRetrofit;

    public TokenModel mToken;
    public boolean hasToken;
    public List<AnimeModel> mAnimeModels;
    public boolean isPopulated;

    private ApplicationModel() {
        gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(Build.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        hasToken = false;
        isPopulated = false;
    }

    public boolean hasToken() {
        return hasToken;
    }

    public boolean isPopulated() {
        return isPopulated;
    }

    private static ApplicationModel instance = new ApplicationModel();
    public static ApplicationModel instance() {
        return instance;
    }
}
