package com.example.refrosittest2;

import com.google.gson.annotations.SerializedName;

class Movie {

    @SerializedName("title")
    private String title;

    @SerializedName("image")
    private String imageUrl;

    public Movie(String title, String imageUrl) {
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}