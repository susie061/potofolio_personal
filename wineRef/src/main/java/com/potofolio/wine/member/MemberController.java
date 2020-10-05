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
	public String login(Model model, MemberVO mvo, HttpSession hs) {

		System.out.println("cid: " + mvo.getCid());
		System.out.println("cpw: " + mvo.getCpw());
		String msg = "에러발생";

		String cid = mvo.getCid();
		String cpw = mvo.getCpw();
		
		if (cid.equals("")) {
			msg = "아이디를 입력해 주세요";
		} else if (!cid.equals("") && cpw.equals("")) {
			msg = "비밀번호를 입력해 주세요";
			model.addAttribute("cid", cid);
		} else {

			int result = service.login(mvo, hs);
			
			if (result == 1) {
				return "redirect:/main";
			} else if (result == 2) {
				msg = "없는 아이디입니다. 확인해주세요";
			} else if (result == 3) {
				msg = "패스워드가 일치하지 않습니다. 확인해주세요";
			}
		}
		model.addAttribute("msg", msg);
		return "user/login";
	}

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "user/join";
	}

	@RequestMapping(value = "/joinPost", method = RequestMethod.POST)
	public String joinPost(Model model, MemberVO mvo) {
		int result = service.join(mvo);
		return "redirect:/user/login";
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
			return "redirect:/user/login";
		}
		int result = service.kakaoLogin(code, hs);
		return "redirect:/main";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession hs) {
		hs.invalidate();
		return "redirect:/user/login";
	}
}
