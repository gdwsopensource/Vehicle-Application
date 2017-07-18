/*
 * File Name：ParamsFormat.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月17日 下午6:04:36
 */
package com.gdws.vehicle.utils;

/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月17日 下午6:04:36
 */
public class ParamsFormat {
	/**
	 * 字符串拼接
	 * 
	 * @param str
	 * @return
	 */
	public String ParamsFormat(String str) {
		String string = "%";
		try {

			String[] arr = str.split("");
			for (int i = 0; i < str.length(); i++) {
				arr[i] = arr[i] + "%";
				string += arr[i];
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return string;
	}
}
