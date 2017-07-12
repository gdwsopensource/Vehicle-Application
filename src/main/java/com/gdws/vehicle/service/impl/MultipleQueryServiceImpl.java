/*
 * File Name：MultipleQueryServiceImpl.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月12日 下午4:24:02
 */
package com.gdws.vehicle.service.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.gdws.vehicle.entity.MultipleQuery;
import com.gdws.vehicle.repository.MultipleQueryRepository;
import com.gdws.vehicle.service.MultipleQueryService;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月12日 下午4:24:02
 */
@Service
public class MultipleQueryServiceImpl implements MultipleQueryService {
	@Autowired
	private MultipleQueryRepository multipleQueryRepository;

	@Override
	public JSONObject multipleQuery(String plateNo, String plateType, String startTime, String endTime,
			String alertType, String crossName) {
		JSONObject obj = new JSONObject();
		try {
			plateNo=StringFormat(plateNo);
			plateType=StringFormat(plateType);
			alertType=StringFormat(alertType);
			crossName=StringFormat(crossName);
			if((startTime==null || startTime=="")&&(endTime==null || endTime=="")){
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
				String yesterday=format.format(new Date(new Date().getTime() - 24*3600*1000));
				startTime=yesterday+" 00:00";
				endTime=yesterday+" 23:59";
				System.out.println(startTime);
			}
			List<MultipleQuery> multipleQueryRes = multipleQueryRepository.multipleQuery(plateNo, plateType, startTime,
					endTime, alertType, crossName);
			Iterator<MultipleQuery> multipleQueryResIter = multipleQueryRes.iterator();
			if (multipleQueryResIter.hasNext()) {
				obj.put("code", 200);
				obj.put("message", "success");
				obj.put("time", new Timestamp(System.currentTimeMillis()));
				obj.put("total", multipleQueryRes.size());
				obj.put("data", multipleQueryRes);
			} else {
				obj.put("code", 200);
				obj.put("message", "success");
				obj.put("time", new Timestamp(System.currentTimeMillis()));
				obj.put("total", multipleQueryRes.size());
				obj.put("data", "null");
			}
		} catch (Exception e) {
			obj.put("code", 500);
			obj.put("message", "error");
			obj.put("time", new Timestamp(System.currentTimeMillis()));
			obj.put("data", null);
			e.printStackTrace();
		}
		return obj;
	}

	/**
	 * 字符串拼接
	 * 
	 * @param str
	 * @return
	 */
	public String StringFormat(String str) {
		String string = "";
		String[] arr = str.split("");
		for (int i = 0; i < str.length(); i++) {
			if (i < str.length() - 1) {
				arr[i] = arr[i] + "%";
			}
			string += arr[i];
		}
		return string;
	}
}
