package com.example.lithium.anichartunofficial.Utils;

import com.example.lithium.anichartunofficial.AnichartEndpointInterface;
import com.example.lithium.anichartunofficial.Models.ApplicationModel;
import com.example.lithium.anichartunofficial.Models.POJOs.AnimeModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class AiringUtil {
    public static final String LOG = AiringUtil.class.getSimpleName();

    public static void getAiring(Callback<List<AnimeModel>> request) {
        AnichartEndpointInterface api = ApplicationModel.instance().mRetrofit.create(AnichartEndpointInterface.class);

        Call<List<AnimeModel>> call = api.getAiring(
                ApplicationModel.instance().mToken.getAccessToken(), "currently airing", "tv", true, true
        );
        call.enqueue(request);
    }
}
