/*
 * File Name：PoliceDistribution.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月19日 上午11:05:27
 */
package com.gdws.vehicle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月19日 上午11:05:27
 */
@Entity
public class PoliceDistribution {
	@Id
	@GeneratedValue
	private int id;
	private String crossId;
	private String crossName;
	private int carCrossCnt;
	private String hourNum;

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

	/** @return 返回{@link #carCrossCnt} */
	public int getCarCrossCnt() {
		return carCrossCnt;
	}

	/**
	 * @param carCrossCnt
	 *            设置{@link #carCrossCnt}
	 */
	public void setCarCrossCnt(int carCrossCnt) {
		this.carCrossCnt = carCrossCnt;
	}

	/** @return 返回{@link #hourNum} */
	public String getHourNum() {
		return hourNum;
	}

	/**
	 * @param hourNum
	 *            设置{@link #hourNum}
	 */
	public void setHourNum(String hourNum) {
		this.hourNum = hourNum;
	}

}
