package com.example.Marketchat;

public class Product {
    private String name;
    private String description;
    private double price;
    private int imageResourceId;

    public Product(String name, String description, double price, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageResourceId = imageResourceId;
    }

    public Product(String name, String description, String s) {
    }

    // Getters and other methods

    // Getters for name, description, price, and imageResourceId
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
