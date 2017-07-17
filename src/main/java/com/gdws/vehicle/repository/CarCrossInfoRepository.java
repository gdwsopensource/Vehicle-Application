/*
 * File Name：CarCrossInfoRepository.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月17日 下午2:10:29
 */
package com.gdws.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gdws.vehicle.entity.CarCrossInfoRes;


/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月17日 下午2:10:29
 */
public interface CarCrossInfoRepository extends JpaRepository<CarCrossInfoRes,Integer>{

	@Query(value="select id as id,plate_no as plate_no ,count(plate_no) as cnt,alert_type as alert_type from car_cross_info where   date_format(alert_time, '%Y-%m-%d') between ?1 and ?2 group by plate_no order by cnt desc",nativeQuery=true)
	List<CarCrossInfoRes> findByCrossDate(String startTime, String endTime);
}
