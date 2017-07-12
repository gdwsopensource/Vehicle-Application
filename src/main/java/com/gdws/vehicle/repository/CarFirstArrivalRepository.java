package com.gdws.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gdws.vehicle.entity.CarFirstArrival;

/**
 *
 * @author miracle (Eric-lzy)
 * @version 1.0, 2017年7月9日 下午5:01:21
 */

public interface CarFirstArrivalRepository extends JpaRepository<CarFirstArrival, Integer> {

	
	@Query(value = "select * from car_first_arrival where date_format(cross_date, '%Y-%m-%d') between ?1 and ?2 order by date_format(cross_date, '%Y-%m-%d')", nativeQuery = true)
	List<CarFirstArrival> getCarFirstArrial(String startTime,String endTime);


	
}
