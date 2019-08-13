package com.app.app.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import com.app.app.R;
import com.app.app.model.Photo;

import java.util.List;

public class PhotoAdapter extends BaseAdapter {

    private List<Photo> listPhotos;
    private Context context;
    private ImageView imageView;
    private TextView textView;
    private Photo photo;

    public PhotoAdapter(List<Photo> photos, Context contex){
        this.listPhotos = photos;
        this.context = contex;
    }

    @Override
    public int getCount() {
        return this.listPhotos.size();
    }

    @Override
    public Object getItem(int i) {
        return this.listPhotos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view =   LayoutInflater.from(context).inflate(R.layout.adapter_photo, null);
        photo = (Photo) getItem(i);


        Drawable originalDrawable = null;
        originalDrawable = view.getResources().getDrawable(R.drawable.sunset);



        imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageDrawable(originalDrawable);

        //textView = (TextView) view.findViewById(R.id.namePhoto);
        //textView.setText(photo.getName());



        return view;
    }
}
