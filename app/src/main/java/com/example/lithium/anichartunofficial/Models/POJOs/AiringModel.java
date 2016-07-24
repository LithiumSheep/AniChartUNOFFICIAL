package com.example.lithium.anichartunofficial.Models.POJOs;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class AiringModel {

    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("countdown")
    @Expose
    private Integer countdown;
    @SerializedName("next_episode")
    @Expose
    private Integer nextEpisode;

    /**
     *
     * @return
     * The time
     */
    public String getTime() {
        return time;
    }

    /**
     *
     * @param time
     * The time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     *
     * @return
     * The countdown
     */
    public Integer getCountdown() {
        return countdown;
    }

    /**
     *
     * @param countdown
     * The countdown
     */
    public void setCountdown(Integer countdown) {
        this.countdown = countdown;
    }

    /**
     *
     * @return
     * The nextEpisode
     */
    public Integer getNextEpisode() {
        return nextEpisode;
    }

    /**
     *
     * @param nextEpisode
     * The next_episode
     */
    public void setNextEpisode(Integer nextEpisode) {
        this.nextEpisode = nextEpisode;
    }

}
