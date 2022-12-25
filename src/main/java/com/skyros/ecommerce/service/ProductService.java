package com.skyros.ecommerce.service;

import com.skyros.ecommerce.vo.CategoryVO;
import com.skyros.ecommerce.vo.ProductVO;

import java.util.List;

public interface ProductService {

    ProductVO findProductBySku(String sku);

    List<ProductVO> findProductList();

    List<ProductVO> findProductsByCategory(Long id);

    List<CategoryVO> findCategoryList();

    CategoryVO findCategoryById(Long id);
}
