/*
 * File Name：CarOverview.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年6月27日 下午5:24:10
 */
package com.gdws.vehicle.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 *
 * @author Administrator (shinena_deng@163.com)
 * @version 1.0, 2017年6月27日 下午5:24:10
 */
@Entity
public class CarOverview {
	@Id
	@GeneratedValue
	private int id;
	private String crossId;
	private int carCrossCnt;
	private Date crossDate;
	private String comment1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCrossId() {
		return crossId;
	}

	public void setCrossId(String crossId) {
		this.crossId = crossId;
	}

	public int getCarCrossCnt() {
		return carCrossCnt;
	}

	public void setCarCrossCnt(int carCrossCnt) {
		this.carCrossCnt = carCrossCnt;
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

	public String getComment1() {
		return comment1;
	}

	public void setComment1(String comment1) {
		this.comment1 = comment1;
	}

}
