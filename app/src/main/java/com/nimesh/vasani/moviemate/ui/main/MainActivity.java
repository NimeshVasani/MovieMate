package com.nimesh.vasani.moviemate.ui.main;

import android.os.Bundle;

import com.nimesh.vasani.moviemate.ui.base.BaseTVActivity;


public class MainActivity extends BaseTVActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addFragment(MainFragment.newInstance());
    }
}
