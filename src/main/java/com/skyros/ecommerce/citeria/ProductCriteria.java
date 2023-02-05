package com.skyros.ecommerce.citeria;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class ProductCriteria {

    private int page;
    private int pageSize;
    private String productName;
    private String categoryName;
    private BigDecimal unitPriceFrom;
    private BigDecimal unitPriceTo;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dateCreatedFrom;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dateCreatedTo;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public BigDecimal getUnitPriceFrom() {
        return unitPriceFrom;
    }

    public void setUnitPriceFrom(BigDecimal unitPriceFrom) {
        this.unitPriceFrom = unitPriceFrom;
    }

    public BigDecimal getUnitPriceTo() {
        return unitPriceTo;
    }

    public void setUnitPriceTo(BigDecimal unitPriceTo) {
        this.unitPriceTo = unitPriceTo;
    }

    public Date getDateCreatedFrom() {
        return dateCreatedFrom;
    }

    public void setDateCreatedFrom(Date dateCreatedFrom) {
        this.dateCreatedFrom = dateCreatedFrom;
    }

    public Date getDateCreatedTo() {
        return dateCreatedTo;
    }

    public void setDateCreatedTo(Date dateCreatedTo) {
        this.dateCreatedTo = dateCreatedTo;
    }
}
