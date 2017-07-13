/*
 * File Name：HighFrequencyAnalysisServiceImpl.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月6日 下午3:39:01
 */
package com.gdws.vehicle.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.gdws.vehicle.entity.HighFrequencyAnalysisRes;
import com.gdws.vehicle.repository.HighFrequencyAnalysisRepository;
import com.gdws.vehicle.service.HighFrequencyAnalysisService;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月6日 下午3:39:01
 */
@Service
public class HighFrequencyAnalysisServiceImpl implements HighFrequencyAnalysisService {
	@Autowired
	private HighFrequencyAnalysisRepository highFrequencyAnalysisRepository;

	@Override
	public JSONObject highFrequencyAnalysisAllCross(String startTime,String endTime) {
		JSONObject obj = new JSONObject();
		try {
			List<HighFrequencyAnalysisRes> highFrequencyAnalysisList = highFrequencyAnalysisRepository
					.getHighFrequencyAllCross(startTime,endTime);
			Iterator<HighFrequencyAnalysisRes> highFrequencyIter=highFrequencyAnalysisList.iterator();
			if(highFrequencyIter.hasNext()){
				List<JSONObject> data=new ArrayList<JSONObject>();
				while(highFrequencyIter.hasNext()){
					HighFrequencyAnalysisRes res=highFrequencyIter.next();
					JSONObject tmp=new JSONObject();
					tmp.put("cross_id", res.getCrossId());
					tmp.put("cross_name", res.getCrossName());
					tmp.put("car_plateNo", res.getPlateNo());
					tmp.put("warning_type", res.getAlertType());
					tmp.put("warning_total", res.getCount());
					data.add(tmp);
				}
				obj.put("code", 200);
				obj.put("message","success");
				obj.put("total", highFrequencyAnalysisList.size());
				obj.put("time", new Timestamp(System.currentTimeMillis()));
				obj.put("starTime", startTime);
				obj.put("endTime", endTime);
				obj.put("type", 0);
				obj.put("data", data);
			}else{
				obj.put("code", 200);
				obj.put("message","success");
				obj.put("total", highFrequencyAnalysisList.size());
				obj.put("time", new Timestamp(System.currentTimeMillis()));
				obj.put("starTime", startTime);
				obj.put("endTime", endTime);
				obj.put("type", 0);
				obj.put("data", "null");
			}
		} catch (Exception e) {
			obj.put("code", 500);
			obj.put("message","error");
			obj.put("time", new Timestamp(System.currentTimeMillis()));
			obj.put("data", null);
			e.printStackTrace();
		}
		return obj;
	}
	
	@Override
	public JSONObject highFrequencyAnalysisAccrodingCrossName(String startTime, String endTime,
			String crossName)  {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		try {
			String string = "";
			String[] arr = crossName.split("");
			for (int i = 0; i < crossName.length(); i++) {
				if (i < crossName.length() - 1) {
					arr[i] = arr[i] + "%";
				}
				string += arr[i];
			}
			crossName=string;
			List<HighFrequencyAnalysisRes> highFrequencyAnalysisList = highFrequencyAnalysisRepository.getHighFrequencyOnCrossName(startTime, endTime, crossName);;
			Iterator<HighFrequencyAnalysisRes> highFrequencyIter=highFrequencyAnalysisList.iterator();
			if(highFrequencyIter.hasNext()){
				List<JSONObject> data=new ArrayList<JSONObject>();
				String crossId=null;
				while(highFrequencyIter.hasNext()){
					HighFrequencyAnalysisRes res=highFrequencyIter.next();
					JSONObject tmp=new JSONObject();
					crossId= res.getCrossId();
					tmp.put("car_plateNo", res.getPlateNo());
					tmp.put("warning_type", res.getAlertType());
					tmp.put("warning_total", res.getCount());
					data.add(tmp);
				}
				obj.put("code", 200);
				obj.put("message","success");
				obj.put("total", highFrequencyAnalysisList.size());
				obj.put("time", new Timestamp(System.currentTimeMillis()));
				obj.put("starTime", startTime);
				obj.put("endTime", endTime);
				obj.put("cross_id",crossId);
				obj.put("cross_name", crossName);
				obj.put("type", 1);
				obj.put("data", data);
			}else{
				obj.put("code", 200);
				obj.put("message","success");
				obj.put("total", highFrequencyAnalysisList.size());
				obj.put("time", new Timestamp(System.currentTimeMillis()));
				obj.put("starTime", startTime);
				obj.put("endTime", endTime);
				obj.put("type", 0);
				obj.put("data", "null");
			}
		} catch (Exception e) {
			obj.put("code", 500);
			obj.put("message","error");
			obj.put("time", new Timestamp(System.currentTimeMillis()));
			obj.put("data", null);
			e.printStackTrace();
		}
		return obj;
	}

}
