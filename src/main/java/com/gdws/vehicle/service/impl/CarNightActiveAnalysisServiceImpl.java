/*
 * File Name：CarNightActiveAnalysisServiceImpl.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月11日 下午4:12:21
 */
package com.gdws.vehicle.service.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.gdws.vehicle.entity.CarNightActive;
import com.gdws.vehicle.entity.CarNightActiveRes;
import com.gdws.vehicle.repository.CarNightActiveAnalysisRepository;
import com.gdws.vehicle.service.CarNightActiveAnalysisService;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月11日 下午4:12:21
 */
@Service
public class CarNightActiveAnalysisServiceImpl implements CarNightActiveAnalysisService {
	@Autowired
	private CarNightActiveAnalysisRepository carNightActiveAnalysisRepository;

	@Override
	public JSONObject carNightActiveAnalysis(String startTime, String endTime, String plateNo) {
		JSONObject obj = new JSONObject();
		try {
			List<CarNightActiveRes> allCrossList = null;
			List<CarNightActiveRes> nightActiveList = null;
			if (plateNo == null || plateNo == "") {
				allCrossList=carNightActiveAnalysisRepository.getAllCrossGroupByPlateNo(startTime, endTime);
				Iterator<CarNightActiveRes> carNightActivelistIter = allCrossList.iterator();
				if(carNightActivelistIter.hasNext()){
					List<JSONObject> data = new ArrayList<JSONObject>();
					while(carNightActivelistIter.hasNext()){
						CarNightActiveRes carNightActiveObject = carNightActivelistIter.next();
						List<CarNightActiveRes> allCross=carNightActiveAnalysisRepository.getAllCrossByPlateNo(startTime, endTime, carNightActiveObject.getPlateNo());
						nightActiveList = carNightActiveAnalysisRepository.getCarNightActiveByPlateNo(startTime, endTime,
								carNightActiveObject.getPlateNo());
						Double m = (double) allCross.size();
						Double n = (double) nightActiveList.size();
						JSONObject tmp = new JSONObject();
						tmp.put("plate_type", carNightActiveObject.getPlateType());
						tmp.put("plate_no", carNightActiveObject.getPlateNo());
						if (n / m >= 0.8) {
							tmp.put("night_active", 1);
						} else {
							tmp.put("night_active", 0);
						}
						data.add(tmp);
					}
					obj.put("code", 200);
					obj.put("message", "success");
					obj.put("total", allCrossList.size());
					obj.put("data", data);
					obj.put("time", new Timestamp(System.currentTimeMillis()));
				}else{
					obj.put("code", 200);
					obj.put("message", "success");
					obj.put("total", allCrossList.size());
					obj.put("data", "null");
					obj.put("time", new Timestamp(System.currentTimeMillis()));
				}
			} else {
				allCrossList = carNightActiveAnalysisRepository.getAllCrossByPlateNo(startTime, endTime, plateNo);
				nightActiveList = carNightActiveAnalysisRepository.getCarNightActiveByPlateNo(startTime, endTime,
						plateNo);
				Iterator<CarNightActiveRes> carNightActivelistIter = allCrossList.iterator();
				List<JSONObject> data = new ArrayList<JSONObject>();
				if (carNightActivelistIter.hasNext()) {
					Double m = (double) allCrossList.size();
					Double n = (double) nightActiveList.size();
					JSONObject tmp = new JSONObject();
					CarNightActiveRes carNightActiveObject = carNightActivelistIter.next();
					tmp.put("plate_type", carNightActiveObject.getPlateType());
					tmp.put("plate_no", carNightActiveObject.getPlateNo());
					if (n / m >= 0.8) {
						tmp.put("night_active", 1);
					} else {
						tmp.put("night_active", 0);
					}
					data.add(tmp);
					obj.put("code", 200);
					obj.put("message", "success");
					obj.put("total", allCrossList.size());
					obj.put("data", data);
					obj.put("time", new Timestamp(System.currentTimeMillis()));
				} else {
					obj.put("code", 200);
					obj.put("message", "success");
					obj.put("total", allCrossList.size());
					obj.put("data", "null");
					obj.put("time", new Timestamp(System.currentTimeMillis()));
				}
			}

		} catch (Exception e) {
			obj.put("code", 500);
			obj.put("message", "error");
			obj.put("data", null);
			obj.put("time", new Timestamp(System.currentTimeMillis()));
			e.printStackTrace();
		}
		return obj;
	}

}
