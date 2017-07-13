/*
 * File Name：CarNightActiveRes.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月13日 下午2:01:07
 */
package com.gdws.vehicle.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月13日 下午2:01:07
 */
@Entity
public class CarNightActiveRes {
	@Id
	@GeneratedValue
	private int id;
	private String plateType;
	private String plateNo;
	private Date crossDate;
	private int dayCrossCnt;
	private int nightCrossCnt;
	private String nightActive;
	private String count;

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

	/** @return 返回{@link #crossDate} */
	public Date getCrossDate() {
		return crossDate;
	}

	/**
	 * @param crossDate
	 *            设置{@link #crossDate}
	 */
	public void setCrossDate(Date crossDate) {
		this.crossDate = crossDate;
	}

	/** @return 返回{@link #dayCrossCnt} */
	public int getDayCrossCnt() {
		return dayCrossCnt;
	}

	/**
	 * @param dayCrossCnt
	 *            设置{@link #dayCrossCnt}
	 */
	public void setDayCrossCnt(int dayCrossCnt) {
		this.dayCrossCnt = dayCrossCnt;
	}

	/** @return 返回{@link #nightCrossCnt} */
	public int getNightCrossCnt() {
		return nightCrossCnt;
	}

	/**
	 * @param nightCrossCnt
	 *            设置{@link #nightCrossCnt}
	 */
	public void setNightCrossCnt(int nightCrossCnt) {
		this.nightCrossCnt = nightCrossCnt;
	}

	/** @return 返回{@link #nightActive} */
	public String getNightActive() {
		return nightActive;
	}

	/**
	 * @param nightActive
	 *            设置{@link #nightActive}
	 */
	public void setNightActive(String nightActive) {
		this.nightActive = nightActive;
	}

	/** @return 返回{@link #count} */
	public String getCount() {
		return count;
	}

	/**
	 * @param count
	 *            设置{@link #count}
	 */
	public void setCount(String count) {
		this.count = count;
	}

}
