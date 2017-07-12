/*
 * File Name：MultipleQueryController.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月12日 下午2:56:30
 */
package com.gdws.vehicle.controller.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.gdws.vehicle.service.MultipleQueryService;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月12日 下午2:56:30
 */
@RestController
public class MultipleQueryController {

	@Autowired
	private MultipleQueryService multipleQueryService;

	@RequestMapping("multipleQuery")
	JSONObject multipleQuery(String plateNo,String plateType,String startTime,String endTime,String alertType,String crossName) {
		return multipleQueryService.multipleQuery(plateNo, plateType, startTime, endTime, alertType, crossName);
	}
}
