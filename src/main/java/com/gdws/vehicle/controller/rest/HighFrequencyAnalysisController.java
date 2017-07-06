/*
 * File Name：HighFrequencyAnalysisController.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月6日 下午3:56:55
 */
package com.gdws.vehicle.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
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
	 * @param crossTime
	 * @return
	 */
	@RequestMapping("highFrequencyAnalysis")
	@ResponseBody
	public JSONPObject highFrequencyAnalysis(String cb, String searchTime) {
		JSONObject str = service.highFrequencyAnalysis(searchTime);
		return new JSONPObject(cb, str.toString());
	}
}
