package com.skyros.ecommerce.mapper;

import com.skyros.ecommerce.entity.Category;
import com.skyros.ecommerce.entity.Product;
import com.skyros.ecommerce.vo.CategoryVO;
import com.skyros.ecommerce.vo.ProductVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

@Mapper(uses = {CategoryMapper.class})
public interface ProductMapper extends CommonMapper<Product, ProductVO> {

    @Mappings({
            //@Mapping(target = "category", source = "category", qualifiedByName = "mapCategory"),
            //@Mapping(target = "imageUrl", ignore = true)
    })
    ProductVO entityToVO(Product product);

    @Named("mapCategory")
    default CategoryVO mapCategory(Category category) {
        CategoryVO categoryVO = new CategoryVO();
        categoryVO.setId(category.getId());
        categoryVO.setCategoryName(category.getCategoryName());
        return categoryVO;
    }
}
