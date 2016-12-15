package com.siva.fragmentcommunicationex;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Country_DetailFragment extends Fragment {

    TextView textViewCountryName;
    TextView capital;
    ImageView ivCountryFlag;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_country__detail, container, false);

        textViewCountryName = (TextView) view.findViewById(R.id.etCountryName);
        capital = (TextView) view.findViewById(R.id.etCapitalName);
        ivCountryFlag = (ImageView) view.findViewById(R.id.ivCountryFlag);


        return view;

    }

    public void setCountryName(String name, String countryCapital, int countryFlag) {
        textViewCountryName.setText(name);
        capital.setText(countryCapital);
        ivCountryFlag.setImageResource(countryFlag);


    }
}
