package com.skyros.ecommerce.mapper;

import com.skyros.ecommerce.entity.Category;
import com.skyros.ecommerce.vo.CategoryVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface CategoryMapper extends CommonMapper<Category, CategoryVO> {

    @Mappings({
            @Mapping(target = "products", ignore = true)
    })
    CategoryVO entityToVO(Category category);
}
