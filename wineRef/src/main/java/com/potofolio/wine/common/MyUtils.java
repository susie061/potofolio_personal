package com.potofolio.wine.common;

import org.mindrot.jbcrypt.BCrypt;

public class MyUtils {
	// 비밀번호 암호화
	public static String gensalt() {
		return BCrypt.gensalt();
	}

	public static String hashPassword(String pw, String salt) {
		return BCrypt.hashpw(pw, salt);
	}

	// 인증번호 전송하기 위한 부분
	public static String makeRandomnumber(int len) {
		String result = "";
		for (int i = 0; i < len; i++) {
			result += (int) (Math.random() * 10);
		}
		return result;
	}
}
