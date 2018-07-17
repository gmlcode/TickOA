package com.qfedu.service;

import java.util.List;

import com.qfedu.common.vo.PageVo;
import com.qfedu.common.vo.ResultVo;
import com.qfedu.domain.Depart;

public interface DepartService {

	//新增
	boolean insert(Depart depart);
	ResultVo update(String name,int id);
	ResultVo delete(int id);
	PageVo<Depart> queryByPage(int page,int count);
	Long queryCount(int index,int count);
	List<Depart> queryAll();
	
}
