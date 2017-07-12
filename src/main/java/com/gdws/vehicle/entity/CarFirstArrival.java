package com.gdws.vehicle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author miracle (Eric-lzy)
 * @version 1.0, 2017年7月9日 下午4:54:42
 */
/**
 *
 * @author miracle (Eric-lzy)
 * @version 1.0, 2017年7月11日 上午10:52:23
 */
@Entity
public class CarFirstArrival {

	@Id
	@GeneratedValue
	private int id;
	private String plateType;
	private String plateNo;
	private String crossDate;
	private String arrivalType;
	private String comment1;
	/**
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return
	 */
	public String getPlateType() {
		return plateType;
	}
	/**
	 * @param plateType
	 */
	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}
	/**
	 * @return
	 */
	public String getPlateNo() {
		return plateNo;
	}
	/**
	 * @param plateNo
	 */
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}


	public String getCrossDate() {
		return crossDate;
	}
	public void setCrossDate(String crossDate) {
		this.crossDate = crossDate;
	}
	/**
	 * @return
	 */
	public String getArrivalType() {
		return arrivalType;
	}
	/**
	 * @param arrivalType
	 */
	public void setArrivalType(String arrivalType) {
		this.arrivalType = arrivalType;
	}
	/**
	 * @return
	 */
	public String getComment1() {
		return comment1;
	}
	/**
	 * @param comment1
	 */
	public void setComment1(String comment1) {
		this.comment1 = comment1;
	}
	
	
}