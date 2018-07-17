package com.qfedu.service;

import java.util.List;

import com.qfedu.domain.LoginLog;

public interface LoginLogService {

	boolean insert(LoginLog log);
	List<LoginLog> queryAll();
}
