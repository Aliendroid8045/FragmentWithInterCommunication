package com.siva.fragmentcommunicationex;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity implements ListItemEvent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onItemClicked(String countryName, String countryCapital, int countryFlag) {
        FragmentManager manager = getFragmentManager();
        Country_DetailFragment detailFragment = (Country_DetailFragment) manager.findFragmentById(R.id.fragmentTwo);
        detailFragment.setCountryName(countryName, countryCapital, countryFlag);
    }
}
