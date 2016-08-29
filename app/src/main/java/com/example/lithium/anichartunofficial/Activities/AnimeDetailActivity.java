package com.example.lithium.anichartunofficial.Activities;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.lithium.anichartunofficial.Models.POJOs.AiringModel;
import com.example.lithium.anichartunofficial.Models.POJOs.AnimeDetailModel;
import com.example.lithium.anichartunofficial.R;
import com.example.lithium.anichartunofficial.Utils.AuthTokenUtil;
import com.example.lithium.anichartunofficial.Utils.DetailUtil;
import com.example.lithium.anichartunofficial.Utils.LoggerUtil;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AnimeDetailActivity extends AppCompatActivity {
    public static final String LOG = AnimeDetailActivity.class.getSimpleName();

    private Toolbar mToolbar;
    private ProgressBar mProgress;
    private Intent mIntent;
    private int animeId;
    private AnimeDetailModel mModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_detail);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        mProgress = (ProgressBar) findViewById(R.id.progressbar);

        mIntent = getIntent();
        animeId = mIntent.getIntExtra("animeId", -1);

        fetch();
    }

    private void fetch() {
        if (AuthTokenUtil.isTokenValid()) {
            LoggerUtil.debug(LOG, "token is still valid, go straight to fetchDetail");
            fetchDetail();
        } else {
            //get a new token
            fetchDetail();
        }
    }

    private void fetchDetail() {
        DetailUtil.getDetail(animeId, new Callback<AnimeDetailModel>() {
            @Override
            public void onResponse(Call<AnimeDetailModel> call, Response<AnimeDetailModel> response) {
                if (response.code() == 200) {
                    LoggerUtil.debug(LOG, "Detail GET success");
                    mModel = response.body();

                    setupDetails();
                } else {
                    LoggerUtil.debug(LOG, "GET anime/{id} responded, but not with 200");
                }
            }

            @Override
            public void onFailure(Call<AnimeDetailModel> call, Throwable t) {
                LoggerUtil.debug(LOG, "Detail GET failed");
            }
        });
    }

    private void setupDetails() {
        mProgress.setVisibility(View.GONE);
        mToolbar.setTitle(mModel.getTitleRomaji());
        ImageView banner = (ImageView) findViewById(R.id.detail_banner_image);
        ImageView thumbnail = (ImageView) findViewById(R.id.detail_thumbnail_image);
        TextView title = (TextView) findViewById(R.id.detail_title);

        final TextView countdown = (TextView) findViewById(R.id.detail_countdown);
        TextView type = (TextView) findViewById(R.id.detail_stat_type);
        TextView num = (TextView) findViewById(R.id.detail_stat_number);
        TextView duration = (TextView) findViewById(R.id.detail_stat_duration);
        TextView description = (TextView) findViewById(R.id.detail_description);
        TextView genres = (TextView) findViewById(R.id.detail_genres);

        Button youtubeButton = (Button) findViewById(R.id.detail_button_youtube);

        Picasso.with(this)
                .load(mModel.getImageUrlBanner())
                .into(banner);
        Picasso.with(this)
                .load(mModel.getImageUrlLge())
                .into(thumbnail);
        title.setText(mModel.getTitleRomaji());

        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                countdown.setText("EP" + mModel.getAiring().getNextEpisode()
                        + "   00:00:00:" + millisUntilFinished / 1000);
                //here you can have your logic to set text to edittext
            }

            public void onFinish() {
                countdown.setText("done!");
            }

        }.start();

        type.setText(mModel.getType());
        if (mModel.getTotalEpisodes() != null) {
            num.setText(mModel.getTotalEpisodes().toString());
        }
        if (mModel.getDuration() != null) {
            duration.setText(mModel.getDuration().toString());
        }

        description.setText(Html.fromHtml(mModel.getDescription()).toString());
        genres.setText(TextUtils.join(", ", mModel.getGenres()));

        youtubeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + mModel.getYoutubeId()));
                    startActivity(intent);
                } catch (ActivityNotFoundException ex) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.youtube.com/watch?v=" + mModel.getYoutubeId()));
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
