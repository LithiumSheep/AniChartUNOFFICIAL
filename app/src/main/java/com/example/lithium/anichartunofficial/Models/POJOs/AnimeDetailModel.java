package com.example.lithium.anichartunofficial.Models.POJOs;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AnimeDetailModel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title_romaji")
    @Expose
    private String titleRomaji;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("image_url_med")
    @Expose
    private String imageUrlMed;
    @SerializedName("image_url_sml")
    @Expose
    private String imageUrlSml;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("end_date")
    @Expose
    private Object endDate;
    @SerializedName("classification")
    @Expose
    private Object classification;
    @SerializedName("hashtag")
    @Expose
    private String hashtag;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("adult")
    @Expose
    private Boolean adult;
    @SerializedName("popularity")
    @Expose
    private Integer popularity;
    @SerializedName("title_japanese")
    @Expose
    private String titleJapanese;
    @SerializedName("title_english")
    @Expose
    private String titleEnglish;
    @SerializedName("synonyms")
    @Expose
    private List<Object> synonyms = new ArrayList<Object>();
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("image_url_lge")
    @Expose
    private String imageUrlLge;
    @SerializedName("image_url_banner")
    @Expose
    private String imageUrlBanner;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("airing_status")
    @Expose
    private String airingStatus;
    @SerializedName("average_score")
    @Expose
    private String averageScore;
    @SerializedName("total_episodes")
    @Expose
    private Object totalEpisodes;
    @SerializedName("youtube_id")
    @Expose
    private String youtubeId;
    @SerializedName("relation_type")
    @Expose
    private Object relationType;
    @SerializedName("role")
    @Expose
    private Object role;
    /*@SerializedName("list_stats")
    @Expose
    private ListStats listStats;*/
    @SerializedName("genres")
    @Expose
    private List<String> genres = new ArrayList<String>();
    @SerializedName("airing")
    @Expose
    private AiringModel airing;

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The titleRomaji
     */
    public String getTitleRomaji() {
        return titleRomaji;
    }

    /**
     *
     * @param titleRomaji
     * The title_romaji
     */
    public void setTitleRomaji(String titleRomaji) {
        this.titleRomaji = titleRomaji;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The imageUrlMed
     */
    public String getImageUrlMed() {
        return imageUrlMed;
    }

    /**
     *
     * @param imageUrlMed
     * The image_url_med
     */
    public void setImageUrlMed(String imageUrlMed) {
        this.imageUrlMed = imageUrlMed;
    }

    /**
     *
     * @return
     * The imageUrlSml
     */
    public String getImageUrlSml() {
        return imageUrlSml;
    }

    /**
     *
     * @param imageUrlSml
     * The image_url_sml
     */
    public void setImageUrlSml(String imageUrlSml) {
        this.imageUrlSml = imageUrlSml;
    }

    /**
     *
     * @return
     * The startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     *
     * @param startDate
     * The start_date
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     *
     * @return
     * The endDate
     */
    public Object getEndDate() {
        return endDate;
    }

    /**
     *
     * @param endDate
     * The end_date
     */
    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    /**
     *
     * @return
     * The classification
     */
    public Object getClassification() {
        return classification;
    }

    /**
     *
     * @param classification
     * The classification
     */
    public void setClassification(Object classification) {
        this.classification = classification;
    }

    /**
     *
     * @return
     * The hashtag
     */
    public String getHashtag() {
        return hashtag;
    }

    /**
     *
     * @param hashtag
     * The hashtag
     */
    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    /**
     *
     * @return
     * The source
     */
    public String getSource() {
        return source;
    }

    /**
     *
     * @param source
     * The source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     *
     * @return
     * The adult
     */
    public Boolean getAdult() {
        return adult;
    }

    /**
     *
     * @param adult
     * The adult
     */
    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    /**
     *
     * @return
     * The popularity
     */
    public Integer getPopularity() {
        return popularity;
    }

    /**
     *
     * @param popularity
     * The popularity
     */
    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    /**
     *
     * @return
     * The titleJapanese
     */
    public String getTitleJapanese() {
        return titleJapanese;
    }

    /**
     *
     * @param titleJapanese
     * The title_japanese
     */
    public void setTitleJapanese(String titleJapanese) {
        this.titleJapanese = titleJapanese;
    }

    /**
     *
     * @return
     * The titleEnglish
     */
    public String getTitleEnglish() {
        return titleEnglish;
    }

    /**
     *
     * @param titleEnglish
     * The title_english
     */
    public void setTitleEnglish(String titleEnglish) {
        this.titleEnglish = titleEnglish;
    }

    /**
     *
     * @return
     * The synonyms
     */
    public List<Object> getSynonyms() {
        return synonyms;
    }

    /**
     *
     * @param synonyms
     * The synonyms
     */
    public void setSynonyms(List<Object> synonyms) {
        this.synonyms = synonyms;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The imageUrlLge
     */
    public String getImageUrlLge() {
        return imageUrlLge;
    }

    /**
     *
     * @param imageUrlLge
     * The image_url_lge
     */
    public void setImageUrlLge(String imageUrlLge) {
        this.imageUrlLge = imageUrlLge;
    }

    /**
     *
     * @return
     * The imageUrlBanner
     */
    public String getImageUrlBanner() {
        return imageUrlBanner;
    }

    /**
     *
     * @param imageUrlBanner
     * The image_url_banner
     */
    public void setImageUrlBanner(String imageUrlBanner) {
        this.imageUrlBanner = imageUrlBanner;
    }

    /**
     *
     * @return
     * The duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     *
     * @param duration
     * The duration
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     *
     * @return
     * The airingStatus
     */
    public String getAiringStatus() {
        return airingStatus;
    }

    /**
     *
     * @param airingStatus
     * The airing_status
     */
    public void setAiringStatus(String airingStatus) {
        this.airingStatus = airingStatus;
    }

    /**
     *
     * @return
     * The averageScore
     */
    public String getAverageScore() {
        return averageScore;
    }

    /**
     *
     * @param averageScore
     * The average_score
     */
    public void setAverageScore(String averageScore) {
        this.averageScore = averageScore;
    }

    /**
     *
     * @return
     * The totalEpisodes
     */
    public Object getTotalEpisodes() {
        return totalEpisodes;
    }

    /**
     *
     * @param totalEpisodes
     * The total_episodes
     */
    public void setTotalEpisodes(Object totalEpisodes) {
        this.totalEpisodes = totalEpisodes;
    }

    /**
     *
     * @return
     * The youtubeId
     */
    public String getYoutubeId() {
        return youtubeId;
    }

    /**
     *
     * @param youtubeId
     * The youtube_id
     */
    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    /**
     *
     * @return
     * The relationType
     */
    public Object getRelationType() {
        return relationType;
    }

    /**
     *
     * @param relationType
     * The relation_type
     */
    public void setRelationType(Object relationType) {
        this.relationType = relationType;
    }

    /**
     *
     * @return
     * The role
     */
    public Object getRole() {
        return role;
    }

    /**
     *
     * @param role
     * The role
     */
    public void setRole(Object role) {
        this.role = role;
    }
/*
    *//**
     *
     * @return
     * The listStats
     *//*
    public ListStats getListStats() {
        return listStats;
    }

    *//**
     *
     * @param listStats
     * The list_stats
     *//*
    public void setListStats(ListStats listStats) {
        this.listStats = listStats;
    }*/

    /**
     *
     * @return
     * The genres
     */
    public List<String> getGenres() {
        return genres;
    }

    /**
     *
     * @param genres
     * The genres
     */
    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    /**
     *
     * @return
     * The airing
     */
    public AiringModel getAiring() {
        return airing;
    }

    /**
     *
     * @param airing
     * The airing
     */
    public void setAiring(AiringModel airing) {
        this.airing = airing;
    }

}
