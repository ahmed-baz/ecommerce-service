package com.skyros.ecommerce.mapper;

import org.springframework.data.domain.Page;

import java.util.List;


public interface CommonMapper<E, VO> {

    List<VO> entityListToVOList(List<E> entityList);

    Page<VO> entityPageToVOPage(Page<E> page);

    VO entityToVO(E e);

    E VOToEntity(VO vo);

    List<E> VOListToEntityList(List<VO> vos);
}
