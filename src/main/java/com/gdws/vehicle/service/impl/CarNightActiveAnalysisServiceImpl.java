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
import com.gdws.vehicle.repository.CarNightActiveAnalysisRepository;
import com.gdws.vehicle.service.CarNightActiveAnalysisService;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月11日 下午4:12:21
 */
@Service
public class CarNightActiveAnalysisServiceImpl implements CarNightActiveAnalysisService{
@Autowired
private CarNightActiveAnalysisRepository carNightActiveAnalysisRepository;
	@Override
	public JSONObject carNightActiveAnalysis(String plateNo) {
		JSONObject obj = new JSONObject();
		try{
			List<CarNightActive> carNightActivelist=null;
			
			if(plateNo==null || plateNo==""){
				carNightActivelist=carNightActiveAnalysisRepository.getAllCarNightActive();
			}else{
				carNightActivelist=carNightActiveAnalysisRepository.getCarNightActiveByPlateNo(plateNo);
			}
			Iterator<CarNightActive> carNightActivelistIter=carNightActivelist.iterator();
			if(carNightActivelistIter.hasNext()){
				List<JSONObject> data=new ArrayList<JSONObject>();
				while(carNightActivelistIter.hasNext()){
					JSONObject tmp=new JSONObject();
					 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
					CarNightActive carNightActiveObject=carNightActivelistIter.next();
					tmp.put("plate_type", carNightActiveObject.getPlateType());
					tmp.put("plate_no", carNightActiveObject.getPlateNo());
					tmp.put("cross_date", format.format(carNightActiveObject.getCrossDate()));
					tmp.put("day_cross_cnt", carNightActiveObject.getDayCrossCnt());
					tmp.put("night_cross_cnt", carNightActiveObject.getNightCrossCnt());
					tmp.put("night_active", carNightActiveObject.getNightActive());
					data.add(tmp);
				}
				obj.put("code", 200);
				obj.put("message","success");
				obj.put("total", carNightActivelist.size());
				obj.put("data", data);
				obj.put("time", new Timestamp(System.currentTimeMillis()));
			}else{
				obj.put("code", 200);
				obj.put("message","success");
				obj.put("total", 0);
				obj.put("data", "null");
				obj.put("time", new Timestamp(System.currentTimeMillis()));
			}
		}catch (Exception e){
			obj.put("code", 500);
			obj.put("message","error");
			obj.put("data", null);
			obj.put("time", new Timestamp(System.currentTimeMillis()));
			e.printStackTrace();
		}
		return obj;
	}

}
