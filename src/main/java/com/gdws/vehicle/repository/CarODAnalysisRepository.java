/*
 * File Name：CarODAnalysisRepository.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月11日 下午4:52:52
 */
package com.gdws.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gdws.vehicle.entity.CarOD;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月11日 下午4:52:52
 */
public interface CarODAnalysisRepository extends JpaRepository<CarOD, Integer> {
	/**
	 * 
	 * @param plateNo
	 * @return
	 */
	@Query(value = "select * from car_OD where plate_no=?1 order by cross_month", nativeQuery = true)
	List<CarOD> getCarODByPlateNO(String plateNo);
}
