package com.gdws.vehicle.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.gdws.vehicle.entity.CarFirstArrival;
import com.gdws.vehicle.repository.CarFirstArrivalRepository;
import com.gdws.vehicle.service.CarFirstArrivalService;



@Service
public class CarFirstArrivalServiceImpl implements CarFirstArrivalService{
	
	@Autowired
	private CarFirstArrivalRepository carFirstArrivalRepository;

	 @Override
	public JSONObject getCarFirstArrial(String startTime,String endTime){
		 JSONObject obj = new JSONObject();
			try {
				
				List<CarFirstArrival> list = carFirstArrivalRepository.getCarFirstArrial(startTime,endTime);
				Iterator<CarFirstArrival> listIter = list.iterator();
				if (listIter.hasNext()) {
					List<JSONObject> data = new ArrayList<JSONObject>();
					while (listIter.hasNext()) {
						CarFirstArrival res = listIter.next();
						 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
						JSONObject tmp = new JSONObject();
						tmp.put("plate_no", res.getPlateNo());
						tmp.put("cross_date",format.format(res.getCrossDate()));
						tmp.put("arrival_type",res.getArrivalType());
						data.add(tmp);
						
					}
					obj.put("code", 200);
					obj.put("message", "success");
					obj.put("total",list.size());
					obj.put("startTime",startTime);
					obj.put("endTime",startTime);
					obj.put("data", data);

				} else {
					obj.put("code", 200);
					obj.put("message", "success");
					obj.put("startTime",startTime);
					obj.put("endTime",startTime);
					obj.put("data", null);
				}
			} catch (Exception e) {
				obj.put("code", 500);
				obj.put("message", "error");
				obj.put("data", null);
				e.printStackTrace();
			}
			return obj;
		}
	 }


