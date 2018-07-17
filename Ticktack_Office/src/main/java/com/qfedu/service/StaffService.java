package com.qfedu.service;

import java.util.List;

import com.qfedu.common.vo.PageVo;
import com.qfedu.common.vo.ResultVo;
import com.qfedu.domain.Staff;

public interface StaffService {

	//新增
	boolean insert(Staff staff);
	ResultVo update(Staff staff);
	ResultVo delete(String no);
	List<Staff> queryAll();
	PageVo<Staff> queryByPage(int page,int count);
	String queryMaxNo();
	boolean insertBatch(List<Staff> list);
	
}
