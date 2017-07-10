/*
 * File Name：TrankAnalysisService.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月10日 下午1:58:22
 */
package com.gdws.vehicle.service;

import com.alibaba.fastjson.JSONObject;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月10日 下午1:58:22
 */
public interface TrankAnalysisService {
	/**
	 * 
	 * @param plateNo
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	JSONObject trankAnalysisOnPlateNo(String plateNo, String startTime, String endTime);
}
