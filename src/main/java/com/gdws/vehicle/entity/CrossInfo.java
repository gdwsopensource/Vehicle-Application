/*
 * File Name：CrossInfo.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年6月28日 上午10:08:52
 */
package com.gdws.vehicle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Administrator (shinena_deng@163.com)
 * @version 1.0, 2017年6月28日 上午10:08:52
 */
@Entity
public class CrossInfo {
	@Id
	@GeneratedValue
	private int id;
	private String crossId;
	private String crossName;
	private String bdLongitude;
	private String bdLatitude;
	private String gpsLongitude;
	private String gpsLatitude;
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

	/** @return 返回{@link #bdLongitude} */
	public String getBdLongitude() {
		return bdLongitude;
	}

	/**
	 * @param bdLongitude
	 *            设置{@link #bdLongitude}
	 */
	public void setBdLongitude(String bdLongitude) {
		this.bdLongitude = bdLongitude;
	}

	/** @return 返回{@link #bdLatitude} */
	public String getBdLatitude() {
		return bdLatitude;
	}

	/**
	 * @param bdLatitude
	 *            设置{@link #bdLatitude}
	 */
	public void setBdLatitude(String bdLatitude) {
		this.bdLatitude = bdLatitude;
	}

	/** @return 返回{@link #gpsLongitude} */
	public String getGpsLongitude() {
		return gpsLongitude;
	}

	/**
	 * @param gpsLongitude
	 *            设置{@link #gpsLongitude}
	 */
	public void setGpsLongitude(String gpsLongitude) {
		this.gpsLongitude = gpsLongitude;
	}

	/** @return 返回{@link #gpsLatitude} */
	public String getGpsLatitude() {
		return gpsLatitude;
	}

	/**
	 * @param gpsLatitude
	 *            设置{@link #gpsLatitude}
	 */
	public void setGpsLatitude(String gpsLatitude) {
		this.gpsLatitude = gpsLatitude;
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
