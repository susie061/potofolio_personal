package com.potofolio.wine.info;

import java.util.List;

public interface WineListMapper {
	public int wineRef(WineVO wvo);
	public List<WineVO> selWineList(WineVO wvo);
	public WineVO selWine(WineVO wvo);
	public int delWine(int wine_num);
	public int update(WineVO wvo);
}
