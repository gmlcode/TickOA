package com.qfedu.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.qfedu.common.vo.MenuVo;
import com.qfedu.common.vo.ResultVo;
import com.qfedu.common.vo.UserVo;
import com.qfedu.common.vo.PageVo;
import com.qfedu.domain.LoginLog;
import com.qfedu.domain.User;
import com.qfedu.service.LoginLogService;
import com.qfedu.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//操作用户表
@Controller
public class UserController {
    @Autowired
    private UserService service;
    @Autowired
    private LoginLogService logService;

    //InternalResourceViewResolver
    //登录
    @RequestMapping(value = "/login.do", method = {RequestMethod.POST})
    public String login(String no, String pass, HttpServletResponse resp) {
        User user1 = service.queryByNo(no, pass);
        if (user1 != null) {
            //获取主题
            Subject subject = SecurityUtils.getSubject();
            //生成令牌
            UsernamePasswordToken token = new UsernamePasswordToken(no, pass);
            //告知Shiro
            subject.login(token);//切记一定要执行  告诉Shiro认证成功
            //登录用户存储到Session
            Session session = subject.getSession();
            session.setAttribute("user", user1);
            logService.insert(no);
            return "index";
        } else {
            return "login";
        }
    }

    //注销
    //退出
    @RequestMapping("userloginout.do")
    public String loginout() {
        Subject subject = SecurityUtils.getSubject();
        //退出
        subject.logout();
        return "login";
    }

    //查询登录历史
    @RequestMapping("/loginloglist.do")
    @ResponseBody
    public PageVo<LoginLog> list() {
        PageVo<LoginLog> po = new PageVo<>();
        po.setData(logService.queryAll());
        po.setCode(0);
        po.setCount(po.getData().size());
        po.setMsg("OK");
        return po;
    }
    //查询菜单
    @RequestMapping("/usermenu")
    @ResponseBody
    public List<MenuVo> queryMenu(){
        User user= (User) SecurityUtils.getSubject().getSession().getAttribute("user");
        return service.queryMenuByUid(user.getId());
    }
    //查询所有的用户对应的角色
    @RequestMapping("/userall")
    @ResponseBody
    public PageVo<UserVo> queryAll(int page, int limit, @RequestParam(defaultValue = "") String no, @RequestParam(defaultValue = "1") int flag)
    {
        return service.queryAll(page,limit,no,flag);
    }
    //有效--无效
    @RequestMapping("/userdel")
    @ResponseBody
    public ResultVo del(int id)
    {
        if(service.updateFlag(2,id)){
            return ResultVo.setOK("OK");
        }else{
            return ResultVo.setERROR("ERROR");
        }
    }
    //无效--有效
    @RequestMapping("/userchange")
    @ResponseBody
    public ResultVo change(int id)
    {
        if(service.updateFlag(1,id)){
            return ResultVo.setOK("OK");
        }else{
            return ResultVo.setERROR("ERROR");
        }
    }
    //编辑用户的角色
    @RequestMapping("userroleedit")
    @ResponseBody
    public ResultVo edit(int id,int[] rids){
        if(service.updateRle(id,rids)){
            return ResultVo.setOK("OK");
        }else{
            return ResultVo.setERROR("ERROR");
        }
    }

}
