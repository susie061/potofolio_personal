package com.potofolio.wine.info;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.potofolio.wine.common.Const;
import com.potofolio.wine.member.MemberVO;

@Service
public class WineListService {
	@Autowired
	private WineListMapper mapper;

//글쓰기
	public int insWine(WineVO wvo ,HttpSession hs ) {
		MemberVO loginUser = (MemberVO)hs.getAttribute("loginUser");
		wvo.setI_user(loginUser.getI_user());
		
		return mapper.insWine(wvo);
	}

	public List<WineVO> selWineList(WineVO wvo) {

//	int sIdx = (page - 1) * Const.ROW_COUNT;
//			
//		WineVO wvo = new WineVO();
//		wvo.setsIdx(sIdx);
//		wvo.setCount(Const.ROW_COUNT);
//		wvo.setSearchText(searchText);
		return mapper.selWineList(wvo);
	}

	public WineVO selWine(WineVO wvo) {
		return mapper.selWine(wvo);
	}

	public int delWine(int wine_num) {
		return mapper.delWine(wine_num);
	}

	public int update(WineVO wvo) {
		return mapper.update(wvo);
	}

	public int insertCmt(WineCmtVO wcvo, HttpSession hs) {
		MemberVO loginUser = (MemberVO) hs.getAttribute("loginUser");
		wcvo.setCid(loginUser.getCid());
		wcvo.setI_user(loginUser.getI_user());
		
		return mapper.insertCmt(wcvo);
	}

	public List<WineCmtVO> cmtList(String wine_name) {
		return mapper.cmtList(wine_name);
	}

	public void modCmt(WineCmtVO wcvo, HttpSession hs) {
		MemberVO loginUser = (MemberVO) hs.getAttribute("loginUser");
		wcvo.setI_user(loginUser.getI_user());
		mapper.modCmt(wcvo);
	}

	public void cmtDel(int i_comment) {
		mapper.cmtDel(i_comment);
	}
}
