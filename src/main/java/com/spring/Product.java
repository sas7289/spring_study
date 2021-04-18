package com.spring;

public class Product {
    private int id;
    private String title;
    private int coast;

    public Product(int id, String title, int coast) {
        this.id = id;
        this.title = title;
        this.coast = coast;
    }

    public String getTitle() {
        return title;
    }

    public int getCoast() {
        return coast;
    }
}
