/*
 * File Name：CarCrossYearCnt.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年6月29日 下午12:44:16
 */
package com.gdws.vehicle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Administrator (shinena_deng@163.com)
 * @version 1.0, 2017年6月29日 下午12:44:16
 */
@Entity
public class CarCrossYearCnt {
	@Id
	@GeneratedValue
	private int id;
	private String plateNo;
	private String crossMonth;
	private int crossCnt;
	private String crossId;
	private String comment1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	/** @return 返回{@link #crossMonth} */
	public String getCrossMonth() {
		return crossMonth;
	}

	/**
	 * @param crossMonth
	 *            设置{@link #crossMonth}
	 */
	public void setCrossMonth(String crossMonth) {
		this.crossMonth = crossMonth;
	}

	public int getCrossCnt() {
		return crossCnt;
	}

	public void setCrossCnt(int crossCnt) {
		this.crossCnt = crossCnt;
	}

	public String getCrossId() {
		return crossId;
	}

	public void setCrossId(String crossId) {
		this.crossId = crossId;
	}

	public String getComment1() {
		return comment1;
	}

	public void setComment1(String comment1) {
		this.comment1 = comment1;
	}

}
