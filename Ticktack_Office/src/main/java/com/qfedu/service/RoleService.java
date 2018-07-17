package com.qfedu.service;



import com.qfedu.domain.Role;

import java.util.List;


public interface RoleService {
    //新增
    int save(Role role);
    //查询
    List<Role> queryAll();
    //修改角色对应的权限
    boolean updateAuth(int rid, int[] aids);
}
