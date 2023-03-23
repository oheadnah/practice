package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Getter
@AllArgsConstructor
public class Board {
	
	public Board(long boardId, String title, String content) {
		this.boardId = boardId;
		this.title = title;
		this.content = content;
	}

	private Long boardId;
	
	private String title;
	
	private String content;
	
	public Long getBoardId() {
		return boardId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setBoardId(long boardId) {
		this.boardId = boardId;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
}
