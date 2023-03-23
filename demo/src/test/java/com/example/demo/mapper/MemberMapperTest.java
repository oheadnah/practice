package com.example.demo.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Member;


@MybatisTest
class MemberMapperTest {

	@Autowired
    private MemberMapper memberMapper;
	
    @Test
    public void saveTest(){
    	Member member = new Member(1L,"hi");
        memberMapper.memberAdd(member);
        Member findMember = memberMapper.findMember(member.getMemberId());
        assertEquals(member.getName(),findMember.getName());
    }
}
