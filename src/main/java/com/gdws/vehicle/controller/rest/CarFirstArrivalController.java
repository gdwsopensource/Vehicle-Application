package com.gdws.vehicle.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.gdws.vehicle.service.CarFirstArrivalService;


/**
 *
 * @author miracle (Eric-lzy)
 * @version 1.0, 2017年7月11日 上午11:16:09
 */
@RestController
public class CarFirstArrivalController {

	
	
	
	@Autowired
	private CarFirstArrivalService carFirstArrivalService;


	@RequestMapping("carFirstArrivalService")
	@ResponseBody
	public JSONPObject getCarFirstArrial(String cb, String startTime,String endTime) {
		JSONObject str = carFirstArrivalService.getCarFirstArrial(startTime,endTime);
		return new JSONPObject(cb, str.toString());
	}
	
/*	@RequestMapping("carFirstArrivalService")
	public JSONObject getCarFirstArrial(String cb, String startTime,String endTime) {
		return carFirstArrivalService.getCarFirstArrial(startTime,endTime);
	}*/
}
