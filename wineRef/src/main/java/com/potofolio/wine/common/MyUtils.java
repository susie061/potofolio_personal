package com.potofolio.wine.common;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.web.multipart.MultipartFile;

public class MyUtils {
	// 비밀번호 암호화
	public static String gensalt() {
		return BCrypt.gensalt();
	}

	public static String hashPassword(String pw, String salt) {
		return BCrypt.hashpw(pw, salt);
	}
}
