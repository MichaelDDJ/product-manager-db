package com.mikeyd.productmanagerdb;

public class Product {
    private String name;
    private String type;
    private String place;
    private int year_acquired;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getYear_acquired() {
        return year_acquired;
    }

    public void setYear_acquired(int year_acquired) {
        this.year_acquired = year_acquired;
    }
}
