/**
 * @package mybatis.bean
 * @author liubin
 * @date 2018年7月2日
*/
package com.example.recommend.entity;

public class UserInfo {
	private String userid;
	private String username;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String password;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}


}
