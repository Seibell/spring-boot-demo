package com.example.demo.repository;

import com.example.demo.model.MenuItem;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// Interface between MenuItem model and database (PGSQL)
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    // Usually is done using naming convention
    List<MenuItem> findByName(String name);

    List<MenuItem> findByMenuId(Long menuId);

    // Can also use JPQL to query the database for more complex queries
    @Query("SELECT m FROM MenuItem m WHERE m.name = :name AND m.price < :price")
    List<MenuItem> findMenuItemsUnderPrice(String name, double price);
}