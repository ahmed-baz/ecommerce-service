package com.skyros.ecommerce.specification;

import com.skyros.ecommerce.citeria.ProductCriteria;
import com.skyros.ecommerce.entity.Category;
import com.skyros.ecommerce.entity.Product;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

public class ProductSpecification implements Specification<Product> {

    private ProductCriteria productCriteria;

    @Override
    public Predicate toPredicate(Root<Product> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        Join<Product, Category> productCategoryJoin = root.join("category");
        List<Predicate> predicateList = new ArrayList<>();
        if (getProductCriteria() != null) {
            if (getProductCriteria().getProductName() != null) {
                String productName = "%" + getProductCriteria().getProductName() + "%";
                predicateList.add(criteriaBuilder.like(root.get("name"), productName));
            }
            if (getProductCriteria().getUnitPriceFrom() != null && getProductCriteria().getUnitPriceTo() != null) {
                predicateList.add(criteriaBuilder.between(root.get("unitPrice"), getProductCriteria().getUnitPriceFrom(), getProductCriteria().getUnitPriceTo()));
            }
            if (getProductCriteria().getDateCreatedFrom() != null && getProductCriteria().getDateCreatedTo() != null) {
                predicateList.add(criteriaBuilder.between(root.get("dateCreated"), getProductCriteria().getDateCreatedFrom(), getProductCriteria().getDateCreatedTo()));
            }
            if (getProductCriteria().getCategoryName() != null) {
                predicateList.add(criteriaBuilder.like(productCategoryJoin.get("categoryName"), getProductCriteria().getCategoryName()));
            }
        }
        return criteriaBuilder.and(predicateList.toArray(new Predicate[0]));
    }

    public ProductCriteria getProductCriteria() {
        return productCriteria;
    }

    public void setProductCriteria(ProductCriteria productCriteria) {
        this.productCriteria = productCriteria;
    }
}
