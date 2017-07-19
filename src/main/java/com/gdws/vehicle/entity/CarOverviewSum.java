/*
 * File Name：CarOverviewSum.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月19日 上午9:59:24
 */
package com.gdws.vehicle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月19日 上午9:59:24
 */
@Entity
public class CarOverviewSum {
	@Id
	@GeneratedValue
	private int id;
	private int total;

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

	/** @return 返回{@link #total} */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            设置{@link #total}
	 */
	public void setTotal(int total) {
		this.total = total;
	}

}
