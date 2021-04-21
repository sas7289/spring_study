package com.spring.model;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Setter
@Getter
public class ProductRepository implements IProductRepository{
    private List<Product> productList;
}
