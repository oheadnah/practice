package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BoardDto;
import com.example.demo.mapper.BoardMapper;
import com.example.demo.mapstruct.BoardMapstruct;
import com.example.demo.model.Board;
import com.example.demo.model.Pagination;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
@Validated
public class BoardController {
	
	private final BoardMapper boardMapper;
	private final BoardMapstruct mapper;
	
	public BoardController(BoardMapper boardMapper, BoardMapstruct mapper) {
		this.boardMapper = boardMapper;
		this.mapper = mapper;
	}
	
	@PostMapping()
	public ResponseEntity postBoard(@RequestBody BoardDto.post requestBody) {
		
		Board board = mapper.boardDtoToBoard(requestBody);
		boardMapper.createBoard(board);
		
		
		return new ResponseEntity(mapper.boardToBoardResponse(board),HttpStatus.CREATED);
	}
	
	@GetMapping()
	public ResponseEntity getBoard(@RequestParam int page) {
		
		Pagination pagination = new Pagination(page,5);
		List<Board> boards = boardMapper.getListBoard(pagination);
		List<BoardDto.response> response = mapper.boardListToBoardListResponse(boards);
		
		return new ResponseEntity(response,HttpStatus.OK);
	}
}
