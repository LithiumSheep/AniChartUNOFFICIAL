package com.example.lithium.anichartunofficial.Utils;

import com.example.lithium.anichartunofficial.AnichartEndpointInterface;
import com.example.lithium.anichartunofficial.Constants.Build;
import com.example.lithium.anichartunofficial.Models.ApplicationModel;
import com.example.lithium.anichartunofficial.Models.POJOs.TokenModel;

import retrofit2.Call;
import retrofit2.Callback;

public class AuthTokenUtil {
    public static final String LOG = AuthTokenUtil.class.getSimpleName();

    /**
     * Not working as intended!  expires value is not similar to System.currentTimeMillis()
     * @return
     */
    public static boolean isTokenValid() {
        if (ApplicationModel.instance().hasToken()) {
            LoggerUtil.debug(LOG, "token expire is " + ApplicationModel.instance().mToken.getExpires());
            long time = System.currentTimeMillis();
            LoggerUtil.debug(LOG, "current time is " + time);

            return ApplicationModel.instance().mToken.getExpires() > time; //expires time has not been reached yet
        }
        return false;
    }

    public static void getToken(Callback<TokenModel> request) {
        AnichartEndpointInterface api = ApplicationModel.instance().mRetrofit.create(AnichartEndpointInterface.class);

        Call<TokenModel> call = api.getToken(Build.grant_type, Build.client_id, Build.client_secret);
        call.enqueue(request);
    }
}
