/*
 * File Name：CarFakePlateService.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月11日 下午3:19:32
 */
package com.gdws.vehicle.service;

import com.alibaba.fastjson.JSONObject;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月11日 下午3:19:32
 */
public interface CarFakePlateService {
	/**
	 * 
	 * @param plateNo
	 * @return
	 */
	JSONObject searchFakePlateCar(String plateNo);

}
