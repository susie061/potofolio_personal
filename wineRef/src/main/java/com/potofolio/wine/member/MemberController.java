package com.potofolio.wine.member;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.potofolio.wine.common.Const;

@Controller
public class MemberController {

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "user/login";
	}

	@RequestMapping(value = "loginPost", method = RequestMethod.POST)
	public String login(Model model) {
		return "join";
	}

	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String join() {
		return "user/join";
	}

	@RequestMapping(value = "joinPost", method = RequestMethod.POST)
	public String join(Model model) {
		return "user/join";
	}

	@RequestMapping(value = "/kakaoLogin", method = RequestMethod.GET)
	public String loginKAKAO() {
		String url = String.format(
				"redirect:https://kauth.kakao.com/oauth/authorize?" + "client_id=%s&redirect_uri=%s&response_type=code",
				Const.KAKAO_CLIENT_ID, Const.KAKAO_AUTH_REDIRECT_URL);
		return url;

	}

	@RequestMapping(value = "joinkakao", method = RequestMethod.GET)
	public String joinKAKAO(@RequestParam(required = false) String code, @RequestParam(required = false) String error,
			HttpSession hs) {

		return "";
	}
}
