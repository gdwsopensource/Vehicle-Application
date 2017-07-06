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
	 * @param crossTime
	 * @return
	 */
	public JSONObject highFrequencyAnalysis(String crossTime);
}
