/*
 * File Name：BehaviorPredictController.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月1日 下午5:03:57
 */
package com.gdws.vehicle.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.gdws.vehicle.service.BehaviorpredictService;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月1日 下午5:03:57
 */
@RestController
public class BehaviorPredictController {
	@Autowired
	private BehaviorpredictService service;

	@RequestMapping("behaviorPredict")
	public JSONObject behaviorPredict(String plateNo) {
		return service.behaviorPredict(plateNo);
	}
}
