package com.app.app.ui.main;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.app.app.R;
import com.app.app.adapters.PhotoAdapter;
import com.app.app.model.Photo;

import java.util.ArrayList;
import java.util.List;


public class GalleryFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER_G = "section_number";
    private ListView listView;
    private PhotoAdapter adapter;


    private List<Photo> photos;

    static final String[] numbers = new String[] {
            "A", "B", "C", "D", "E",
            "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O",
            "P", "Q", "R", "S", "T",
            "U", "V", "W", "X", "Y", "Z"};

    @Override
    public void onStart() {

        super.onStart();
        //loadPhotos();
    }


    public static GalleryFragment newInstance(int index) {
        GalleryFragment fragment = new GalleryFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER_G, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 3;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER_G);
        }
        //pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gallery, container, false);


        this.photos = new ArrayList<Photo>();
        this.photos.add(new Photo("Photo1","chucho","--","esta es la descripción xD"));
        this.photos.add(new Photo("Photo2","chucho","--","esta es la descripción xD"));
        this.photos.add(new Photo("Photo3","chucho","--","esta es la descripción xD"));
        this.photos.add(new Photo("Photo4","chucho","--","esta es la descripción xD"));
        this.photos.add(new Photo("Photo5","chucho","--","esta es la descripción xD"));
        this.photos.add(new Photo("Photo6","chucho","--","esta es la descripción xD"));
        this.photos.add(new Photo("Photo7","chucho","--","esta es la descripción xD"));
        this.photos.add(new Photo("Photo8","chucho","--","esta es la descripción xD"));
        this.photos.add(new Photo("Photo9","chucho","--","esta es la descripción xD"));

        adapter = new PhotoAdapter(photos, getContext());

        //this.listView = (ListView) view.findViewById(R.id.listPhotos);
        //this.listView.setTextFilterEnabled(true);
        //this.listView.setAdapter(adapter);




        //GridView gridView = (GridView) view.findViewById(R.id.gridPhotos);

        GridView gridView = (GridView) view.findViewById(R.id.gridView1);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_list_item_1, numbers);
        gridView.setAdapter(adapter);



        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        //        android.R.layout.simple_list_item_1, numbers);

        //gridView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return view ;
    }


}
