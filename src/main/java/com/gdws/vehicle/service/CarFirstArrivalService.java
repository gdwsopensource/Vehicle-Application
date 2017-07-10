package com.gdws.vehicle.service;

import com.alibaba.fastjson.JSONObject;

public interface CarFirstArrivalService {


	 /**
	 * @param crossTime
	 * @return
	 */
	JSONObject getCarFirstArrial(String plateNo);
}
