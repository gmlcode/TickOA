package com.qfedu.service;

import java.util.List;

import com.qfedu.common.vo.ResultVo;
import com.qfedu.domain.Student;

public interface StudentService {

	Student queryByNo(String no);
	ResultVo update(String photo, String no);
	List<Student> queryByGid(int gid);
	
	
}
