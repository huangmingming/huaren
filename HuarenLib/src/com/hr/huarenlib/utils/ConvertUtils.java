package com.hr.huarenlib.utils;


/*
 * 
 * ���ת��
 * 
 */
public class ConvertUtils {

	public final static int convertToInt(Object value,int defaultValue){
		if(value == null  || "".equals(value.toString().trim())){
			return defaultValue;
		}
			try {
				return Integer.valueOf(value.toString());
			} catch (Exception e) {
				try {
					// TODO: handle exception
					return Double.valueOf(value.toString()).intValue();
				} catch (Exception e2) {
					// TODO: handle exception
					return defaultValue;
				}
			}
		
		
	}
}
