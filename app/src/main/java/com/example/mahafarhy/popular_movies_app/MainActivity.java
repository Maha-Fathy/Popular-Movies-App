package com.example.mahafarhy.popular_movies_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.mahafarhy.popular_movies_app.model.Movie;
import com.example.mahafarhy.popular_movies_app.service.SetupService;
import com.example.mahafarhy.popular_movies_app.service.responde.RespondMovie;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testGetMovies("popular");
    }

    private void testGetMovies(String type) {
        SetupService.getServiceMovies.getMovies(type).enqueue(new Callback<RespondMovie>() {
            @Override
            public void onResponse(Call<RespondMovie> call, Response<RespondMovie> response) {
                if(response.body() != null) {
                    ArrayList<Movie> resopnedMovies = response.body().getMovies();
                    Log.d("test", resopnedMovies.size() + "");
                    for (int i = 0; i < resopnedMovies.size(); i++) {
                        Log.d("test", resopnedMovies.get(i).getTitle());
                    }
                }
            }

            @Override
            public void onFailure(Call<RespondMovie> call, Throwable t) {}
        });
    }
}
