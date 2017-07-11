/*
 * File Name：HighFrequencyAnalysisService.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月6日 下午3:37:11
 */
package com.gdws.vehicle.service;

import com.alibaba.fastjson.JSONObject;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月6日 下午3:37:11
 */
public interface HighFrequencyAnalysisService {
	/**
	 * 
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	 JSONObject highFrequencyAnalysisAllCross(String startTime,String endTime);

	/**
	 * @param startTime
	 * @param endTime
	 * @param crossName
	 * @return
	 */
	JSONObject highFrequencyAnalysisAccrodingCrossName(String startTime, String endTime, String crossName);
}
