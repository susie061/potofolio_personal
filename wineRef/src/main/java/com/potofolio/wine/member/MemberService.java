package com.potofolio.wine.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.potofolio.wine.common.MyUtils;

@Service
public class MemberService {

	@Autowired
	private MemberMapper mapper;

	public int join(MemberVO param) {
		int result = 0;
		String salt = MyUtils.gensalt();
		String pw = param.getCpw();
		String hashPw = MyUtils.hashPassword(pw, salt);

		param.setCpw(hashPw);
		param.setSalt(salt);

		result = mapper.join(param);
		return result;
	}

	public int chkId(String cid) {

		int result = 0;
		result = mapper.chkId(cid);

		return result;
	}

	// 1:로그인 성공 , 2:정보 없음, 3:비번 틀림
	public int login(MemberVO param, HttpSession hs) {
		int result = 0;
		MemberVO data = mapper.login(param);
		if (data == null) {
			result = 2;
		} else {
			String clientCpw = MyUtils.hashPassword(param.getCpw(), data.getSalt());
			if (data.getCpw().equals(clientCpw)) {
				result = 1;
				data.setCpw(null);
				hs.setAttribute("loginUser", data);
			} else {
				result = 3;
			}
		}
		return result;
	}
}
