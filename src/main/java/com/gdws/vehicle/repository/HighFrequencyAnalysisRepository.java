/*
 * File Name：HighFrequencyAnalysisRepository.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月6日 下午3:29:08
 */
package com.gdws.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gdws.vehicle.entity.HighFrequencyAnalysisRes;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月6日 下午3:29:08
 */
public interface HighFrequencyAnalysisRepository extends JpaRepository<HighFrequencyAnalysisRes, Integer> {
	/**
	 * 某一时间范围内所有車輛經過所有卡口的總數
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	@Query(value = "SELECT a.id as id,a.plate_no as plate_no,a.alert_type as alert_type,count(a.cross_id) as count,a.cross_id as cross_id,b.cross_name as cross_name from car_cross_info a RIGHT JOIN cross_info b on a.cross_id=b.cross_id where date_format(a.alert_time, '%Y-%m-%d') between ?1 and ?2  GROUP BY plate_no ORDER BY COUNT(a.cross_id) desc;", nativeQuery = true)
	List<HighFrequencyAnalysisRes> getHighFrequencyAllCross(String startTime, String endTime);

	/**
	 *  某卡口某一时间段过车频次统计
	 * @param startTime
	 * @param endTime
	 * @param crossName
	 * @return
	 */
	@Query(value = "SELECT a.id as id,a.plate_no as plate_no,a.alert_type as alert_type,count(a.cross_id) as count,a.cross_id as cross_id,b.cross_name as cross_name  from car_cross_info a RIGHT JOIN cross_info b on a.cross_id=b.cross_id where date_format(a.alert_time, '%Y-%m-%d') between ?1 and ?2 and b.cross_name=?3 GROUP BY plate_no ORDER BY COUNT(a.cross_id) desc;", nativeQuery = true)
	List<HighFrequencyAnalysisRes> getHighFrequencyOnCrossName(String startTime, String endTime,
			String crossName);
}
