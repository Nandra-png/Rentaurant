package com.example.rentaurant;

public class MenuModel {

    private int imageResource;
    private String name;
    private String description;

    public MenuModel(int imageResource, String name, String description) {
        this.imageResource = imageResource;
        this.name = name;
        this.description = description;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
