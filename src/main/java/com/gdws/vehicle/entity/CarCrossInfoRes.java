/*
 * File Name：CarCrossInfoRes.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月17日 下午2:15:14
 */
package com.gdws.vehicle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月17日 下午2:15:14
 */
@Entity
public class CarCrossInfoRes {
	@Id
	@GeneratedValue
	private int id;
	private String plateNo;
	private String alertType;
	private int cnt;

	/** @return 返回{@link #id} */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            设置{@link #id}
	 */
	public void setId(int id) {
		this.id = id;
	}

	/** @return 返回{@link #plateNo} */
	public String getPlateNo() {
		return plateNo;
	}

	/**
	 * @param plateNo
	 *            设置{@link #plateNo}
	 */
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	/** @return 返回{@link #alertType} */
	public String getAlertType() {
		return alertType;
	}

	/**
	 * @param alertType
	 *            设置{@link #alertType}
	 */
	public void setAlertType(String alertType) {
		this.alertType = alertType;
	}

	/** @return 返回{@link #cnt} */
	public int getCnt() {
		return cnt;
	}

	/**
	 * @param cnt
	 *            设置{@link #cnt}
	 */
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

}
