package com.nimesh.vasani.moviemate.ui.movie;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.nimesh.vasani.moviemate.R;
import com.nimesh.vasani.moviemate.dagger.modules.HttpClientModule;
import com.nimesh.vasani.moviemate.data.models.Movie;
import com.nimesh.vasani.moviemate.ui.base.BindableCardView;

public class MovieCardView extends BindableCardView<Movie> {

    ImageView mPosterIV;
    TextView title_tv;

    public MovieCardView(Context context) {
        super(context);
        mPosterIV = findViewById(R.id.poster_iv);
        title_tv = findViewById(R.id.title_tv);
    }

    @Override
    protected void bind(Movie movie) {
        Glide.with(getContext())
                .load(HttpClientModule.POSTER_URL + movie.getPosterPath())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(mPosterIV);
        title_tv.setText(movie.getTitle());
    }

    public ImageView getPosterIV() {
        return mPosterIV;
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.card_movie;
    }
}