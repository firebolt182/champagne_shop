package org.javaacademy.champagne_shop.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ShopControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity handleException() {
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
                .body("Товара нет в наличии");
    }
}
