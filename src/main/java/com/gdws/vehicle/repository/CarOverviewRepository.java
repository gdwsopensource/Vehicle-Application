/*
 * File Name：CarOverviewRepository.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年6月28日 上午9:20:53
 */
package com.gdws.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gdws.vehicle.entity.CarOverview;
import com.gdws.vehicle.entity.CrossInfo;

/**
 *
 * @author Administrator (shinena_deng@163.com)
 * @version 1.0, 2017年6月28日 上午9:20:53
 */
public interface CarOverviewRepository extends JpaRepository<CarOverview, Integer> {

	/**
	 * 获取预警数据
	 * 
	 * @param crossDate
	 * @return
	 */
	@Query(value = "select * from car_overview  where cross_date=?1", nativeQuery = true)
	List<CarOverview> getCarOverview(String crossDate);

}
