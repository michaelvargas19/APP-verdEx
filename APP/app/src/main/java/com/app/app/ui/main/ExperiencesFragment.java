package com.app.app.ui.main;

import android.content.Context;
import android.graphics.ColorSpace;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.provider.Contacts;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.app.R;
import com.app.app.adapters.PhotoAdapter;
import com.app.app.model.Photo;

import java.util.ArrayList;
import java.util.List;


public class ExperiencesFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER_E = "section_number";

    //private PageViewModel pageViewModel;
    private List<Photo> photos;
    private PhotoAdapter adapter;


    public static ExperiencesFragment newInstance(int index) {
        ExperiencesFragment fragment = new ExperiencesFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER_E, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onStart() {
        super.onStart();

        //loadPhotos();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 2;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER_E);
        }
        //pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_experiences, container, false);
    }



}
