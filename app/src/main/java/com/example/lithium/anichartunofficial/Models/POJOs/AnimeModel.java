package com.example.lithium.anichartunofficial.Models.POJOs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class AnimeModel {

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
    @SerializedName("image_url_lge")
    @Expose
    private String imageUrlLge;
    @SerializedName("airing_status")
    @Expose
    private String airingStatus;
    @SerializedName("average_score")
    @Expose
    private String averageScore;
    @SerializedName("total_episodes")
    @Expose
    private Integer totalEpisodes;
    @SerializedName("relation_type")
    @Expose
    private Object relationType;
    @SerializedName("role")
    @Expose
    private Object role;
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
    public Integer getTotalEpisodes() {
        return totalEpisodes;
    }

    /**
     *
     * @param totalEpisodes
     * The total_episodes
     */
    public void setTotalEpisodes(Integer totalEpisodes) {
        this.totalEpisodes = totalEpisodes;
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