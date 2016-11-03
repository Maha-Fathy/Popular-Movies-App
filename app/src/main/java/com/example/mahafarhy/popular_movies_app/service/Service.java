package com.example.mahafarhy.popular_movies_app.service;


import com.example.mahafarhy.popular_movies_app.service.responde.RespondMovie;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Maha Fathy
 */
public interface Service {

    @GET("{type}?api_key=" + Constant.API_KEY)
    Call<RespondMovie> getMovies(@Path("type") String type);

}
