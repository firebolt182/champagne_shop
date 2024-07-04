package org.javaacademy.champagne_shop.repository;

import org.javaacademy.champagne_shop.entity.Good;
import org.javaacademy.champagne_shop.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GoodRepository extends JpaRepository<Good, Long> {
    Optional<Good> findGoodByMark_Name(String name);
}
