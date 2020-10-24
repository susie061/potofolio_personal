package com.potofolio.wine.info;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.potofolio.wine.member.MemberVO;

@Controller
@RequestMapping("/wine") // 주소값
public class WineListController {
	@Autowired
	private WineListService service;

//글작성 화면 뛰어주기
	@RequestMapping(value = "/recommend", method = RequestMethod.GET)
	public String wineRef() {

		return "wine/recommend";
	}

	@RequestMapping(value = "/recommend", method = RequestMethod.POST)
	public String wineRef(WineVO wvo, Model model, HttpSession hs) {

		MemberVO loginUser = (MemberVO) hs.getAttribute("loginUser");
		if (loginUser == null) {
			return "redirect:/user/login";
		}

		System.out.println("wineName: " + wvo.getWine_name());
		System.out.println("wineCtnt: " + wvo.getWineCtnt());
		model.addAttribute(service.insWine(wvo, hs));

		return "redirect:/wine/refList";
	}

//리스트 뿌려주는 화면
	@RequestMapping(value = "/refList", method = RequestMethod.GET)
	public String wineList(Model model, WineVO wvo, HttpSession hs) {
		MemberVO loginUser = (MemberVO) hs.getAttribute("loginUser");
		if (loginUser == null) {
			return "user/login";
		}
		model.addAttribute("data", service.selWineList(wvo));
		return "wine/refList";
	}

//검색

//	디테일 화면 
	@RequestMapping(value = "/wineList", method = RequestMethod.GET)
	public String selWineRef(Model model, WineVO wvo) {
		System.out.println("wine_num: " + wvo.getWine_num());
		model.addAttribute("data", service.selWine(wvo));
		return "wine/selwineList";
	}

//게시글 삭제
	@RequestMapping(value = "/delwine", method = RequestMethod.GET)
	public String wineDelete(@RequestParam int wine_num) {
		System.out.println("wine_num:" + wine_num);
		int result = service.delWine(wine_num);
		return "redirect:/wine/refList";
	}

//게시글 수정	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String wineUpd(Model model, WineVO wvo, HttpSession hs) {
		MemberVO loginUser = (MemberVO) hs.getAttribute("loginUser");
		if (loginUser == null) {
			return "redirect:/user/login";
		}
		model.addAttribute("data", service.selWine(wvo));
		return "wine/recommend";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String wineUpd(WineVO wvo) {

		int result = service.update(wvo);
		return "redirect:/wine/wineList?wine_num=" + wvo.getWine_num();
	}

//	@RequestMapping(value = "/wineCmt", method = RequestMethod.GET)
//	public String wineCmt(WineCmtVO wcvo, HttpSession hs, RedirectAttributes redirectAttributes) {
//
//		MemberVO loginUser = (MemberVO) hs.getAttribute("loginUser");
//		if (loginUser == null) {
//			return "/wine/login";
//		}
//
//		service.insertCmt(wcvo, hs);
//		redirectAttributes.addFlashAttribute("wineName", wcvo.getWine_name());
//		return "redirect:/wine/wineList";
//	}
//
//	@RequestMapping(value = "wineCmt", method = RequestMethod.POST)
//	public String wineCmt(WineCmtVO wcvo, Model model) {
//
//		System.out.println("i_comment: " + wcvo.getI_comment());
//		System.out.println("wine_name:" + wcvo.getWine_name());
//		System.out.println("ctnt: " + wcvo.getCtnt());
//
//		return "redirect:/wine/wineList";
//
//	}
}
