package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BoardDto {
	
	public static class post{
		
		private String title;
		
		private String content;
		
		public String getTitle() {
			return title;
		}
		
		public String getContent() {
			return content;
		}
		
		public post(String title, String content) {
			this.title = title;
			this.content = content;
		}
		
	}
	
	public static class response {
		
		private long boardId;
		
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
		
		public response(long boardId, String title, String content) {
			this.boardId = boardId;
			this.title = title;
			this.content = content;
		}
	}
	
}
