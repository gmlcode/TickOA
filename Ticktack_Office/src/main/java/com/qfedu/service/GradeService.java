package com.qfedu.service;

import java.util.List;

import com.qfedu.common.vo.PageVo;
import com.qfedu.common.vo.ResultVo;
import com.qfedu.domain.Grade;

public interface GradeService {

	//新增
	boolean insert(Grade grade);
	ResultVo update(Grade grade);
	ResultVo delete(int id);
	List<Grade> queryAll();
	PageVo<Grade> queryByPage(int page,int count);
	
	
}
