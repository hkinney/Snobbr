package com.hgkdev.snobbr;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

/**
 * Created by HaydenKinney on 4/16/15.
 */
public class MainFragment extends Fragment {

    private Button searchButton;
    private EditText searchText;
    private ListView suggestLst;

    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_activity_main, container, false);

        searchButton = (Button)   rootView.findViewById(R.id.btn_main_search);
        searchText   = (EditText) rootView.findViewById(R.id.edit_main_searchPhrase);
        suggestLst   = (ListView) rootView.findViewById(R.id.listView_main_suggestions);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchForBeer();
            }
        });



        return rootView;
    }

    private void searchForBeer() {
        
    }
}