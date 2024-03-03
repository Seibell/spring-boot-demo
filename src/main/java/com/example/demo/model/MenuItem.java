package com.example.demo.model;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

    // Default Constructor
    public MenuItem() {
    }

    // Full Constructor
    public MenuItem(Long id, String name, BigDecimal price, Menu menu) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.menu = menu;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Menu getMenu() {
        return menu;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}