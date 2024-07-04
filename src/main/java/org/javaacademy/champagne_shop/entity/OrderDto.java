package org.javaacademy.champagne_shop.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class OrderDto {
    @NotBlank
    private String name;
    @Min(1)
    private Integer quantity;
}
