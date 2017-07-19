/*
 * File Name：PoliceDistributionRepository.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月19日 上午11:23:35
 */
package com.gdws.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gdws.vehicle.entity.PoliceDistribution;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月19日 上午11:23:35
 */
public interface PoliceDistributionRepository extends JpaRepository<PoliceDistribution, Integer> {
	/**
	 * 
	 * @param crossDate
	 * @param crossId
	 * @return
	 */
	@Query(value = "select co.id as id,co.hour_num as hour_num,count(co.plate_no) as car_cross_cnt,ci.cross_name as cross_name,ci.cross_id as cross_id "
			+ " from car_overview_cross co LEFT JOIN cross_info ci on co.cross_id=ci.cross_id "
			+ " where co.cross_date=?1 and co.cross_id=?2 " 
			+ " GROUP BY co.hour_num "
			+ " ORDER BY co.hour_num ;", nativeQuery = true)
	List<PoliceDistribution> getCarCrossCnt(String crossDate, String crossId);
}
