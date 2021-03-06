/*
 * File Name：BehaviorAnalysisOnYearController.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月5日 下午6:56:38
 */
package com.gdws.vehicle.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.gdws.vehicle.entity.ResWithLngAndLat;
import com.gdws.vehicle.repository.BehaviorAnalysisOnYearRepository;
import com.gdws.vehicle.service.BehaviorAnalysisOnYearService;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月5日 下午6:56:38
 */
@RestController
public class BehaviorAnalysisOnYearController {
	@Autowired
	private BehaviorAnalysisOnYearService service;

	/**
	 * 近一年总的行为分析
	 * @param cb
	 * @param plateNo
	 * @return
	 */
	@RequestMapping("analysisOnYear")
	@ResponseBody
	public JSONPObject analysisOnYear(String cb, String plateNo) {
		JSONObject str = service.analysisOnYear(plateNo);
		return new JSONPObject(cb, str.toString());
	}
	/**
	 * 近一年某月行为分析
	 * @param cb
	 * @param plateNo
	 * @param crossMonth
	 * @return
	 */
//	@RequestMapping("analysisOnYear")
//	@ResponseBody
//	public JSONPObject analysisOnYear(String cb, String plateNo,String crossMonth) {
//		JSONObject str = service.analysisOnYear(plateNo,crossMonth);
//		return new JSONPObject(cb, str.toString());
//	}
	

}
