package com.example.lithium.anichartunofficial.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lithium.anichartunofficial.Adapters.AnimeModelAdapter;
import com.example.lithium.anichartunofficial.Models.AnimeModel;
import com.example.lithium.anichartunofficial.R;
import com.example.lithium.anichartunofficial.Utils.SeasonYearUtil;

import java.util.ArrayList;
import java.util.List;

public class AiringFragment extends Fragment {

    private Context mContext;
    private Toolbar mToolbar;
    private RecyclerView mRecyclerView;
    private List<AnimeModel> mAnimeModels;

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

        return root;
    }

    private void setupRecycler(RecyclerView recycler) {
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        recycler.setLayoutManager(llm);

        initializeData();

        AnimeModelAdapter adapter = new AnimeModelAdapter(mContext, mAnimeModels);
        recycler.setAdapter(adapter);
    }

    private void initializeData() {
        mAnimeModels = new ArrayList<>();

        mAnimeModels.add(new AnimeModel(1, "Comic", "Calvin and Hobbes", "someURL", 24));
        mAnimeModels.add(new AnimeModel(1, "Comic", "Calvin and Hobbes", "someURL", 24));
        mAnimeModels.add(new AnimeModel(1, "Comic", "Calvin and Hobbes", "someURL", 24));
        mAnimeModels.add(new AnimeModel(1, "Comic", "Calvin and Hobbes", "someURL", 24));
        mAnimeModels.add(new AnimeModel(1, "Comic", "Calvin and Hobbes", "someURL", 24));
        mAnimeModels.add(new AnimeModel(1, "Comic", "Calvin and Hobbes", "someURL", 24));
        mAnimeModels.add(new AnimeModel(1, "Comic", "Calvin and Hobbes", "someURL", 24));
    }
}
