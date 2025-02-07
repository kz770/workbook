package com.example.b01.service;

import com.example.b01.domain.Board;
import com.example.b01.dto.BoardDTO;
import com.example.b01.repository.BoardRepository;
import com.example.b01.repository.search.BoardSearch;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;

@Service
@Log4j2
@RequiredArgsConstructor
@Transactional  //해당 객체를 감싸는 별도의 클래스를 생성
public class BoardServiceImpl implements BoardService {
    private final ModelMapper modelMapper;
    private final BoardRepository boardRepository;

    @Override
    public Long register(BoardDTO boardDTO) {
        Board board = modelMapper.map(boardDTO, Board.class);
        Long bno = boardRepository.save(board).getBno();
        return bno;
    }
}
