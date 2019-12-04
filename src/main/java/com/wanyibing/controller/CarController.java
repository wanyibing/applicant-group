package com.wanyibing.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wanyibing.entity.Car;
import com.wanyibing.service.CarService;

@Controller
public class CarController {

	@Autowired
	private CarService service;
	
	@RequestMapping("list")
	public String getlist(@RequestParam(defaultValue="1")int pageNum,HttpServletRequest request,Model m) {
		PageHelper.startPage(pageNum, 2);
		List<Car> list = service.getlist();
		PageInfo<Car> info = new PageInfo<>(list);
		request.setAttribute("list", list);
		m.addAttribute("page", info);
		return "list";
	}
	
}
