package com.skyros.ecommerce.controller;

import com.skyros.ecommerce.service.ProductService;
import com.skyros.ecommerce.vo.CategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("add")
    CategoryVO addCategory(@RequestBody CategoryVO categoryVO) {
        return productService.addCategory(categoryVO);
    }

    @GetMapping("findById/{id}")
    CategoryVO findCategoryById(@PathVariable Long id) {
        return productService.findCategoryById(id);
    }
}
