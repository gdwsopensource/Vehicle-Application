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
import org.springframework.data.repository.query.Param;

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
	@Query(value = "SELECT a.id as id,a.plate_no as plate_no,a.plate_type as plate_type,a.alert_type as alert_type,a.cross_direction as cross_direction,a.alert_time as alert_time,b.bd_latitude as lat,b.bd_longitude as lng,b.cross_id as cross_id,b.cross_name as cross_name from car_cross_info a left JOIN cross_info b on a.cross_id=b.cross_id where  a.plate_no like  :plateNo and DATE_FORMAT(a.alert_time,'%Y-%m-%d') BETWEEN :startTime and :endTime  ORDER BY DATE_FORMAT(a.alert_time,'%Y-%m-%d %H:%m') limit 0,500;", nativeQuery = true)
	List<TrankAnalysis> trankAnalysisOnPlateNo(@Param("plateNo")String plateNo,@Param("startTime") String startTime,@Param("endTime") String endTime);
}
