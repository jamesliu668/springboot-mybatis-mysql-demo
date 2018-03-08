package com.james.demo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.james.demo.mybatis.model.WpUsers;

import com.james.demo.mybatis.mapper.WpUsersMapper;

@RestController
public class UserController {
	@Autowired
	WpUsersMapper userDao;
	
    @RequestMapping("/user")    
    WpUsers getUser() {
    	WpUsers user = userDao.selectByPrimaryKey((long) 1);
    	return user;
    }
    
    @RequestMapping("/test")
    String showWelcomeMsg() {
    	return "Hello World";
    }
}