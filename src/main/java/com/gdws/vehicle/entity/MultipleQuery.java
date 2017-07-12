/*
 * File Name：MultipleQuery.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月12日 下午2:29:45
 */
package com.gdws.vehicle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月12日 下午2:29:45
 */
@Entity
public class MultipleQuery {
	@Id
	@GeneratedValue
	private int id;
	private String plateNo;
	private String plateType;
	private String alertTime;
	private String alertType;
	private String crossDirection;
	private String crossId;
//	private String plateColour;
	private String crossName;

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

	/** @return 返回{@link #plateType} */
	public String getPlateType() {
		return plateType;
	}

	/**
	 * @param plateType
	 *            设置{@link #plateType}
	 */
	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}

	/** @return 返回{@link #alertTime} */
	public String getAlertTime() {
		return alertTime;
	}

	/**
	 * @param alertTime
	 *            设置{@link #alertTime}
	 */
	public void setAlertTime(String alertTime) {
		this.alertTime = alertTime;
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

	/** @return 返回{@link #crossDirection} */
	public String getCrossDirection() {
		return crossDirection;
	}

	/**
	 * @param crossDirection
	 *            设置{@link #crossDirection}
	 */
	public void setCrossDirection(String crossDirection) {
		this.crossDirection = crossDirection;
	}

	/** @return 返回{@link #crossId} */
	public String getCrossId() {
		return crossId;
	}

	/**
	 * @param crossId
	 *            设置{@link #crossId}
	 */
	public void setCrossId(String crossId) {
		this.crossId = crossId;
	}

//	/** @return 返回{@link #plateColour} */
//	public String getPlateColour() {
//		return plateColour;
//	}
//
//	/**
//	 * @param plateColour
//	 *            设置{@link #plateColour}
//	 */
//	public void setPlateColour(String plateColour) {
//		this.plateColour = plateColour;
//	}

	/** @return 返回{@link #crossName} */
	public String getCrossName() {
		return crossName;
	}

	/**
	 * @param crossName
	 *            设置{@link #crossName}
	 */
	public void setCrossName(String crossName) {
		this.crossName = crossName;
	}

}
