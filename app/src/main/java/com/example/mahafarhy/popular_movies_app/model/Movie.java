package com.example.mahafarhy.popular_movies_app.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Maha Fathy
 */
public class Movie implements Serializable {
    @SerializedName("id")
    private int id;

    @SerializedName("poster_path")
    private String posterUrl;

    @SerializedName("title")
    private String title;

    @SerializedName("vote_average")
    private double vote;

    @SerializedName("release_date")
    private String releaseDate;

    @SerializedName("overview")
    private String overview;

    public Movie() {
    }

    public Movie(int id, String posterUrl, String title, double vote, String releaseDate, String overview, boolean favorite) {
        this.id = id;
        this.posterUrl = posterUrl;
        this.title = title;
        this.vote = vote;
        this.releaseDate = releaseDate;
        this.overview = overview;
    }

    public String getPosterUrl() {
       if(posterUrl != null) {
           return posterUrl;
       }
        return null;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getVote() {
        return vote;
    }

    public void setVote(double vote) {
        this.vote = vote;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

}
