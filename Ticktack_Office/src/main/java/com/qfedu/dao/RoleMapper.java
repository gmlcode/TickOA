package com.qfedu.dao;


import com.qfedu.domain.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface RoleMapper {
    //新增
    @Insert("insert into t_role(info,name,parentId) values(#{info},#{root},#{parentId})")
    int save(Role role);
    //删除
    @Delete("delete from t_role where id=#{id}")
    int delete(int id);
    //查询
    @Select("select * from t_role")
    @ResultType(Role.class)
    List<Role> queryAll();

    //查询角色对应的权限
    //修改角色对应的权限
    //新增角色对应的权限
    @Insert("insert into t_roleauthority(rid,aid) values(#{rid},#{aid});")
    int insertAuth(@Param("rid") int rid, @Param("aid") int aid);
    //删除
    @Delete("delete from t_roleauthority where rid=#{rid}")
    int delAuth(int rid);




}
