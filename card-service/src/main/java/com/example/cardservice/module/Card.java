package com.example.cardservice.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Abbos Fayziboev
 * Date: 28/12/22
 * Email: abbosFayziboev@gmail.com
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cards")
@Builder
public class Card {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double amount;
    private String number;

}
