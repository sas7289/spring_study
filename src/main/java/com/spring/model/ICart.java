package com.spring.model;

public interface ICart {
    void setProductRepository(IProductRepository repository);
    void add(int id);
    boolean remove(int id);
}
