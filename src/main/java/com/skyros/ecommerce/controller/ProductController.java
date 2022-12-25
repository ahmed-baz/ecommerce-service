package com.skyros.ecommerce.controller;

import com.skyros.ecommerce.service.ProductService;
import com.skyros.ecommerce.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("findAll")
    List<ProductVO> findProductList() {
        return productService.findProductList();
    }

    @GetMapping("findAll/{id}")
    List<ProductVO> findProductList(@PathVariable Long id) {
        return productService.findProductsByCategory(id);
    }

    @GetMapping("findBySku/{sku}")
    ProductVO findProductBySku(@PathVariable String sku) {
        return productService.findProductBySku(sku);
    }
}
