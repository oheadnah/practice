package com.example.demo.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Board;
import com.example.demo.model.Pagination;

@MybatisTest
class BoardMapperTest {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	void testGetListBoard() {
		
		for(int i=1; i<21; i++) {
			Board board = new Board(i,"title" + i ,"content" + i);
			boardMapper.createBoard(board);
		}
		
		Pagination pagination = new Pagination();
		
		for(int i=1; i<5; i++) {
			pagination.setPageNum(i);
			pagination.setAmount(5);
			
			List<Board> boards = boardMapper.getListBoard(pagination);
			
			for(int j=0; j<boards.size(); j++) {
				System.out.println("식별자 = " + boards.get(j).getBoardId() + ", 제목 = " + boards.get(j).getTitle() + ", 내용 = " + boards.get(j).getContent());
			}
			System.out.println("페이지 번호 = " + pagination.getPageNum());
			System.out.println("----------------------------------");
		}
		
		
	}

}
