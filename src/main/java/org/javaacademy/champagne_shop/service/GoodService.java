package org.javaacademy.champagne_shop.service;

import lombok.RequiredArgsConstructor;
import org.javaacademy.champagne_shop.entity.Good;
import org.javaacademy.champagne_shop.entity.GoodDto;
import org.javaacademy.champagne_shop.mapper.GoodMapper;
import org.javaacademy.champagne_shop.repository.GoodRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class GoodService {
    private final GoodRepository goodRepository;
    private final GoodMapper goodMapper;

    @Transactional
    public void create(GoodDto goodDto) {
        Good good = goodMapper.convertToEntity(goodDto);
        goodRepository.save(good);
    }

    @Transactional(readOnly = true)
    public GoodDto findGoodByMarkName(String name) {
        return goodMapper.convertToDto(goodRepository.findGoodByMark_Name(name).orElseThrow());
    }

    public void sellGood(Good good, int count) {
        good.setCount(good.getCount() - count);
        goodRepository.save(good);
    }


}
