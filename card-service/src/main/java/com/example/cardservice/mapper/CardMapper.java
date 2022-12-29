package com.example.cardservice.mapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Abbos Fayziboev
 * Date: 29/12/22
 * Email: abbosFayziboev@gmail.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardMapper {
    private Long id;
    private String name;
    private Double amount;
    private String cardNumber;
}

