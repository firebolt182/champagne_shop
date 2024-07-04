package org.javaacademy.champagne_shop.service;

import lombok.RequiredArgsConstructor;
import org.javaacademy.champagne_shop.entity.Mark;
import org.javaacademy.champagne_shop.entity.MarkDto;
import org.javaacademy.champagne_shop.mapper.MarkMapper;
import org.javaacademy.champagne_shop.repository.MarkRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MarkService {
    private final MarkRepository markRepository;
    private final MarkMapper markMapper;

    @Transactional
    public void create(MarkDto markDto) {
        Mark mark = markMapper.convertToEntity(markDto);
        markRepository.save(mark);
    }

    @Transactional(readOnly = true)
    public MarkDto findMarkByName(String name) {
        return markMapper.convertToDto(markRepository.findMarkByName(name).orElseThrow());
    }


}
