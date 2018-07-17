package com.qfedu.service.impl;

import java.util.List;

import com.qfedu.common.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qfedu.dao.StudentMapper;
import com.qfedu.domain.Student;
import com.qfedu.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper mapper;

	@Override
	public ResultVo update(String photo, String no) {
		// TODO Auto-generated method stub
		if(mapper.updateByNo(photo, no)>0) {
			return ResultVo.setOK("图片修改成功");
		}else {
			return ResultVo.setERROR("图片修改失败");
		}
	}

	@Override
	public List<Student> queryByGid(int gid) {
		// TODO Auto-generated method stub
		return mapper.queryByGid(gid);
	}

	@Override
	public Student queryByNo(String no) {
		// TODO Auto-generated method stub
		return mapper.queryByNo(no);
	}

}
