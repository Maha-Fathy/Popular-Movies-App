package com.example.mahafarhy.popular_movies_app.service;

import com.example.mahafarhy.popular_movies_app.service.responde.RespondMovie;
import com.example.mahafarhy.popular_movies_app.service.responde.RespondReview;
import com.example.mahafarhy.popular_movies_app.service.responde.RespondTrailer;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Service {

    @GET("{type}?api_key=" + Constant.API_KEY)
    Call<RespondMovie> getMovies(@Path("type") String type);

    @GET("{id}/reviews?api_key=" + Constant.API_KEY)
    Call<RespondReview> getReviwes(@Path("id") int id);

    @GET("{id}/videos?api_key=" + Constant.API_KEY)
    Call<RespondTrailer> getTrailer(@Path("id") int id);
}
