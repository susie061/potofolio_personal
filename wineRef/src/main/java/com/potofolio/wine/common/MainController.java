package com.potofolio.wine.common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping(value = "main", method = RequestMethod.GET)
	public String entrance() {
		return "main";
	}
	
//	@ResponseBody
//	@RequestMapping(value = "/getListData", method = RequestMethod.GET)
//	public Map<String, Object> getListData(@RequestParam int page, @RequestParam String searchText) {
//		
//		System.out.println("page : " + page);
//		System.out.println("searchText : " + searchText);
//		
//		Map<String, Object> map = new HashMap();
//		map.put("result", service.selWineList(page ,searchText));
//		
//		return map;
//	}
	
}
