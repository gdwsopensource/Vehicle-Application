/*
 * File Name：MultipleQueryService.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月12日 下午4:22:27
 */
package com.gdws.vehicle.service;

import com.alibaba.fastjson.JSONObject;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月12日 下午4:22:27
 */
public interface MultipleQueryService {
	/**
	 * 综合查询，支持精确查询及模糊查询
	 * @param plateNo
	 * @param plateType
	 * @param startTime
	 * @param endTime
	 * @param alertType
	 * @param crossName
	 * @return
	 */
JSONObject multipleQuery(String plateNo,String plateType,String startTime,String endTime,String alertType,String crossName);
}
