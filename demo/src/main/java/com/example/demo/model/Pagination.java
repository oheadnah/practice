package com.example.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class Pagination {
	
	private int pageNum;
	
	private int amount;

	public Pagination(int page, int amount) {
		this.pageNum = page;
		this.amount = amount;
	}
	
	public Pagination() {
		
	}

	public void setPageNum(int num) {
		this.pageNum = num;
	}

	public void setAmount(int num) {
		this.amount = num;
		
	}

	public int getPageNum() {
		return pageNum;
	}
}
