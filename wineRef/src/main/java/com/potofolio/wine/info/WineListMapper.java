package com.potofolio.wine.info;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface WineListMapper {
	public int insWine(WineVO wvo);
	public List<WineVO> selWineList(WineVO wvo);
	public WineVO selWine(WineVO wvo);
	public int delWine(int wine_num);
	public int update(WineVO wvo);
	public int insertCmt(WineCmtVO wcvo);
	public List<WineCmtVO> cmtList(String wine_name);
	public void modCmt(WineCmtVO wcvo);
	public void cmtDel(int i_comment);
}
