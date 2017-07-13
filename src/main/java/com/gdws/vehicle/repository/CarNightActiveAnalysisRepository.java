/*
 * File Name：CarNightActiveAnalysisRepository.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月11日 下午4:07:59
 */
package com.gdws.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gdws.vehicle.entity.CarNightActive;
import com.gdws.vehicle.entity.CarNightActiveRes;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月11日 下午4:07:59
 */
public interface CarNightActiveAnalysisRepository extends JpaRepository<CarNightActive, Integer> {

	// @Query(value = "select id as id,plate_no as plate_no,plate_type as
	// plate_type,DATE_FORMAT(cross_date,'%Y-%m-%d') as cross_date,day_cross_cnt
	// as day_cross_cnt,night_cross_cnt as night_cross_cnt,night_active as
	// night_active,comment1 as comment1 from car_night_active where
	// night_active=1 ORDER BY cross_date desc", nativeQuery = true)
	// List<CarNightActive> getAllCarNightActive();
	//
	// @Query(value = "select id as id,plate_no as plate_no,plate_type as
	// plate_type,DATE_FORMAT(cross_date,'%Y-%m-%d') as cross_date,day_cross_cnt
	// as day_cross_cnt,night_cross_cnt as night_cross_cnt,night_active as
	// night_active,comment1 as comment1 from car_night_active where plate_no=?1
	// ORDER BY cross_date desc", nativeQuery = true)
	// List<CarNightActiveRes> getCarNightActiveByPlateNo(String plateNo);

//	@Query(value = " SELECT id as id,plate_no as plate_no,plate_type as plate_type,cross_date as cross_date,day_cross_cnt as day_cross_cnt,night_active as night_active,night_cross_cnt as night_cross_cnt,count(id) as count "
//			+ " from car_night_active " + " where DATE_FORMAT(cross_date,'%Y-%m-%d') BETWEEN ?1 and ?2 "
//			+ " and plate_no=?3", nativeQuery = true)
	@Query(value = " SELECT * "
			+ " from car_night_active " + " where DATE_FORMAT(cross_date,'%Y-%m-%d') BETWEEN ?1 and ?2 "
			+ " and plate_no=?3", nativeQuery = true)
	List<CarNightActive> getAllCrossByPlateNo(String startTime, String endTime, String plateNo);

//	@Query(value = " SELECT id as id,plate_no as plate_no,plate_type as plate_type,cross_date as cross_date,day_cross_cnt as day_cross_cnt,night_active as night_active,night_cross_cnt as night_cross_cnt,count(id) as count "
//			+ " from car_night_active " + " where DATE_FORMAT(cross_date,'%Y-%m-%d') BETWEEN ?1 and ?2 "
//			+ " and plate_no=?3 and night_active=1", nativeQuery = true)
	@Query(value = " SELECT * "
			+ " from car_night_active " + " where DATE_FORMAT(cross_date,'%Y-%m-%d') BETWEEN ?1 and ?2 "
			+ " and plate_no=?3 and night_active=1", nativeQuery = true)
	List<CarNightActive> getCarNightActiveByPlateNo(String startTime, String endTime, String plateNo);

//	@Query(value = "select id as id,plate_no as plate_no,plate_type as plate_type,cross_date as cross_date,day_cross_cnt as day_cross_cnt,night_active as night_active,night_cross_cnt as night_cross_cnt,count(id) as count"
//			+ " from car_night_active "
//			+ " where DATE_FORMAT(cross_date,'%Y-%m-%d') BETWEEN ?1 and ?2 "
//			+ " GROUP BY plate_no  "
//			+ " ORDER BY cross_date desc", nativeQuery = true)
	@Query(value = "select* "
			+ " from car_night_active "
			+ " where DATE_FORMAT(cross_date,'%Y-%m-%d') BETWEEN ?1 and ?2 "
			+ " GROUP BY plate_no  "
			+ " ORDER BY cross_date desc", nativeQuery = true)
	List<CarNightActive> getAllCrossGroupByPlateNo(String startTime, String endTime);

}
