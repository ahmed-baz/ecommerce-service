package com.skyros.ecommerce.mapper;

import com.skyros.ecommerce.entity.Category;
import com.skyros.ecommerce.vo.CategoryVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.data.domain.Page;

@Mapper
public interface CategoryMapper extends CommonMapper<Category, CategoryVO> {

    @Mappings({
            @Mapping(target = "products", ignore = true)
    })
    CategoryVO entityToVO(Category category);

    @Override
    default Page<CategoryVO> entityPageToVOPage(Page<Category> page) {
        return null;
    }
}
