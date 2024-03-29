package com.nimesh.vasani.moviemate.ui.search;

import android.content.Intent;
import android.os.Bundle;

import androidx.leanback.app.SearchFragment;

import com.nimesh.vasani.moviemate.R;
import com.nimesh.vasani.moviemate.ui.base.BaseTVActivity;


public class SearchActivity extends BaseTVActivity {

    SearchFragment searchFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addFragment(SearchFragment.newInstance(""));
        searchFragment = (SearchFragment) getFragmentManager().findFragmentById(R.id.search_fragment);
    }

    @Override
    public boolean onSearchRequested() {
        startActivity(new Intent(this, SearchActivity.class));
        return true;
    }
}
