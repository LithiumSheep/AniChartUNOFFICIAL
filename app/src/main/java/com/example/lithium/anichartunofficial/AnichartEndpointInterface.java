package com.example.lithium.anichartunofficial;

import com.example.lithium.anichartunofficial.Models.POJOs.AnimeModel;
import com.example.lithium.anichartunofficial.Models.POJOs.TokenModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface AnichartEndpointInterface {

    @POST("auth/access_token")
    Call<TokenModel> getToken(
            @Query("grant_type") String grant,
            @Query("client_id") String id,
            @Query("client_secret") String secret
    );

    @GET("browse/anime")
    Call<List<AnimeModel>> getAiring(
            @Query("access_token") String auth_token,
            @Query("status") String status,
            @Query("type") String type,
            @Query("airing_data") boolean airing_data,
            @Query("full_page") boolean full_page
    );
}
