/*
 * File Name：CarFakePlateController.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月11日 下午2:47:17
 */
package com.gdws.vehicle.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.gdws.vehicle.service.CarFakePlateService;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月11日 下午2:47:17
 */
@RestController
public class CarFakePlateController {
	
	@Autowired
	private CarFakePlateService carFakePlateService;
	
	@RequestMapping("searchFakePlateCar")
	public JSONObject searchFakePlateCar(String plateNo){
		return carFakePlateService.searchFakePlateCar(plateNo);
	}
	
}
