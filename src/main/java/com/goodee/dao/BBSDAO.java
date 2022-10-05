package com.goodee.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.goodee.vo.BBSVO;
import com.goodee.vo.UserVO;

@Mapper
public interface BBSDAO {
	public UserVO login(UserVO vo);
	public List<BBSVO>  getList();
	public BBSVO detailList(@Param("id") int id);
	public int insertList(BBSVO bbs);
}
