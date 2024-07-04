package org.javaacademy.champagne_shop.mapper;

import org.javaacademy.champagne_shop.entity.Mark;
import org.javaacademy.champagne_shop.entity.MarkDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MarkMapper {

    Mark convertToEntity(MarkDto markDto);

    MarkDto convertToDto(Mark mark);
}
