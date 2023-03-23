package com.example.demo.mapstruct;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.example.demo.dto.BoardDto;
import com.example.demo.model.Board;

@Mapper(componentModel = "spring")
public interface BoardMapstruct {
	Board boardDtoToBoard(BoardDto.post dto);
	
	BoardDto.response boardToBoardResponse(Board board);
	
	List<BoardDto.response> boardListToBoardListResponse(List<Board> boards);
}