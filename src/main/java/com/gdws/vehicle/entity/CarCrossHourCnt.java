/*
 * File Name：CarCrossHourCnt.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年6月28日 上午9:37:55
 */
package com.gdws.vehicle.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Administrator (shinena_deng@163.com)
 * @version 1.0, 2017年6月28日 上午9:37:55
 */
@Entity
public class CarCrossHourCnt {
	@Id
	@GeneratedValue
	private int id;
	private String plateNo;
	private String hourNum;
	private String crossId;
	private Date crossDate;
	private int crossCnt;
	private String comment1;

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

	/** @return 返回{@link #crossCnt} */
	public int getCrossCnt() {
		return crossCnt;
	}

	/**
	 * @param crossCnt
	 *            设置{@link #crossCnt}
	 */
	public void setCrossCnt(int crossCnt) {
		this.crossCnt = crossCnt;
	}

	/** @return 返回{@link #comment1} */
	public String getComment1() {
		return comment1;
	}

	/**
	 * @param comment1
	 *            设置{@link #comment1}
	 */
	public void setComment1(String comment1) {
		this.comment1 = comment1;
	}

}
