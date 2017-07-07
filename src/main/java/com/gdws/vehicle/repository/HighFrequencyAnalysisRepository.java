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
	 * 某一天車輛經過所有卡口的總數
	 * @param crossTime
	 * @return
	 */
	@Query(value = "SELECT id as id,plate_no as plate_no,alert_type as alert_type,count(cross_id) as count from car_cross_info where date_format(alert_time, '%Y-%m-%d')=?1 GROUP BY plate_no ORDER BY COUNT(cross_id) desc;", nativeQuery = true)
	List<HighFrequencyAnalysisRes> getHighFrequencyOneDay(String crossTime);
}
