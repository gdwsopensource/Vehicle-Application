/*
 * File Name：TrankAnalysisServiceImpl.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月10日 下午2:00:06
 */
package com.gdws.vehicle.service.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.gdws.vehicle.entity.TrankAnalysis;
import com.gdws.vehicle.repository.TrankAnalysisRespository;
import com.gdws.vehicle.service.TrankAnalysisService;
import com.gdws.vehicle.utils.ParamsFormat;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月10日 下午2:00:06
 */
@Service
public class TrankAnalysisServiceImpl implements TrankAnalysisService {
	@Autowired
	private TrankAnalysisRespository trankAnalysisRespository;

	@Override
	public JSONObject trankAnalysisOnPlateNo(String plateNo, String startTime, String endTime) {
		JSONObject obj = new JSONObject();
		ParamsFormat params=new ParamsFormat();
		plateNo=params.ParamsFormat(plateNo);
		try {
			List<TrankAnalysis> trankAnalysisOnPlateNoList=trankAnalysisRespository.trankAnalysisOnPlateNo(plateNo, startTime, endTime);
			Iterator<TrankAnalysis> trankAnalysisOnPlateNoListIter=trankAnalysisOnPlateNoList.iterator();
			 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
			if(trankAnalysisOnPlateNoListIter.hasNext()){
				List<JSONObject> data=new ArrayList<JSONObject>();
				while(trankAnalysisOnPlateNoListIter.hasNext()){
					JSONObject tmp=new JSONObject();
					TrankAnalysis trankAnalysisData=trankAnalysisOnPlateNoListIter.next();
					tmp.put("id", trankAnalysisData.getId());
					tmp.put("plateNo",trankAnalysisData.getPlateNo());
					tmp.put("alertType", trankAnalysisData.getAlertType());
					tmp.put("plateType", trankAnalysisData.getPlateType());
					tmp.put("crossName",trankAnalysisData.getCrossName());
					tmp.put("crossId", trankAnalysisData.getCrossId());
					tmp.put("lat", trankAnalysisData.getLat());
					tmp.put("lng", trankAnalysisData.getLng());
					tmp.put("crossDirection", trankAnalysisData.getCrossDirection());
					tmp.put("alertTime", format.format(format.parse(trankAnalysisData.getAlertTime())));
					data.add(tmp);
				}
				obj.put("code", 200);
				obj.put("message", "success");
				obj.put("data", data);
				obj.put("total", trankAnalysisOnPlateNoList.size());
				obj.put("time", new Timestamp(System.currentTimeMillis()));
			}else{
				obj.put("code", 200);
				obj.put("message", "success");
				obj.put("plateNo",plateNo);
				obj.put("data", "null");
				obj.put("time", new Timestamp(System.currentTimeMillis()));
			}
		} catch (Exception e) {
			obj.put("code", 500);
			obj.put("message", "error");
			obj.put("plateNo",plateNo);
			obj.put("data",null);
			obj.put("time", new Timestamp(System.currentTimeMillis()));
			e.printStackTrace();
		}
		return obj;
	}

}
