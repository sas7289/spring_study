package com.lesson_3.controller;

import com.lesson_3.dto.Product;
import com.lesson_3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/addProduct")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public String addProduct(@ModelAttribute Product product) {
        productService.add(product);
        return "addProd";
    }
}
