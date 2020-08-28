package com.potofolio.wine.member;

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

}
