package org.javaacademy.champagne_shop.repository;

import org.javaacademy.champagne_shop.entity.Mark;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MarkRepository extends JpaRepository<Mark, Long> {
    Optional<Mark> findMarkByName(String name);
}
