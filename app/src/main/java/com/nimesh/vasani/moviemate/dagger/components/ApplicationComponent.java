package com.nimesh.vasani.moviemate.dagger.components;


import com.nimesh.vasani.moviemate.App;
import com.nimesh.vasani.moviemate.dagger.AppScope;
import com.nimesh.vasani.moviemate.dagger.modules.ApplicationModule;
import com.nimesh.vasani.moviemate.dagger.modules.HttpClientModule;
import com.nimesh.vasani.moviemate.ui.detail.DetailFragment;
import com.nimesh.vasani.moviemate.ui.main.MainFragment;
import com.nimesh.vasani.moviemate.ui.search.SearchFragment;

import javax.inject.Singleton;

import dagger.Component;

@AppScope
@Singleton
@Component(modules = {
        ApplicationModule.class,
        HttpClientModule.class,
})
public interface ApplicationComponent {

    void inject(App app);

    void inject(MainFragment mainFragment);

    void inject(DetailFragment movieDetailsFragment);

    void inject(SearchFragment searchFragment);
}
