package org.javaacademy.champagne_shop.mapper;

import org.javaacademy.champagne_shop.entity.Good;
import org.javaacademy.champagne_shop.entity.GoodDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GoodMapper {

    @Mapping(target = "mark", source = "markDto")
    Good convertToEntity(GoodDto goodDto);

    GoodDto convertToDto(Good good);
}
