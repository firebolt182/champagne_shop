package org.javaacademy.champagne_shop.controller;

import lombok.RequiredArgsConstructor;
import org.javaacademy.champagne_shop.entity.OrderDto;
import org.javaacademy.champagne_shop.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("champagne")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public ResponseEntity sell(@RequestBody OrderDto body) {
        orderService.sell(body);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
