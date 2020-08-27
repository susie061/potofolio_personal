package com.potofolio.wine.common;

public class KakaoAuth {
	private String access_token;
	private String refresh_toekn;
	private String token_type;
	private int express_in;
	private int refresh_token_expires_in;
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getRefresh_toekn() {
		return refresh_toekn;
	}
	public void setRefresh_toekn(String refresh_toekn) {
		this.refresh_toekn = refresh_toekn;
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public int getExpress_in() {
		return express_in;
	}
	public void setExpress_in(int express_in) {
		this.express_in = express_in;
	}
	public int getRefresh_token_expires_in() {
		return refresh_token_expires_in;
	}
	public void setRefresh_token_expires_in(int refresh_token_expires_in) {
		this.refresh_token_expires_in = refresh_token_expires_in;
	}

	
	
}
