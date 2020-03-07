package com.example.simplerecyclermoviedatabinding;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Movie {

    //Add the type indicators here
    public static final int COMMEDY_MOVIE_TYPE = 0;
    public static final int LOVE_STORY_MOVIE_TYPE = 1;


    private int viewType;
    private String title;
    private String descripition;
    private int photo;

    public Movie(int viewType, String title, String descripition, int photo) {
        this.viewType = viewType;
        this.title = title;
        this.descripition = descripition;
        this.photo = photo;
    }

    @BindingAdapter("profileImage")
    public static void loadImage(ImageView view, String imageUrl) {
       /* Glide.with(view.getContext())
                .load(imageUrl).apply(new RequestOptions().circleCrop())
                .into(view);*/
        view.setImageResource(R.drawable.snow);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripition() {
        return descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }


    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}