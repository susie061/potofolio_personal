package com.potofolio.wine.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping(value = "main", method = RequestMethod.GET)
	public String entrance() {
		return "main";
	}
}
