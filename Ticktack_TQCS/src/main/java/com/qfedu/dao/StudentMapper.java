package com.qfedu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.qfedu.domain.Student;

public interface StudentMapper {
	Student queryByNo(String no);
    int updateByNo(@Param("photo")String photo,@Param("no")String no);
  	//查询  班级人数
  	List<Student> queryByGid(int gid);
  	Long queryCountGid(int gid);
}