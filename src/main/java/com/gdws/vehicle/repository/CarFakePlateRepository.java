/*
 * File Name：CarFakePlateRepository.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月11日 下午2:47:52
 */
package com.gdws.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gdws.vehicle.entity.CarFakePlate;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月11日 下午2:47:52
 */
public interface CarFakePlateRepository extends JpaRepository<CarFakePlate, Integer> {
	/**
	 * 获取所有假/套牌车
	 * 
	 * @return
	 */
	@Query(value = "select * from car_fake_plate", nativeQuery = true)
	List<CarFakePlate> getAllFakePlateCar();

	/**
	 * 查询某车是否为假/套牌车
	 * 
	 * @param plateNo
	 * @return
	 */
	@Query(value = "select * from car_fake_plate where plate_no=?1",nativeQuery=true)
	List<CarFakePlate> getFakePlateByPlateNo(String plateNo);
}
