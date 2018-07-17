package com.qfedu.dao;

import java.util.List;

import com.qfedu.domain.LoginLog;

public interface LoginLogMapper {
    int insert(LoginLog record);
	List<LoginLog> queryAll();
}