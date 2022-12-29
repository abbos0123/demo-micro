package com.example.cardservice.controller;


import com.example.cardservice.module.Card;
import com.example.cardservice.service.CardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: Abbos Fayziboev
 * Date: 28/12/22
 * Email: abbosFayziboev@gmail.com
 */

@RestController
@RequestMapping("/card")
public class CardController {
    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }
    @GetMapping("/{number}")
    public Card getCardByNumber(@PathVariable String number) {
        return cardService.getCard(number);
    }

    @PostMapping("/save")
    public Card saveCard(@RequestBody Card card) {
         return cardService.addCard(card);
    }

    @GetMapping("/all")
    public List<Card> getAllCards() {
        return cardService.getAllCards();
    }

    @DeleteMapping("/{number}")
    public boolean deleteCard(@PathVariable String number) {
        return cardService.deleteCard(number);
    }
}
