package org.javaacademy.champagne_shop.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "goods")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Good {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    @JoinColumn(name = "mark_id")
    private Mark mark;

    @Column
    @Min(0)
    private Integer count;

    @Column
    @DecimalMin(value = "0")
    private BigDecimal price;
}
