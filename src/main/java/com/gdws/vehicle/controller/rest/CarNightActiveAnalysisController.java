/*
 * File Name：CarNightActiveAnalysisController.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月11日 下午4:20:54
 */
package com.gdws.vehicle.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.gdws.vehicle.service.CarNightActiveAnalysisService;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月11日 下午4:20:54
 */
@RestController
public class CarNightActiveAnalysisController {
	@Autowired
	private CarNightActiveAnalysisService service;

	@RequestMapping("nightActiveAnalysis")
	public JSONObject nightActiveAnalysis(String startTime, String endTime, String plateNo) {
		return service.carNightActiveAnalysis(startTime, endTime, plateNo);
	}
}
