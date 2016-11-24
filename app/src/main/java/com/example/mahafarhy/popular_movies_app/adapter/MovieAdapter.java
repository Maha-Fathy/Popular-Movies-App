package com.example.mahafarhy.popular_movies_app.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.mahafarhy.popular_movies_app.R;
import com.example.mahafarhy.popular_movies_app.adapter.viewholder.MovieViewHolder;
import com.example.mahafarhy.popular_movies_app.model.Movie;
import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {

    ArrayList<Movie> movies;
    Activity movieActivity;

    public MovieAdapter(Activity activity, ArrayList<Movie> movies) {
        super();
        this.movies = movies;
        this.movieActivity = activity;
    }


    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MovieViewHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_movie,null), movieActivity);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        holder.setMovieView(movies.get(position));
    }

    @Override
    public int getItemCount(){
        if(movies != null) return movies.size();
        else return 0;
    }
}
