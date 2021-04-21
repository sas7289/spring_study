package com.spring.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Cart implements ICart{
    IProductRepository productRepository;
    Map<Integer, Integer> countOfProducts = new HashMap<>();

    @Override
    public void add(int id) {
        for (Product product : productRepository.getProductList()) {
            if(product.getId() == id) {
                int countProd = countOfProducts.get(id) == null ? 0 : countOfProducts.get(id);
                countOfProducts.put(id, ++countProd);
                return;
            }
        }
    }

    @Override
    public boolean remove(int id) {
        if(countOfProducts.get(id) != null) {
            int countProd = countOfProducts.get(id);
            if(countProd == 0) {
                return false;
            } else {
                countOfProducts.put(id, --countProd);
            }
        }
        return true;
    }
}
