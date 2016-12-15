package com.siva.fragmentcommunicationex;

import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class CountryListFragment extends Fragment implements AdapterView.OnItemClickListener {

    ArrayAdapter adapter;
    String countries[];
    String country_capital[]={"Delhi","Washington","London","Ijaktra"};
    ListView myList;
    int[] imageFlag = {R.drawable.india, R.drawable.united, R.drawable.uk, R.drawable.indonesia};
    ListItemEvent itemEvent;  // interface reference variable

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        itemEvent = (ListItemEvent) activity;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        countries = getResources().getStringArray(R.array.countries);
      //  country_capital=getResources().getStringArray(R.array.countries_capital);
       // String capital=country_capital.toString();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_country_list, container, false);
        myList = (ListView) view.findViewById(R.id.listview);
        adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, countries);
        myList.setAdapter(adapter);
        myList.setOnItemClickListener(this);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        itemEvent.onItemClicked(countries[i],country_capital[i], imageFlag[i]);
    }
}
