/*
 * File Name：CarOd.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月11日 上午10:59:50
 */
package com.gdws.vehicle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月11日 上午10:59:50
 */
@Entity
public class CarOd {
	@Id
	@GeneratedValue
	private int id;
	private String plateType;
	private String plateNo;
	private String crossMonth;
	private String originCrossId;
	private String destinationCrossId;
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

	/** @return 返回{@link #originCrossId} */
	public String getOriginCrossId() {
		return originCrossId;
	}

	/**
	 * @param originCrossId
	 *            设置{@link #originCrossId}
	 */
	public void setOriginCrossId(String originCrossId) {
		this.originCrossId = originCrossId;
	}

	/** @return 返回{@link #destinationCrossId} */
	public String getDestinationCrossId() {
		return destinationCrossId;
	}

	/**
	 * @param destinationCrossId
	 *            设置{@link #destinationCrossId}
	 */
	public void setDestinationCrossId(String destinationCrossId) {
		this.destinationCrossId = destinationCrossId;
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
