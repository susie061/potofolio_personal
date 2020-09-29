package com.potofolio.wine.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.potofolio.wine.common.MyUtils;

@Service
public class MemberService {

	@Autowired
	private MemberMapper mapper;

	public int join(MemberVO mvo) {
		int result = 0;
		String salt = MyUtils.gensalt();
		String pw = mvo.getCpw();
		String hashPw = MyUtils.hashPassword(pw, salt);

		mvo.setCpw(hashPw);
		mvo.setSalt(salt);

		result = mapper.join(mvo);
		return result;
	}

	// 1:로그인 성공 , 2:정보 없음, 3:비번 틀림
	public int login(MemberVO mvo, HttpSession hs) {
		int result = 0;
		MemberVO data = mapper.login(mvo);
		if (data == null) {
			result = 2;
		} else {
			String clientCpw = MyUtils.hashPassword(mvo.getCpw(), data.getSalt());
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
	public int kakaoLogin(String code, HttpSession hs) {
		int result = 0;
		return result;
	}
	
	public int chkId(String cid) {
		
		return mapper.chkId(cid) ;
	}
}
