package com.nimesh.vasani.moviemate.ui.detail;

import android.os.Bundle;
import androidx.core.content.ContextCompat;


import com.nimesh.vasani.moviemate.R;
import com.nimesh.vasani.moviemate.ui.detail.DetailFragment;
import com.nimesh.vasani.moviemate.dagger.modules.HttpClientModule;
import com.nimesh.vasani.moviemate.data.models.Movie;
import com.nimesh.vasani.moviemate.ui.base.BaseTVActivity;
import com.nimesh.vasani.moviemate.ui.base.GlideBackgroundManager;


public class DetailActivity extends BaseTVActivity {

    GlideBackgroundManager glideBackgroundManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Movie movie = getIntent().getExtras().getParcelable(Movie.class.getSimpleName());
        DetailFragment detailsFragment = DetailFragment.newInstance(movie);
        addFragment(detailsFragment);

        glideBackgroundManager = new GlideBackgroundManager(this);
        if (movie != null && movie.getBackdropPath() != null) {
            glideBackgroundManager.loadImage(HttpClientModule.BACKDROP_URL + movie.getBackdropPath());
        } else {
            glideBackgroundManager.setBackground(ContextCompat.getDrawable(this, R.drawable.material_bg));
        }
    }
}
