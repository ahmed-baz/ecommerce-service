package com.skyros.ecommerce.controller;

import com.skyros.ecommerce.service.ProductService;
import com.skyros.ecommerce.vo.CategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoryController {

    @Autowired
    private ProductService productService;

    @GetMapping("findAll")
    List<CategoryVO> findCategoryList() {
        return productService.findCategoryList();
    }

    @GetMapping("findById/{id}")
    CategoryVO findCategoryById(@PathVariable Long id) {
        return productService.findCategoryById(id);
    }
}
