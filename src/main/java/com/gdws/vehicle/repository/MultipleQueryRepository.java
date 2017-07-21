/*
 * File Name：MultipleQueryRepository.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月12日 下午2:24:05
 */
package com.gdws.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gdws.vehicle.entity.MultipleQuery;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月12日 下午2:24:05
 */
public interface MultipleQueryRepository extends JpaRepository<MultipleQuery, Integer> {
	// SELECT d.id as id,d.plate_no as plate_no,d.plate_type as
	// plate_type,d.alert_time as alert_time,d.alert_type as
	// alert_type,d.cross_direction as cross_direction,d.cross_id as
	// cross_id,d.plate_colour as plate_colour,c.cross_name as cross_name
	// from
	// (SELECT a.id as id,a.plate_no as plate_no,a.plate_type as
	// plate_type,a.alert_time as alert_time,a.alert_type as
	// alert_type,a.cross_direction as cross_direction,a.cross_id as
	// cross_id,b.plate_colour as plate_colour
	// from car_cross_info a LEFT JOIN car_blacklist b on a.plate_no=b.plate_no
	// where a.plate_no like '%%' and a.alert_type like '%%' and
	// DATE_FORMAT(a.alert_time,'%Y-%m-%d') BETWEEN '2017-02-02' and
	// '2017-09-07') d
	// LEFT JOIN cross_info c on d.cross_id=c.cross_id
	// where c.cross_name like '%%'

	@Query(value = "SELECT a.id as id,a.plate_no as plate_no,a.plate_type as plate_type,"
			+ "date_format(a.alert_time,'%Y-%m-%d %H:%i') as alert_time,a.alert_type as alert_type,a.cross_direction as cross_direction,"
			+ "a.cross_id as cross_id,b.cross_name as cross_name "
			+ " from car_cross_info a LEFT JOIN cross_info b on a.cross_id=b.cross_id "
			+ " where a.plate_no like  CONCAT('%',:plateNo,'%') " + " and a.plate_type like CONCAT('%',:plateType,'%') "
			+ " and date_format(a.alert_time,'%Y-%m-%d %H:%i') between date_format(:startTime,'%Y-%m-%d %H:%i') and date_format(:endTime,'%Y-%m-%d %H:%i')"
			+ " and a.alert_type like CONCAT('%',:alertType,'%') "
			+ " and b.cross_name like CONCAT('%',:crossName,'%') "
			+ " order by a.alert_time desc "
			+ " limit 500;", nativeQuery = true)
	List<MultipleQuery> multipleQuery(@Param("plateNo") String plateNo, @Param("plateType") String plateType,
			@Param("startTime") String startTime, @Param("endTime") String endTime,
			@Param("alertType") String alertType, @Param("crossName") String crossName);

}
