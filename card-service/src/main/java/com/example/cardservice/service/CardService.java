package com.example.cardservice.service;


import com.example.cardservice.module.Card;
import com.example.cardservice.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Abbos Fayziboev
 * Date: 28/12/22
 * Email: abbosFayziboev@gmail.com
 */

@Service
public class CardService {
    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public Card addCard(Card card) {
        return cardRepository.save(card);
    }

    public Card getCard(String number) {
        return cardRepository.findCardByNumber(number);
    }

    public boolean deleteCard(String number) {
        Card card = cardRepository.findCardByNumber(number);
        cardRepository.delete(card);
        return true;
    }

    public List<Card> getAllCards(){
        return cardRepository.findAll();
    }

}
