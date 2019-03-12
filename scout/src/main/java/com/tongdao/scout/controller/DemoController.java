package com.tongdao.scout.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tongdao.scout.pojo.Demo;
import com.tongdao.scout.service.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {
	@Autowired
	private DemoService demoService;
	@RequestMapping("/hello")
	public String hello(String from) {
		return "hello "+from +" returned by server";
	}
	@GetMapping(value="/selectById/{id}")
	public Demo selectById(@PathVariable Integer id, HttpServletRequest request) {
		System.out.println("=======dev================================");
		return demoService.selectOneById(id);
	}
}
