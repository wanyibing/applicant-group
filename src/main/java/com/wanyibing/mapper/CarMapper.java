package com.wanyibing.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.wanyibing.entity.Car;

public interface CarMapper {

	@Select("select * from t_car")
	List<Car> getlist();

	
	
}
