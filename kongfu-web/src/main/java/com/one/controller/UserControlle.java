package com.one.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.one.entity.User;
import com.one.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserControlle {
	
	@Resource
    private IUserService userService;
    
	/**
	 * 用户初始化 test2-git again
	 * @param request
	 * @param model
	 * @return
	 */
    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request,Model model) {
        System.out.println("UserController showUser");
        int id = Integer.parseInt(request.getParameter("id"));  
        User user = userService.getUserById(id);  
        model.addAttribute("user", user);  
        return "showUser";  
    }

}
