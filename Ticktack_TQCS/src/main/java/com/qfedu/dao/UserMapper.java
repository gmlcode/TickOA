package com.qfedu.dao;

import org.apache.ibatis.annotations.Param;

import com.qfedu.domain.User;

public interface UserMapper {
	//查询
	public User queryByNo(String no);
	//修改密码
	int updatePwd(@Param("pass")String pass,@Param("no")String no);
	
}
