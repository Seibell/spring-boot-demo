package com.example.demo.dto;

import java.util.Set;

public class MenuDTO {
    private Long id;
    private String name;
    private Set<MenuItemDTO> menuItems;

    public MenuDTO() {
    }

    public MenuDTO(Long id, String name, Set<MenuItemDTO> menuItems) {
        this.id = id;
        this.name = name;
        this.menuItems = menuItems;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<MenuItemDTO> getMenuItems() {
        return menuItems;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMenuItems(Set<MenuItemDTO> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", menuItems=" + menuItems +
                '}';
    }
}
