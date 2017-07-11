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

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月11日 下午4:07:59
 */
public interface CarNightActiveAnalysisRepository extends JpaRepository<CarNightActive, Integer> {
	
	@Query(value = "select * from car_night_active where night_active=0", nativeQuery = true)
	List<CarNightActive> getAllCarNightActive();

	@Query(value = "select * from car_night_active where plate_no=?1", nativeQuery = true)
	List<CarNightActive> getCarNightActiveByPlateNo(String plateNo);
}