package com.example.mahafarhy.popular_movies_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.bumptech.glide.Glide;
import com.example.mahafarhy.popular_movies_app.model.Movie;
import butterknife.Bind;
import butterknife.ButterKnife;



public class DetailFragment extends Fragment {

    Movie movie;

    @Bind(R.id.movieTitle)
        TextView movieTitleTV;
    @Bind(R.id.movieImage)
        ImageView movieImage;
    @Bind(R.id.rateMovie)
        TextView rateMovie;
    @Bind(R.id.movieDate)
        TextView movieDate;
    @Bind(R.id.overviewMovie)
        TextView oveView;
    @Bind(R.id.favoriteToggleBtn)
        ToggleButton favoriteTBtn;

    public static DetailFragment newInstance(Movie movie){
        DetailFragment detailFragment = new DetailFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("movie", movie);
        detailFragment.setArguments(bundle);
        return detailFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            movie = (Movie) getArguments().getSerializable("movie");
        } catch (Exception e) {}
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        ButterKnife.bind(this, view);

        if(movie == null) {
            movie = (Movie) getActivity().getIntent().getSerializableExtra("movie");
        }

        displayMovie(movie);

        return view;
    }

    private void displayMovie(Movie movie) {
        if (movie != null){
            setLayoutForMD();
            getActivity().setTitle(movie.getTitle());
        }
    }

    public void setLayoutForMD() {
        movieTitleTV.setText(movie.getTitle());

        Glide.with(getActivity())
                .load("http://image.tmdb.org/t/p/w185/" + movie.getPosterUrl())
                .asBitmap()
                .centerCrop()
                .into(movieImage);

        rateMovie.setText("Rating : " + movie.getVote());

        movieDate.setText(movie.getReleaseDate().split("-")[0]);

        oveView.setText(movie.getOverview());

    }

}
