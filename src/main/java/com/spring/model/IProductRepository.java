package com.spring.model;

import java.util.List;

public interface IProductRepository {
    void setProductList(List<Product> list);
    List<Product> getProductList();
}
