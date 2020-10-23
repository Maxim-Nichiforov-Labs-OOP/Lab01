package com.company;

public class Monitor {
    private String color;
    private float height;
    private float width;
    private String resolution;


    public Monitor(String color, float height, float width, String resolution) {
        this.color = color;
        this.height = height;
        this.width = width;
        this.resolution = resolution;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}
