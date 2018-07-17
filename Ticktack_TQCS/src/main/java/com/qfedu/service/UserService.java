package com.qfedu.service;

import com.qfedu.domain.User;

public interface UserService {

	//登录
	public User queryByNo(String no,String password);
	boolean updatePwd(String pass,String no);
}
