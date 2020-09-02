package com.potofolio.wine.member;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

	public int join(MemberVO param);

	public MemberVO login(MemberVO param);

	public int chkId(String cid);
}
