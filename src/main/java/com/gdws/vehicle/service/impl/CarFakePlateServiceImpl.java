/*
 * File Name：CarFakePlateServiceImpl.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月11日 下午3:21:12
 */
package com.gdws.vehicle.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.gdws.vehicle.entity.CarFakePlate;
import com.gdws.vehicle.repository.CarFakePlateRepository;
import com.gdws.vehicle.service.CarFakePlateService;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月11日 下午3:21:12
 */
@Service
public class CarFakePlateServiceImpl implements CarFakePlateService{
	@Autowired
	private CarFakePlateRepository carFakePlateRepository;
	
	@Override
	public JSONObject searchFakePlateCar(String plateNo) {
		JSONObject obj = new JSONObject();
		try{
			List<CarFakePlate> carFakePlate=null;
			System.out.println(plateNo);
			if(plateNo==null || plateNo==""){
				carFakePlate=carFakePlateRepository.getAllFakePlateCar();
			}else{
				carFakePlate=carFakePlateRepository.getFakePlateByPlateNo(plateNo);
			}
			Iterator<CarFakePlate> carFakePlateIter=carFakePlate.iterator();
			if(carFakePlateIter.hasNext()){
				List<JSONObject> data=new ArrayList<JSONObject>();
				while(carFakePlateIter.hasNext()){
					JSONObject tmp=new JSONObject();
					CarFakePlate carFakePlateObject=carFakePlateIter.next();
					tmp.put("plate_type", carFakePlateObject.getPlateType());
					tmp.put("plate_no", carFakePlateObject.getPlateNo());
					tmp.put("cross_date", carFakePlateObject.getCrossDate());
					tmp.put("fake_plate_type", carFakePlateObject.getFakePlateType());
					data.add(tmp);
				}
				obj.put("code", 200);
				obj.put("message","success");
				obj.put("total", carFakePlate.size());
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
			obj.put("total", 0);
			obj.put("data", null);
			obj.put("time", new Timestamp(System.currentTimeMillis()));
			e.printStackTrace();
		}
		return obj;
	}

}
