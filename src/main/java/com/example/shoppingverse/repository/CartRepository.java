package com.example.shoppingverse.repository;

import com.example.shoppingverse.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Integer> {
}
