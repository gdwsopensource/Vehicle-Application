/*
 * File Name：TrankAnalysisRespository.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月10日 下午12:31:40
 */
package com.gdws.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gdws.vehicle.entity.TrankAnalysis;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月10日 下午12:31:40
 */
public interface TrankAnalysisRespository extends JpaRepository<TrankAnalysis, Integer> {

	/**
	 * 
	 * @param plateNo
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	@Query(value = "SELECT a.id as id,a.plate_type as plate_type,a.alert_type as alert_type,a.cross_direction as cross_direction,DATE_FORMAT(a.alert_time,'%Y-%m-%d %H:%m') as alert_time,b.latitude as lat,b.longitude as lng,b.cross_id as cross_id,b.cross_name as cross_name from car_cross_info a left JOIN cross_info b on a.cross_id=b.cross_id where  a.plate_no=?1 and DATE_FORMAT(a.alert_time,'%Y-%m-%d') BETWEEN ?2 and ?3  ORDER BY DATE_FORMAT(a.alert_time,'%Y-%m-%d %H:%m');", nativeQuery = true)
	List<TrankAnalysis> trankAnalysisOnPlateNo(String plateNo, String startTime, String endTime);
}
