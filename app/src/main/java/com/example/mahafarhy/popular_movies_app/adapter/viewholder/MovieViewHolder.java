package com.example.mahafarhy.popular_movies_app.adapter.viewholder;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.example.mahafarhy.popular_movies_app.DetailActivity;
import com.example.mahafarhy.popular_movies_app.DetailFragment;
import com.example.mahafarhy.popular_movies_app.R;
import com.example.mahafarhy.popular_movies_app.model.Movie;
import butterknife.Bind;
import butterknife.ButterKnife;

public class MovieViewHolder extends RecyclerView.ViewHolder {

    Activity activity;

    @Bind(R.id.movieImage)
    ImageView posterIV;

    public MovieViewHolder(View itemView, Activity activity) {
        super(itemView);
        this.activity = activity;
        ButterKnife.bind(this, itemView);
    }

    public void setMovieView(Movie movieView){
        if (posterIV != null){
            Glide.with(activity)
                    .load("http://image.tmdb.org/t/p/w185/" + movieView.getPosterUrl())
                    .asBitmap()
                    .into(posterIV);

            setActionOnItem(movieView);
        }
    }

    private void setActionOnItem(final Movie movie) {
        posterIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(activity.findViewById(R.id.detailContainer) != null) {
                    ((AppCompatActivity)activity).getSupportFragmentManager()
                            .beginTransaction().replace(R.id.detailContainer, DetailFragment.newInstance(movie)).commit();
                } else {
                    Intent intent = new Intent(activity, DetailActivity.class).putExtra("movie",  movie);
                    activity.startActivity(intent);
                }
            }
        });
    }
}
