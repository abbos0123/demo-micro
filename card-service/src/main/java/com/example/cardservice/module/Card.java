package com.example.cardservice.module;

import jakarta.persistence.*;

/**
 * Author: Abbos Fayziboev
 * Date: 28/12/22
 * Email: abbosFayziboev@gmail.com
 */

@Entity
@Table(name = "cards")
public class Card {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double amount;
    private String number;

}
