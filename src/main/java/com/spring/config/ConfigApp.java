package com.spring.config;

import com.spring.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;

@Configuration
public class ConfigApp {
    @Bean(name = "listOfProduct")
    public IProductRepository productRepository() {
        IProductRepository productRepository = new ProductRepository();
        productRepository.setProductList(Arrays.asList(new Product(0, "Bread", 50),
                new Product(0, "Water", 45),
                new Product(1, "Meet", 450),
                new Product(2, "Chicken", 235),
                new Product(3, "Lemon", 134),
                new Product(4, "Sausage", 970),
                new Product(5, "Beer", 65),
                new Product(6, "Sugar", 61),
                new Product(7, "Orange", 237)));
        return productRepository;
    }

    @Bean(name = "cart")
    @Scope("prototype")
    public ICart cart(IProductRepository repository) {
        ICart cart = new Cart();
        cart.setProductRepository(repository);
        return cart;
    }
}
