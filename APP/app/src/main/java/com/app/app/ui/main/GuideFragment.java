package com.app.app.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import com.app.app.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

/**
 * A placeholder fragment containing a simple view.
 */
public class GuideFragment extends Fragment implements OnMapReadyCallback {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;
    private SupportMapFragment mapFragment;

    public static GuideFragment newInstance(int index) {
        GuideFragment fragment = new GuideFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView( @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
            View root = inflater.inflate(R.layout.fragment_guide, container, false);

            mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);

            if(mapFragment == null){
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                mapFragment = SupportMapFragment.newInstance();

                ft.replace(R.id.map, mapFragment).commit();

            }
            mapFragment.getMapAsync(this);


            //final TextView textView = root.findViewById(R.id.section_label);
            //pageViewModel.getText().observe(this, new Observer<String>() {
            //@Override
            //public void onChanged(@Nullable String s) {
            //textView.setText(s);
                //     }
            //});

            return root;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}