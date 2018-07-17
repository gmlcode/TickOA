package com.qfedu.web.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import com.qfedu.common.vo.PageVo;
import com.qfedu.common.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qfedu.domain.InterviewQuest;
import com.qfedu.domain.User;
import com.qfedu.service.InterviewQuestService;

@Controller
public class InterviewQuestController {
	@Autowired
	private InterviewQuestService service;
	//新增
	@RequestMapping("/questadd.do")
	@ResponseBody
	public ResultVo add(InterviewQuest quest, HttpSession session) {
		User user=(User)session.getAttribute("user");
		quest.setNo(user.getNo());
		quest.setCreatedate(new Date());
		if(service.insert(quest)) {
			return ResultVo.setOK("OK");
		}else {
			return ResultVo.setERROR("ERROR");
		}
		
	}
	//查询
	@RequestMapping("/questpage.do")
	@ResponseBody
	public PageVo<InterviewQuest> query(int page, int limit) {
		return service.queryByPage(page, limit);
	}

}
