package com.spring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Product implements IProduct {
    private int id;
    private String title;
    private int cost;

}
