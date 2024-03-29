package com.nimesh.vasani.moviemate;


import android.app.Application;

import com.nimesh.vasani.moviemate.dagger.components.ApplicationComponent;

import com.nimesh.vasani.moviemate.dagger.components.DaggerApplicationComponent;
import com.nimesh.vasani.moviemate.dagger.modules.ApplicationModule;
import com.nimesh.vasani.moviemate.dagger.modules.HttpClientModule;

public class App extends Application {

    private static App instance;
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        // Creates Dagger Graph
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .httpClientModule(new HttpClientModule())
                .build();

        applicationComponent.inject(this);
    }

    public static App instance() {
        return instance;
    }

    public ApplicationComponent appComponent() {
        return applicationComponent;
    }
}
