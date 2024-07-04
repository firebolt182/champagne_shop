package org.javaacademy.champagne_shop.service;

import lombok.RequiredArgsConstructor;
import org.javaacademy.champagne_shop.entity.Good;
import org.javaacademy.champagne_shop.entity.Mark;
import org.javaacademy.champagne_shop.entity.OrderDto;
import org.javaacademy.champagne_shop.mapper.GoodMapper;
import org.javaacademy.champagne_shop.mapper.MarkMapper;
import org.javaacademy.champagne_shop.repository.GoodRepository;
import org.javaacademy.champagne_shop.repository.MarkRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final GoodService goodService;
    private final GoodMapper goodMapper;
    private final MarkService markService;
    private final MarkMapper markMapper;

    @Transactional
    public void sell(OrderDto orderDto) {
        Good good = goodMapper.convertToEntity(goodService.findGoodByMarkName(orderDto.getName()));
        Mark mark = markMapper.convertToEntity(markService.findMarkByName(orderDto.getName()));
        good.setMark(mark);
        if (good.getCount() < orderDto.getQuantity()) {
            throw new RuntimeException();
        }
        goodService.sellGood(good, orderDto.getQuantity());
    }
}
