package com.potofolio.wine.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.potofolio.wine.member.MemberService;

@Controller
@RequestMapping("/wine")
public class WineListController {
	@Autowired
	private MemberService service;

	@RequestMapping(value = "/recommend", method = RequestMethod.GET)
	public String recommend() {
		return "wine/recommend";
	}
}
