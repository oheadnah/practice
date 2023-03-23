package com.example.demo.model;

import lombok.*;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	
	public Member(long memberId, String name) {
		this.memberId = memberId;
		this.name = name;
	}
	
	private Long memberId;
    private String name;
    
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public long getMemberId() {
		// TODO Auto-generated method stub
		return memberId;
	}
	
}
