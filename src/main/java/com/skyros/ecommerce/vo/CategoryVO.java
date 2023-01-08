package com.skyros.ecommerce.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class CategoryVO implements Serializable {
    private long id;
    private String categoryName;
    private List<ProductVO> products = new ArrayList<>(0);
}
