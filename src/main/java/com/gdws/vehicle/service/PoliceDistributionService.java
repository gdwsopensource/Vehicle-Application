/*
 * File Name：PoliceDistributionService.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月19日 上午11:29:45
 */
package com.gdws.vehicle.service;

import com.alibaba.fastjson.JSONObject;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月19日 上午11:29:45
 */
public interface PoliceDistributionService {
	/**
	 * 
	 * @param crossDate
	 * @param crossId
	 * @return
	 */
	JSONObject policeDistribution(String crossDate, String crossId);
}
