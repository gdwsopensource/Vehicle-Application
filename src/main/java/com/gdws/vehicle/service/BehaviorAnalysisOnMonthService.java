/*
 * File Name：BehaviorAnalysisOnMonthService.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月5日 下午4:45:08
 */
package com.gdws.vehicle.service;

import com.alibaba.fastjson.JSONObject;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月5日 下午4:45:08
 */
public interface BehaviorAnalysisOnMonthService {
	/**
	 * 近一个月总行为分析
	 * @param plateNo
	 * @return
	 */
	JSONObject analysisOnMonth(String plateNo);
	
	/**
	 * 近一个月某天行为分析
	 */
	// JSONObject analysisOnMonth(String plateNo, String crossDate);
}
