package com.qfedu.web.controller;

import com.qfedu.domain.Role;
import com.qfedu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class RoleController {
    @Autowired
    private RoleService service;

    @RequestMapping("roleall")
    @ResponseBody
    public List<Role> queryAll(){
        return service.queryAll();
    }
}
