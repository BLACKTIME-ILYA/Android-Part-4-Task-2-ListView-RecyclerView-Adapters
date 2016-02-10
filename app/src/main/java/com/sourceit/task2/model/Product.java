package com.sourceit.task2.model;

/**
 * Created by User on 08.02.2016.
 */
public class Product {
    public String title;
    public int count;

    public Product(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
