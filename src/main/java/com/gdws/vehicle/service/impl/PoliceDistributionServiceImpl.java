/*
 * File Name：PoliceDistributionServiceImpl.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月19日 上午11:30:42
 */
package com.gdws.vehicle.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.gdws.vehicle.entity.PoliceDistribution;
import com.gdws.vehicle.repository.PoliceDistributionRepository;
import com.gdws.vehicle.service.PoliceDistributionService;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月19日 上午11:30:42
 */
@Service
public class PoliceDistributionServiceImpl implements PoliceDistributionService{
@Autowired
private PoliceDistributionRepository policeDistributionRepository;
	@Override
	public JSONObject policeDistribution(String crossDate, String crossId) {
		// TODO Auto-generated method stub
		JSONObject obj=new JSONObject();
		try{
			List<PoliceDistribution> policeDistributionList=policeDistributionRepository.getCarCrossCnt(crossDate, crossId);
			Iterator<PoliceDistribution> policeDistributionIter=policeDistributionList.iterator();
			if(policeDistributionIter.hasNext()){
				List<JSONObject> data=new ArrayList<JSONObject>();
				while(policeDistributionIter.hasNext()){
					PoliceDistribution policeDistribution=policeDistributionIter.next();
					JSONObject tmp=new JSONObject();
					tmp.put("cross_id",policeDistribution.getCrossId());
					tmp.put("cross_name", policeDistribution.getCrossName());
					tmp.put("cross_car_cnt", policeDistribution.getCarCrossCnt());
					String hour=null;
					if (Integer.parseInt(policeDistribution.getHourNum()) < 10) {
						hour = "0" + Integer.parseInt(policeDistribution.getHourNum());
					} else {
						hour = policeDistribution.getHourNum();
					}
					tmp.put("cross_time", hour+":00-"+hour+":59");
					int people=policeDistribution.getCarCrossCnt()/5;
					tmp.put("cross_people", people);
					data.add(tmp);
				}
				obj.put("code", 200);
				obj.put("message", "error");
				obj.put("total", policeDistributionList.size());
				obj.put("data",data);
				obj.put("time", new Timestamp(System.currentTimeMillis()));	
			}else{
				obj.put("code", 200);
				obj.put("message", "error");
				obj.put("total", 0);
				obj.put("data","null");
				obj.put("time", new Timestamp(System.currentTimeMillis()));	
			}
			
		}catch (Exception e) {
			obj.put("code", 500);
			obj.put("message", "error");
			obj.put("data",null);
			obj.put("time", new Timestamp(System.currentTimeMillis()));
			e.printStackTrace();
		}
		return obj;
	}

}
