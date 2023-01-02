package com.skyros.ecommerce.controller;

import com.skyros.ecommerce.service.ProductService;
import com.skyros.ecommerce.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin({"http://127.0.0.1:4200/", "http://localhost:4200/"})
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/findAll")
    List<ProductVO> findProductList() {
        return productService.findProductList();
    }

    @GetMapping("/findProductPage")
    Page<ProductVO> findProductPage(@RequestParam int page, @RequestParam int size) {
        return productService.findProductPage(page, size);
    }

    @GetMapping("/findAll/{id}")
    List<ProductVO> findProductList(@PathVariable Long id) {
        return productService.findProductsByCategory(id);
    }

    @GetMapping("/findBySku/{sku}")
    ProductVO findProductBySku(@PathVariable String sku) {
        return productService.findProductBySku(sku);
    }
}
