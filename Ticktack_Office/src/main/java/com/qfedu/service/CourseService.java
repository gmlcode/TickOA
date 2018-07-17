package com.qfedu.service;

import java.util.List;

import com.qfedu.common.vo.PageVo;
import com.qfedu.common.vo.ResultVo;
import com.qfedu.domain.Course;

public interface CourseService {

	//新增
	boolean insert(Course course);
	ResultVo update(Course course);
	ResultVo delete(int id);
	List<Course> queryAll();
	PageVo<Course> queryByPage(int page,int count);
	
	
}
