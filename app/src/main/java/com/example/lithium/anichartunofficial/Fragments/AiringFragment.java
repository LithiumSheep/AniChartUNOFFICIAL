package com.example.lithium.anichartunofficial.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lithium.anichartunofficial.Adapters.AnimeModelAdapter;
import com.example.lithium.anichartunofficial.Models.ApplicationModel;
import com.example.lithium.anichartunofficial.Models.POJOs.AnimeModel;
import com.example.lithium.anichartunofficial.Models.POJOs.TokenModel;
import com.example.lithium.anichartunofficial.R;
import com.example.lithium.anichartunofficial.Utils.AiringUtil;
import com.example.lithium.anichartunofficial.Utils.AuthTokenUtil;
import com.example.lithium.anichartunofficial.Utils.LoggerUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AiringFragment extends Fragment {
    public static final String LOG = AiringFragment.class.getSimpleName();

    private Context mContext;
    private Toolbar mToolbar;
    private RecyclerView mRecyclerView;
    private List<AnimeModel> mAnimeModels;
    private AnimeModelAdapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_airing, container, false);
        mContext = this.getActivity();

        /*mToolbar = (Toolbar) root.findViewById(R.id.toolbar);
        mToolbar.setTitle("Airing Fragment");*/

        mRecyclerView = (RecyclerView) root.findViewById(R.id.recycler);
        setupRecycler(mRecyclerView);
        fetch();

        return root;
    }

    private void setupRecycler(RecyclerView recycler) {
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        recycler.setLayoutManager(llm);

        mAnimeModels = new ArrayList<>();
        mAdapter = new AnimeModelAdapter(mContext, mAnimeModels);
        recycler.setAdapter(mAdapter);//SHOULD BE AN EMPTY ADAPTER
    }

    private void setupAdapter() {
        /**
         * sort list here? currently alphabetical order
         */
        Collections.sort(ApplicationModel.instance().mAnimeModels, new Comparator<AnimeModel>()
        {
            @Override
            public int compare(AnimeModel modelA, AnimeModel modelB)
            {
                return modelA.getTitleEnglish().compareToIgnoreCase(modelB.getTitleEnglish());
            }
        });

        mAdapter = new AnimeModelAdapter(mContext, ApplicationModel.instance().mAnimeModels);
        mAdapter.notifyDataSetChanged();
        mRecyclerView.setAdapter(mAdapter);
    }

    private void fetch() {
        if (ApplicationModel.instance().isPopulated()) {
            setupAdapter();
            return;
        }
        if (AuthTokenUtil.isTokenValid()) {
            LoggerUtil.debug(LOG, "token is still valid, go straight to fetchAiring");
            fetchAiring();
        } else {
            AuthTokenUtil.getToken(new Callback<TokenModel>() {
                @Override
                public void onResponse(Call<TokenModel> call, Response<TokenModel> response) {
                    LoggerUtil.debug(LOG, "Token POST success");
                    ApplicationModel.instance().mToken = response.body();
                    ApplicationModel.instance().hasToken = true;
                    fetchAiring();
                }

                @Override
                public void onFailure(Call<TokenModel> call, Throwable t) {
                    LoggerUtil.debug(LOG, "Token POST failed");
                }
            });
        }
    }

    private void fetchAiring() {
        AiringUtil.getAiring(new Callback<List<AnimeModel>>() {
            @Override
            public void onResponse(Call<List<AnimeModel>> call, Response<List<AnimeModel>> response) {
                if (response.code() == 200) {
                    LoggerUtil.debug(LOG, "Airing GET success");
                    ApplicationModel.instance().mAnimeModels = response.body();
                    ApplicationModel.instance().isPopulated = true;

                    setupAdapter();
                } else {
                    LoggerUtil.debug(LOG, "GET browse/anime responded, but not with 200");
                }
            }

            @Override
            public void onFailure(Call<List<AnimeModel>> call, Throwable t) {
                LoggerUtil.debug(LOG, "Airing GET failed");
            }
        });
    }
}
