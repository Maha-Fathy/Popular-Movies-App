package com.example.mahafarhy.popular_movies_app.service.responde;

import com.example.mahafarhy.popular_movies_app.model.Review;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class RespondReview {
    @SerializedName("results")
    ArrayList<Review> reviews;

    public ArrayList<Review> getReviews() {
        return reviews;
    }
}
