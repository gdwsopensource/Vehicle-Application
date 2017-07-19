/*
 * File Name：PoliceDistributionController.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月19日 上午11:46:03
 */
package com.gdws.vehicle.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.gdws.vehicle.service.PoliceDistributionService;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月19日 上午11:46:03
 */
@RestController
public class PoliceDistributionController {
	@Autowired
	private PoliceDistributionService service;

	/**
	 * 
	 * @param crossDate
	 * @param crossId
	 * @return
	 */
	@RequestMapping("policeDistribution")
	public JSONObject policeDistribution(String crossDate, String crossId) {
		return service.policeDistribution(crossDate, crossId);
	}

}
