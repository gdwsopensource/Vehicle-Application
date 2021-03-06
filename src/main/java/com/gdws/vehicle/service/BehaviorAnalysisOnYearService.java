/*
 * File Name：BehaviorAnalysisOnYearService.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月5日 下午6:49:42
 */
package com.gdws.vehicle.service;

import com.alibaba.fastjson.JSONObject;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月5日 下午6:49:42
 */
public interface BehaviorAnalysisOnYearService {
	/**
	 * 
	 * @param plateNo
	 * @return
	 */
	JSONObject analysisOnYear(String plateNo);
	/**
	 * 近一年某月的行为分析
	 * @param plateNo
	 * @param crossMonth
	 * @return
	 */
//	JSONObject analysisOnYear(String plateNo,String crossMonth);

}
