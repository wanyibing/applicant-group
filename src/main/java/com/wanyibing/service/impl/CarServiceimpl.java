package com.wanyibing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanyibing.entity.Car;
import com.wanyibing.mapper.CarMapper;
import com.wanyibing.service.CarService;

@Service
public class CarServiceimpl implements CarService {

	@Autowired
	private CarMapper mapper;

	@Override
	public List<Car> getlist() {
		// TODO Auto-generated method stub
		return mapper.getlist();
	}
	
}
