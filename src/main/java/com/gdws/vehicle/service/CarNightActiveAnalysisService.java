/*
 * File Name：CarNightActiveAnalysisService.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月11日 下午4:11:19
 */
package com.gdws.vehicle.service;

import com.alibaba.fastjson.JSONObject;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月11日 下午4:11:19
 */
public interface CarNightActiveAnalysisService {
	JSONObject carNightActiveAnalysis(String plateNo);
}
