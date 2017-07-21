/*
 * File Name：CarOverviewServiceImpl.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年6月28日 下午4:05:54
 */
package com.gdws.vehicle.service.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.gdws.vehicle.entity.CarOverview;
import com.gdws.vehicle.entity.CarOverviewCross;
import com.gdws.vehicle.entity.CrossInfo;
import com.gdws.vehicle.repository.CarOverviewCrossRepository;
import com.gdws.vehicle.repository.CarOverviewRepository;
import com.gdws.vehicle.repository.CarOverviewSumRepository;
import com.gdws.vehicle.repository.CrossInfoRepository;
import com.gdws.vehicle.service.CarOverviewService;

/**
 *
 * @author Administrator (shinena_deng@163.com)
 * @version 1.0, 2017年6月28日 下午4:05:54
 */
@Service
public class CarOverviewServiceImpl implements CarOverviewService {
	@Autowired
	private CarOverviewRepository carOverviewRepository;
	@Autowired
	private CrossInfoRepository crossInfoRepository;
	@Autowired
	private CarOverviewCrossRepository carOverviewCrossRepository;
	@Autowired
	private CarOverviewSumRepository carOverviewSumRepository;

	@Override
	public JSONObject getCrossOverview(String crossDate) {
		JSONObject obj = new JSONObject();
		List<JSONObject> list = new ArrayList<JSONObject>();
		try {
			List<CarOverview> co = carOverviewRepository.getCarOverview(crossDate);
			Double totalCarCrossCnt = (double) carOverviewSumRepository.getTotalCarCrossCnt(crossDate).getTotal();
			Iterator<CarOverview> carOverviewIter = co.iterator();	
			if (carOverviewIter.hasNext()) {
				while (carOverviewIter.hasNext()) {
					JSONObject tmp = new JSONObject();
					CarOverview tmpCarOverview = carOverviewIter.next();
					String alertType = null;
					if (tmpCarOverview.getCarCrossCnt() > 10) {
						alertType = "serious";
					} else if (5 < tmpCarOverview.getCarCrossCnt() && tmpCarOverview.getCarCrossCnt() <= 10) {
						alertType = "medium";
					} else {
						alertType = "low";
					}
					CrossInfo crossInfo = crossInfoRepository.findByCrossId(tmpCarOverview.getCrossId());
					tmp.put("id", tmpCarOverview.getId());
					tmp.put("cross_warning_type_pie",
							new BigDecimal((double) tmpCarOverview.getCarCrossCnt() / totalCarCrossCnt)
									.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
					tmp.put("car_cross_cnt", tmpCarOverview.getCarCrossCnt());
					tmp.put("alert_type", alertType);
					tmp.put("cross_name", crossInfo.getCrossName());
					tmp.put("cross_id", crossInfo.getCrossId());
					tmp.put("lng", crossInfo.getBdLongitude());
					tmp.put("lat", crossInfo.getBdLatitude());
					tmp.put("gpslng", crossInfo.getGpsLongitude());
					tmp.put("gpslat", crossInfo.getGpsLatitude());
					list.add(tmp);
				}
				obj.put("data", list);
				obj.put("code", 200);
				obj.put("total", co.size());
				obj.put("message", "success");
			} else {
				obj.put("data", "null");
				obj.put("code", 200);
				obj.put("message", "success");
			}
		} catch (Exception e) {
			obj.put("code", 500);
			obj.put("message", "failure");
			obj.put("data", null);
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public JSONObject getCarOverviewCross(String crossId, String crossDate) {
		JSONObject obj = new JSONObject();
		List<JSONObject> arr = new ArrayList<JSONObject>();

		try {
			List<CarOverviewCross> list = carOverviewCrossRepository.findByCrossAndDate(crossId, crossDate);

			Iterator<CarOverviewCross> carOverviewCrossIter = list.iterator();
			if (carOverviewCrossIter.hasNext()) {
				while (carOverviewCrossIter.hasNext()) {
					JSONObject tmp = new JSONObject();
					CarOverviewCross carOverviewCrossIterTemp = carOverviewCrossIter.next();
					CrossInfo crossInfo = crossInfoRepository.findByCrossId(crossId);
					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
					tmp.put("id", carOverviewCrossIterTemp.getId());
					tmp.put("cross_name", crossInfo.getCrossName());
					tmp.put("plate_no", carOverviewCrossIterTemp.getPlateNo());
					tmp.put("cross_date", format.format(carOverviewCrossIterTemp.getCrossDate()));
					String hour = null;
					if (Integer.parseInt(carOverviewCrossIterTemp.getHourNum()) < 10) {
						hour = "0" + Integer.parseInt(carOverviewCrossIterTemp.getHourNum());
					} else {
						hour = carOverviewCrossIterTemp.getHourNum();
					}
					tmp.put("hour_num", hour + ":00-" + hour + ":59");
					tmp.put("alert_type", carOverviewCrossIterTemp.getAlertType());
					arr.add(tmp);
				}
				obj.put("code", 200);
				obj.put("message", "success");
				obj.put("data", arr);
			} else {
				obj.put("data", "null");
				obj.put("code", 200);
				obj.put("message", "success");
			}

		} catch (Exception e) {
			obj.put("code", 500);
			obj.put("message", "failure");
			obj.put("data", null);
			e.printStackTrace();
		}
		return obj;
	}
}
