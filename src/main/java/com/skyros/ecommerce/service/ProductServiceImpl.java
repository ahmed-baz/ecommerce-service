package com.skyros.ecommerce.service;

import com.skyros.ecommerce.entity.Category;
import com.skyros.ecommerce.entity.Product;
import com.skyros.ecommerce.mapper.CategoryMapper;
import com.skyros.ecommerce.mapper.ProductMapper;
import com.skyros.ecommerce.repo.CategoryRepo;
import com.skyros.ecommerce.repo.ProductRepo;
import com.skyros.ecommerce.vo.CategoryVO;
import com.skyros.ecommerce.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public ProductVO findProductBySku(String sku) {
        Product product = productRepo.findProductBySku(sku);
        ProductVO productVO = productMapper.entityToVO(product);
        return productVO;
    }

    @Override
    public List<ProductVO> findProductList() {
        List<Product> productList = productRepo.findAll();
        List<ProductVO> productVOS = productMapper.entityListToVOList(productList);
        return productVOS;
    }

    @Override
    public List<CategoryVO> findCategoryList() {
        List<Category> categoryList = categoryRepo.findAll();
        return categoryMapper.entityListToVOList(categoryList);
    }

    @Override
    public CategoryVO findCategoryById(Long id) {
        Optional<Category> categoryOptional = categoryRepo.findById(id);
        if (null != categoryOptional && categoryOptional.isPresent()) {
            Category category = categoryOptional.get();
            return categoryMapper.entityToVO(category);
        }
        return null;
    }

    @Override
    public List<ProductVO> findProductsByCategory(Long id) {
        List<Product> productList = productRepo.findProductByCategoryId(id);
        List<ProductVO> productVOS = productMapper.entityListToVOList(productList);
        return productVOS;
    }
}
