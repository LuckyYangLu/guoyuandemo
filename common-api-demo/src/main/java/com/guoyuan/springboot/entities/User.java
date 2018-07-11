package com.guoyuan.springboot.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class User implements Serializable {
	
	private Long userId;
	private String userName;
	private String userPwd;
	public User(String userName, String userPwd) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
	}
	
	
	

}
