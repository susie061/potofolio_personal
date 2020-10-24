package com.potofolio.wine.info;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WineListMapper {
	//글쓰기
	public int insWine(WineVO wvo);
	//리스트 
	public List<WineVO> selWineList(WineVO wvo);
	//디테일화면
	public WineVO selWine(WineVO wvo);
	//글 지우기
	public int delWine(int wine_num);
	//글 수정하기
	public int update(WineVO wvo);
	//댓글 입력
	public int insertCmt(WineCmtVO wcvo);
	//댓글 리스트
	public List<WineCmtVO> cmtList(String wine_name);
	//댓글 수정
	public void modCmt(WineCmtVO wcvo);
	//댓글 지우기
	public void cmtDel(int i_comment);
}
