package com.mikeyd.productmanagerdb;

public class Product {
    //Product properties
    private String name;
    private String type;
    private String place;
    private int year_acquired;

    //Constructors
    public Product() {
    }

    public Product(String name, String type, String place, int year_acquired) {
        this.name = name;
        this.type = type;
        this.place = place;
        this.year_acquired = year_acquired;
    }

    //Getters and Setters
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

    public void setYear_acquired(int year_acquired) {this.year_acquired = year_acquired;}

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", place='" + place + '\'' +
                ", year_acquired=" + year_acquired +
                '}';
    }
}
