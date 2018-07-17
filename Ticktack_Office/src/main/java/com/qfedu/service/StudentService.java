package com.qfedu.service;

import java.util.List;

import com.qfedu.common.vo.PageVo;
import com.qfedu.common.vo.ResultVo;
import com.qfedu.domain.Student;

public interface StudentService {

	//新增
	boolean insert(Student student);
	ResultVo update(Student student);
	ResultVo delete(String no);
	List<Student> queryAll();
	PageVo<Student> queryByPage(int page,int count);
	List<Student> queryByGid(int gid);
	Long queryCountBiGid(int gid);
	String queryMaxNo();
	boolean insertBatch(List<Student> list);
	
}
