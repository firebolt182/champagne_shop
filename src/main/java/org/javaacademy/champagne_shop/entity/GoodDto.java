package org.javaacademy.champagne_shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class GoodDto {
    private Long id;
    private MarkDto markDto;
    private Integer count;
    private BigDecimal price;
}
