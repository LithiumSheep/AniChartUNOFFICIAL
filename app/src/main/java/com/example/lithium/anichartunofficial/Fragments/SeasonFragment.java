package com.example.lithium.anichartunofficial.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.lithium.anichartunofficial.R;

public class SeasonFragment extends Fragment {

    private ProgressBar mProgressBar;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_season, container, false);
        mProgressBar = (ProgressBar) root.findViewById(R.id.season_feed_progressbar);
        mProgressBar.setVisibility(View.VISIBLE);


        return root;
    }

    public void populateView() {

    }

}
