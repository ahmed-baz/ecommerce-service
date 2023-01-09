package com.skyros.ecommerce.mapper;

import com.skyros.ecommerce.entity.Category;
import com.skyros.ecommerce.entity.Product;
import com.skyros.ecommerce.vo.CategoryVO;
import com.skyros.ecommerce.vo.ProductVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.springframework.data.domain.Page;

import java.util.function.Function;

@Mapper(uses = {CategoryMapper.class})
public interface ProductMapper extends CommonMapper<Product, ProductVO> {

    @Mappings({
            //@Mapping(target = "category", source = "category", qualifiedByName = "mapCategory"),
            //@Mapping(target = "imageUrl", ignore = true)
    })
    ProductVO entityToVO(Product product);

    @Override
    default Page<ProductVO> entityPageToVOPage(Page<Product> page) {
        Page<ProductVO> productVOS = page.map(new Function<Product, ProductVO>() {
            @Override
            public ProductVO apply(Product entity) {
                return entityToVO(entity);
            }
        });
        return productVOS;
    }

    @Named("mapCategory")
    default CategoryVO mapCategory(Category category) {
        CategoryVO categoryVO = new CategoryVO();
        categoryVO.setId(category.getId());
        categoryVO.setCategoryName(category.getCategoryName());
        return categoryVO;
    }
}
