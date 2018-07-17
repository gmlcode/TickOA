package com.qfedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qfedu.dao.LoginLogMapper;
import com.qfedu.domain.LoginLog;
import com.qfedu.service.LoginLogService;

@Service
public class LoginLogServiceImpl implements LoginLogService{

	@Autowired
	private LoginLogMapper mapper;
	@Override
	public boolean insert(LoginLog log) {
		// TODO Auto-generated method stub
		return mapper.insert(log)>0;
	}

	@Override
	public List<LoginLog> queryAll() {
		// TODO Auto-generated method stub
		return mapper.queryAll();
	}

}
