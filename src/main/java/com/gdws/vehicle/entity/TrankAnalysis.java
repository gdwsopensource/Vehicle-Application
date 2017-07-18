/*
 * File Name：TrankAnalysis.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月10日 下午1:10:43
 */
package com.gdws.vehicle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月10日 下午1:10:43
 */
@Entity
public class TrankAnalysis {
	@Id
	@GeneratedValue
	private int id;
	private String plateNo;
	private String crossDirection;
	private String alertTime;
	private String lat;
	private String lng;
	private String crossId;
	private String crossName;
	private String plateType;
	private String alertType;

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

	/** @return 返回{@link #lat} */
	public String getLat() {
		return lat;
	}

	/**
	 * @param lat
	 *            设置{@link #lat}
	 */
	public void setLat(String lat) {
		this.lat = lat;
	}

	/** @return 返回{@link #lng} */
	public String getLng() {
		return lng;
	}

	/**
	 * @param lng
	 *            设置{@link #lng}
	 */
	public void setLng(String lng) {
		this.lng = lng;
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

}
