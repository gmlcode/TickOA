package com.qfedu.service;



import com.qfedu.domain.Authority;
import com.qfedu.domain.Role;

import java.util.List;


public interface AuthorityService {
    //新增
    int save(Authority authority);
    //查询
   // List<Authority> queryByPage(NoPageQo qo);
    List<Authority> queryAll();
    List<Role> queryRole(int id);


}
