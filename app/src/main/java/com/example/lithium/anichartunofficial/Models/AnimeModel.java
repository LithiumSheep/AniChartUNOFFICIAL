package com.example.lithium.anichartunofficial.Models;

import com.google.gson.annotations.SerializedName;

public class AnimeModel {

    public AnimeModel(int id, String type, String title, String image_url, int total_eps) {
        this.id = id;
        this.type = type;
        this.title_romanji = title;
        this.image_url_med = image_url;
        this.total_episodes = total_eps;
    }

    @SerializedName("id")
    private int id;

    @SerializedName("type")
    private String type;

    @SerializedName("title_romaji")
    private String title_romanji;

    @SerializedName("image_url_med")
    private String image_url_med;

    @SerializedName("image_url_lge")
    private String image_url_lge;

    @SerializedName("total_episodes")
    private int total_episodes;

    public int getId() {return this.id;}

    public String getType() {return this.type;}

    public String getTitle_romanji() {return this.title_romanji;}

    public String getImage_url_med() {return this.image_url_med;}

    public String getImage_url_lge() {return this.image_url_lge;}

    public int getTotal_episodes() {return this.total_episodes;}
}
