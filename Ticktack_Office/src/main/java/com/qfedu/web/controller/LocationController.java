package com.qfedu.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qfedu.common.util.HttpUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//实现ip获取城市
@Controller
public class LocationController {

	@RequestMapping("/location.do")
	public void test(HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println(request.getRemoteAddr());
		String json=HttpUtils.getLocation(request.getRemoteAddr());
		System.out.println(json);
		response.getWriter().println(json);
	}
}
