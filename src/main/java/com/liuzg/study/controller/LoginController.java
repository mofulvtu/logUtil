package com.liuzg.study.controller;


import com.liuzg.study.domain.UserBean;
import com.liuzg.study.filter.VariableContainer;
import com.liuzg.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Desc: 登录控制器
 * @author  liuzg
 * @date  2017/10/23
 */
@Controller
public class LoginController {
//	private Logger logger=Logger.getLogger(this.getClass());
	@Autowired(required=true)
	private UserService userService;

	@RequestMapping("/login")
	public String login(Model model, UserBean user, HttpServletRequest request) {
		/**
		 * 线程对象存入个性化信息
		 */
		VariableContainer.getThreadInstance().setOther("login");
		HttpSession session = request.getSession();
		session.setAttribute("userName",666);
		UserBean userBean=userService.Login(user.getUsername(), user.getUserpwd());
		model.addAttribute("user",userBean);
		return "/index";
	}


	@RequestMapping("/delete")
	public String test(Model model){
		try {
			/**
			 * 线程对象存入个性化信息
			 */
			VariableContainer.getThreadInstance().setOther("find");
			UserBean userBean=userService.Login("admin", "admin");
			/**
			 * 线程对象存入个性化信息
			 */
			VariableContainer.getThreadInstance().setOther("delete");
			model.addAttribute("user",userBean);
			userService.delete(0);

		}catch (Exception e){
			e.printStackTrace();
		}
		return "/tableList";
	}


}
