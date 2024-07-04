package org.javaacademy.champagne_shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MarkDto {
    private Long id;
    private String name;
    private Type type;
}
