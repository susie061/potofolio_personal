package com.potofolio.wine.info;

public class WineVO {
	private int wine_num;
	private String wine_name;
	private String wineCtnt;
	private String r_dt;
	private int i_user;

	private int sIdx;
	private int count;
	private String searchText;

	public int getWine_num() {
		return wine_num;
	}

	public void setWine_num(int wine_num) {
		this.wine_num = wine_num;
	}

	public String getWine_name() {
		return wine_name;
	}

	public void setWine_name(String wine_name) {
		this.wine_name = wine_name;
	}

	public String getWineCtnt() {
		return wineCtnt;
	}

	public void setWineCtnt(String wineCtnt) {
		this.wineCtnt = wineCtnt;
	}

	public String getR_dt() {
		return r_dt;
	}

	public void setR_dt(String r_dt) {
		this.r_dt = r_dt;
	}

	public int getI_user() {
		return i_user;
	}

	public void setI_user(int i_user) {
		this.i_user = i_user;
	}

	public int getsIdx() {
		return sIdx;
	}

	public void setsIdx(int sIdx) {
		this.sIdx = sIdx;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

}
