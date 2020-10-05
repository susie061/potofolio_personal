package com.potofolio.wine.member;

public class MemberVO {
	private int i_user;
	private String cid;
	private String cpw;
	private String salt;
	private String cpwConfirm;
	private String nm;
	private String email;
	private String r_dt;
	
	
	public int getI_user() {
		return i_user;
	}
	public void setI_user(int i_user) {
		this.i_user = i_user;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCpw() {
		return cpw;
	}
	public void setCpw(String cpw) {
		this.cpw = cpw;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getCpwConfirm() {
		return cpwConfirm;
	}
	public void setCpwConfirm(String cpwConfirm) {
		this.cpwConfirm = cpwConfirm;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getR_dt() {
		return r_dt;
	}
	public void setR_dt(String r_dt) {
		this.r_dt = r_dt;
	}
	
	
	
}
