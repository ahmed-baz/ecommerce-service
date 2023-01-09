package com.skyros.ecommerce.repo;

import com.skyros.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    Product findProductBySku(String sku);

    List<Product> findProductByCategoryId(Long id);

    Page<Product> findProductByCategoryId(Long id, Pageable pageable);
}
