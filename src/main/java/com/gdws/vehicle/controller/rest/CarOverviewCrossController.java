/*
 * File Name：CarOverviewCrossController.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年6月28日 上午11:09:47
 */
package com.gdws.vehicle.controller.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.gdws.vehicle.entity.CarOverviewCross;
import com.gdws.vehicle.repository.CarOverviewCrossRepository;
import com.gdws.vehicle.service.CarOverviewService;

/**
 *
 * @author Administrator (shinena_deng@163.com)
 * @version 1.0, 2017年6月28日 上午11:09:47
 */
@RestController
public class CarOverviewCrossController {
	@Autowired
	private CarOverviewService service;
	@Autowired
	private CarOverviewCrossRepository carOverviewCrossRepository;

	/**
	 * 获取卡过车信息
	 * 
	 * @param crossName
	 * @param crossDate
	 * @return
	 */

	@RequestMapping("/getCarOverviewCross")
	@ResponseBody
	public JSONPObject getCarOverviewCross(String cb, String crossId, String crossDate) {
		JSONObject str = service.getCarOverviewCross(crossId, crossDate);
		return new JSONPObject(cb, str.toString());
	}

}
