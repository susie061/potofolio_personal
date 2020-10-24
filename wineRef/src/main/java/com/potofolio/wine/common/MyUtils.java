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
}
