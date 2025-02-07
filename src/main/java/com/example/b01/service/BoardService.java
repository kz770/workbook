package com.example.b01.service;

import com.example.b01.domain.Board;
import com.example.b01.dto.BoardDTO;

public interface BoardService {
    Long register(BoardDTO boardDTO);

    BoardDTO readOne(Long bno);

    void modify(BoardDTO boardDTO);
}
