package com.skyros.ecommerce.service;

import com.skyros.ecommerce.citeria.ProductCriteria;
import com.skyros.ecommerce.vo.CategoryVO;
import com.skyros.ecommerce.vo.ProductVO;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {

    ProductVO findProductBySku(String sku);

    Page<ProductVO> findProductPage(int page, int pageSize);

    Page<ProductVO> findProductPageByCriteria(ProductCriteria productCriteria);

    List<ProductVO> findProductList();

    List<ProductVO> addProductList(List<ProductVO> productVOS);

    List<ProductVO> findProductsByCategory(Long id);

    Page<ProductVO> findProductsByCategory(Long id, int page, int pageSize);

    List<CategoryVO> findCategoryList();

    CategoryVO addCategory(CategoryVO categoryVO);

    CategoryVO updateCategory(CategoryVO categoryVO);

    CategoryVO findCategoryById(Long id);
}
