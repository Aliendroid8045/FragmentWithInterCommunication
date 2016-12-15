package com.siva.fragmentcommunicationex;

import android.graphics.Bitmap;

/**
 * Created by Celestial on 23-11-2016.
 */
public interface ListItemEvent {
    public void onItemClicked(String countryName,String countryCapital, int countryFlag);
}
