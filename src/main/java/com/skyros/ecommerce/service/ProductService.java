package com.skyros.ecommerce.service;

import com.skyros.ecommerce.vo.CategoryVO;
import com.skyros.ecommerce.vo.ProductVO;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {

    ProductVO findProductBySku(String sku);

    Page<ProductVO> findProductPage(int page, int pageSize);

    List<ProductVO> findProductList();

    List<ProductVO> findProductsByCategory(Long id);

    List<CategoryVO> findCategoryList();

    CategoryVO addCategory(CategoryVO categoryVO);

    CategoryVO findCategoryById(Long id);
}
