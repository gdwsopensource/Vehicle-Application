/*
 * File Name：CarOverviewSumRepository.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月19日 上午10:01:18
 */
package com.gdws.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gdws.vehicle.entity.CarOverviewSum;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月19日 上午10:01:18
 */
public interface CarOverviewSumRepository extends JpaRepository<CarOverviewSum, Integer> {
	/**
	 * 
	 * @param crossDate
	 * @return
	 */
	@Query(value = "select id as id, sum(car_cross_cnt) as total from car_overview where cross_date=?1", nativeQuery = true)
	CarOverviewSum getTotalCarCrossCnt(String crossDate);
}
