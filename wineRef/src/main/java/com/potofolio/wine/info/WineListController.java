package com.potofolio.wine.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.potofolio.wine.member.MemberService;

@Controller
@RequestMapping("/wine") //주소값
public class WineListController {
	@Autowired
	private MemberService service;

	@RequestMapping(value = "/ref", method = RequestMethod.GET)
	public String wineRef() {
		return "wine/recommend";
	}
	
	@RequestMapping(value = "/refPost", method = RequestMethod.POST)
	public String wineRef(Model model) {
		return "redirect:/wine/refList";
	}
	
	@RequestMapping(value = "/refList", method = RequestMethod.GET)
	public String refList(Model model) {
		return "wine/refList";
	}
	
	@RequestMapping(value = "/refListPost", method = RequestMethod.POST)
	public String wineRef(Model model,WineVO wvo) {
		
		
		return "redirect:/wine/refList";
	}
	
}
