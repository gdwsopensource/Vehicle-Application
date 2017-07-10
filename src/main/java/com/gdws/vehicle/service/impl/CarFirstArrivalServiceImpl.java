package com.gdws.vehicle.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.gdws.vehicle.entity.CarFirstArrival;
import com.gdws.vehicle.entity.ResWithLngAndLat;
import com.gdws.vehicle.repository.CarFirstArrivalRepository;
import com.gdws.vehicle.service.CarFirstArrivalService;

@Service
public class CarFirstArrivalServiceImpl implements CarFirstArrivalService{
	
	@Autowired
	private CarFirstArrivalRepository carFirstArrivalRepository;

	 @Override
	public JSONObject getCarFirstArrial(String plateNo){
		 JSONObject obj = new JSONObject();
			try {
				List<CarFirstArrival> list = carFirstArrivalRepository.getCarFirstArrial(plateNo);
				
//				
				Iterator<CarFirstArrival> listIter = list.iterator();
				if (listIter.hasNext()) {
					List<JSONObject> data = new ArrayList<JSONObject>();
					while (listIter.hasNext()) {
						CarFirstArrival res = listIter.next();
						JSONObject tmp = new JSONObject();
						// String[] arr = { res.getLng(),res.getLat() };
						Double[] arr = new Double[2];
						// check the lng and lat value ,if not valid, return default
						// value.
						if (res.getLng() != null && res.getLat() != null) {
							arr[0] = Double.parseDouble(res.getLng());
							arr[1] = Double.parseDouble(res.getLat());
						} else {
							arr[0] = 113.0;
							arr[1] = 23.0;
						}
						tmp.put("coord", arr);
						tmp.put("elevation", res.getCrossCnt());
						data.add(tmp);
					}
					obj.put("code", 200);
					obj.put("message", "success");
					obj.put("data", data);

				} else {
					obj.put("code", 200);
					obj.put("message", "success");
					obj.put("data", "null");
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

}
