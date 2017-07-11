/*
 * File Name：HighFrequencyAnalysisController.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月6日 下午3:56:55
 */
package com.gdws.vehicle.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.gdws.vehicle.entity.HighFrequencyAnalysisRes;
import com.gdws.vehicle.repository.HighFrequencyAnalysisRepository;
import com.gdws.vehicle.service.HighFrequencyAnalysisService;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月6日 下午3:56:55
 */
@RestController
public class HighFrequencyAnalysisController {
	@Autowired
	private HighFrequencyAnalysisService service;

	/**
	 * 
	 * @param cb
	 * @param crossDate
	 * @return
	 */
	@RequestMapping("highFrequencyAnalysis")
	@ResponseBody
	public JSONPObject highFrequencyAnalysis(String cb, String startTime, String endTime) {
		JSONObject str = service.highFrequencyAnalysisAllCross(startTime, endTime);
		return new JSONPObject(cb, str.toString());
	}

	
	@RequestMapping("highFrequencyAnalysisAccrodingCrossName")
	@ResponseBody
	public JSONPObject highFrequencyAnalysisAccrodingCrossName(String cb, String startTime, String endTime,
			String crossName) {
		JSONObject str = service.highFrequencyAnalysisAccrodingCrossName(startTime, endTime, crossName);
		return new JSONPObject(cb, str.toString());
	}
	
	
	
}
