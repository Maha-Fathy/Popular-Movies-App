package com.example.mahafarhy.popular_movies_app.service.responde;

import com.example.mahafarhy.popular_movies_app.model.Movie;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/**
 * Created by Maha Fathy
 */
public class RespondMovie {
    @SerializedName("results")
    ArrayList<Movie> movies;

    public ArrayList<Movie> getMovies() {
        return movies;
    }
}
