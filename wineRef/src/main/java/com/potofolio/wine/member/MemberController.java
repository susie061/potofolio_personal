package com.potofolio.wine.member;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.potofolio.wine.common.Const;

@Controller
@RequestMapping("/user")
public class MemberController {

	@Autowired
	private MemberService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "user/login";
	}

	@RequestMapping(value = "/loginPost", method = RequestMethod.POST)
	public String login(Model model, MemberVO param, HttpSession hs) {
		int result = service.login(param, hs);
		System.out.println("result : " + result);
		
		String msg = "에러발생";
		switch(result) {
		case 1:
			return "redirect:/wine/recommend";
		case 2:
			msg = "아이디를 확인해 주세요";
			break;
		case 3:
			msg = "비밀번호를 확인해 주세요";
			break;
		}
		model.addAttribute("msg", msg);
		return "user/login";
	}

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "user/join";
	}

	@ResponseBody
	@RequestMapping(value = "/chkId", method = RequestMethod.GET)
	public Map<String, Object> chkId(@RequestParam String cid) {	

		Map<String, Object> map = new HashMap<String, Object>();
		int result = service.chkId(cid);
		
		System.out.println("중복체크 :" + result);
		map.put("result", result);
		
		return map;
	}
	
	@RequestMapping(value = "/joinPost", method = RequestMethod.POST)
	public String join(Model model, MemberVO param) {
		int result = service.join(param);
		return "redirect:/user/login";
	}
	


	@RequestMapping(value = "/kakaoLogin", method = RequestMethod.GET)
	public String loginKAKAO() {
		String url = String.format(
				"redirect:https://kauth.kakao.com/oauth/authorize?" + "client_id=%s&redirect_uri=%s&response_type=code",
				Const.KAKAO_CLIENT_ID, Const.KAKAO_AUTH_REDIRECT_URL);
		return url;

	}

	@RequestMapping(value = "/joinkakao", method = RequestMethod.GET)
	public String joinKAKAO(@RequestParam(required = false) String code, @RequestParam(required = false) String error,
			HttpSession hs) {
		System.out.println("code: " + code);
		System.out.println("error: " + error);

		if (code == null) {

		}
		return "redirect:/wine/recommend";
	}
}
