/*
 * File Name：TrankAnalysisController.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月10日 下午2:26:00
 */
package com.gdws.vehicle.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.gdws.vehicle.entity.TrankAnalysis;
import com.gdws.vehicle.service.TrankAnalysisService;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月10日 下午2:26:00
 */
@RestController
public class TrankAnalysisController {
	@Autowired
	private TrankAnalysisService service;

	@RequestMapping("trankAnalysisOnPlateNo")
	@ResponseBody
	public JSONPObject  JSONPObject(String cb, String plateNo, String startTime, String endTime) {
		JSONObject str = service.trankAnalysisOnPlateNo(plateNo, startTime, endTime);
		return new JSONPObject(cb, str.toString());
	}
	

}
