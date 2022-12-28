package com.example.cardservice.repository;


import com.example.cardservice.module.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

    Card findCardById(Long id);

    Card findCardByNumber(String number);
}
