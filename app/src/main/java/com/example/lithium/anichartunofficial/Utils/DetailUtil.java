package com.example.lithium.anichartunofficial.Utils;

import com.example.lithium.anichartunofficial.AnichartEndpointInterface;
import com.example.lithium.anichartunofficial.Models.ApplicationModel;
import com.example.lithium.anichartunofficial.Models.POJOs.AnimeDetailModel;

import retrofit2.Call;
import retrofit2.Callback;

public class DetailUtil {
    public static final String LOG = DetailUtil.class.getSimpleName();

    public static void getDetail(int animeId, Callback<AnimeDetailModel> request) {
        AnichartEndpointInterface api = ApplicationModel.instance().mRetrofit.create(AnichartEndpointInterface.class);

        Call<AnimeDetailModel> call = api.getDetail(animeId, ApplicationModel.instance().mToken.getAccessToken());
        call.enqueue(request);
    }
}
