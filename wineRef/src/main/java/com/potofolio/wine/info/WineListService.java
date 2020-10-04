package com.potofolio.wine.info;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WineListService {
	@Autowired
	private WineListMapper mapper;
	
	public int wineRef(WineVO wvo) {
		return mapper.wineRef(wvo);
	}
	public List<WineVO> selWineList(WineVO wvo){
		return mapper.selWineList(wvo);
	}
}
