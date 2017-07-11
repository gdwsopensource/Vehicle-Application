/*
 * File Name：CarODAnalysisController.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月11日 下午5:17:00
 */
package com.gdws.vehicle.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.gdws.vehicle.service.CarODAnalysisSerivce;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月11日 下午5:17:00
 */
@RestController
public class CarODAnalysisController {
	@Autowired
	private CarODAnalysisSerivce service;

	@RequestMapping("crossOdAnalysis")
	public JSONObject crossODAnalysis(String plateNo) {
		return service.carODAnalysis(plateNo);
	}
}
