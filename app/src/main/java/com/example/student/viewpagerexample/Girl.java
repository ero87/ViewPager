package com.example.student.viewpagerexample;

/**
 * Created by Student on 7/7/2018.
 */

public class Girl {

    private String name;

    private int imageUrl;

    public Girl(String name, int imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }
}
