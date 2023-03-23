package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Pagination;
import com.example.demo.model.Board;

@Mapper
public interface BoardMapper {
	
	List<Board> getListBoard(Pagination pagination);
	
	void createBoard(Board board);
}
