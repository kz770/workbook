package com.example.b01.repository;

import com.example.b01.domain.Board;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
@Log4j2
public class BoardRepositoryTests {
    @Autowired
    private BoardRepository boardRepository;

//    @Test
//    public void testInsert() {
//        IntStream.rangeClosed(1, 100).forEach(i -> {
//            Board board = Board.builder()
//                    .title("title..." + i)
//                    .content("content..." + i)
//                    .writer("user..." + i)
//                    .build();
//            Board result = boardRepository.save(board);
//            log.info("BNO : " + result.getBno());
//        });
//    }
//
//    @Test
//    public void testSelect() {
//        Long bno = 99L;
//        Optional<Board> result = boardRepository.findById(bno);
//        Board board = result.orElseThrow();
//        log.info(board);
//    }

//    @Test
//    public void testUpdate() {
//        Long bno=100L;
//        Optional<Board> result = boardRepository.findById(bno);
//        Board board = result.orElseThrow();
//        board.change("update..title 100","update content 100");
//        boardRepository.save(board);
//    }

//    @Test
//    public void testDelete() {
//        Long bno = 100L;
//        boardRepository.deleteById(bno);
//    }
//
//    @Test
//    public void testPaging() {
//        Pageable pageble = PageRequest.of(0, 10, Sort.by("bno").descending());
//        Page<Board> result = boardRepository.findAll(pageble);
//        log.info("total count : " + result.getTotalElements());   // 전체 데이터의 개수
//        log.info("total pages : " + result.getTotalPages());
//        log.info("page size :  " + result.getSize());
//        log.info("page number : " + result.getNumber());  // 현재 페이지의 번호 0부터 시작
//        List<Board> todoList = result.getContent();
//        todoList.forEach(board -> log.info(board));
//    }
//
//    @Test
//    public void testSearch() {
//        Pageable pageable = PageRequest.of(1, 10, Sort.by("bno").descending());
//        boardRepository.search1(pageable);
//    }

    @Test
    public void testSearchAll() {
        String[] types = {"t", "c", "w"};
        String keyword = "1";
        Pageable pageable = PageRequest.of(0, 10, Sort.by("bno").descending());
        Page<Board> result = boardRepository.searchAll(types, keyword, pageable);

        //total pages
        log.info(result.getTotalPages());
        //page size
        log.info(result.getSize());
        //page number
        log.info(result.getNumber());
        //prev page
        log.info(result.hasPrevious()+": "+ result.hasNext());
        result.getContent().forEach(board -> log.info(board));

    }
}
