/*
 * File Name：CarODAnalysisServiceImpl.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月11日 下午5:01:12
 */
package com.gdws.vehicle.service.impl;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.gdws.vehicle.entity.CarOD;
import com.gdws.vehicle.entity.CrossInfo;
import com.gdws.vehicle.repository.CarODAnalysisRepository;
import com.gdws.vehicle.repository.CrossInfoRepository;
import com.gdws.vehicle.service.CarODAnalysisSerivce;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月11日 下午5:01:12
 */
@Service
public class CarODAnalysisServiceImpl implements CarODAnalysisSerivce {
	@Autowired
	private CarODAnalysisRepository carODAnalysisRepository;
	@Autowired
	private CrossInfoRepository crossInfoRepository;

	@Override
	public JSONObject carODAnalysis(String plateNo) {
		JSONObject obj = new JSONObject();
		try {
			List<CarOD> carODList = carODAnalysisRepository.getCarODByPlateNO(plateNo);
			Iterator<CarOD> carODListIter = carODList.iterator();
			if (carODListIter.hasNext()) {
				List<JSONObject> data = new ArrayList<JSONObject>();
				String plateType = null;
				while (carODListIter.hasNext()) {
					CarOD carOD = carODListIter.next();
					JSONObject tmp = new JSONObject();
					plateType = carOD.getPlateType();
					tmp.put("crossMonth", carOD.getCrossMonth());
					CrossInfo crossInfoO=crossInfoRepository.findByCrossId(carOD.getOriginCrossId());
					CrossInfo crossInfoD=crossInfoRepository.findByCrossId(carOD.getDestinationCrossId());
					tmp.put("originCrossName", crossInfoO.getCrossName());
					tmp.put("origin_lng", crossInfoO.getBdLongitude());
					tmp.put("origin_lat", crossInfoO.getBdLatitude());
					tmp.put("destCrossName", crossInfoD.getCrossName());
					tmp.put("dest_lng", crossInfoD.getBdLongitude());
					tmp.put("dest_lat", crossInfoD.getBdLatitude());
					data.add(tmp);
				}
				obj.put("code", 200);
				obj.put("message", "success");
				obj.put("plateNo", plateNo);
				obj.put("plateType", plateType);
				obj.put("data", data);
				obj.put("total", carODList.size());
				obj.put("time", new Timestamp(System.currentTimeMillis()));
			} else {
				obj.put("code", 200);
				obj.put("message", "success");
				obj.put("plateNo", plateNo);
				obj.put("data", "null");
				obj.put("time", new Timestamp(System.currentTimeMillis()));
			}
		} catch (Exception e) {
			obj.put("code", 500);
			obj.put("message", "error");
			obj.put("plateNo", plateNo);
			obj.put("data", null);
			obj.put("time", new Timestamp(System.currentTimeMillis()));
			e.printStackTrace();
		}
		return obj;
	}

}
