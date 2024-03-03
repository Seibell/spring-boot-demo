package com.example.demo.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private Set<MenuItem> menuItems;

    // Default constructor
    public Menu() {
    }

    // Constructor with all parameters
    public Menu(Long id, String name, Set<MenuItem> menuItems) {
        this.id = id;
        this.name = name;
        this.menuItems = menuItems;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<MenuItem> getMenuItems() {
        return menuItems;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMenuItems(Set<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}