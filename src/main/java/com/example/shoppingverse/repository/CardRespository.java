package com.example.shoppingverse.repository;

import com.example.shoppingverse.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRespository extends JpaRepository<Card,Integer> {

    public Card findByCardNo(String cardNo);
}
