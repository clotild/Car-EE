package com.example.voitures.model;

public class Car {
    private Long id;
    private String category;
    private String name ;
    private String description;
    private double price;
    private final String image;

    public Car(Long id, String category, String name, String description, double price, String image) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public Long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
