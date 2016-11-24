package com.example.mahafarhy.popular_movies_app.service.responde;

import com.example.mahafarhy.popular_movies_app.model.Trailer;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class RespondTrailer {
    @SerializedName("results")
    ArrayList<Trailer> trailers;

    public ArrayList<Trailer> getTrailers() {
        return trailers;
    }
}
