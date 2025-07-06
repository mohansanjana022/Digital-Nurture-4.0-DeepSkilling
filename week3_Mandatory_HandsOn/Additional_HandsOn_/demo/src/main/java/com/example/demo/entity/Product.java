package com.example.demo.entity;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private LocalDate releaseDate;

    // 🔹 Default constructor
    public Product() {}

    // 🔹 Parameterized constructor
    public Product(Long id, String name, double price, LocalDate releaseDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    // 🔹 Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    // 🔹 Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}