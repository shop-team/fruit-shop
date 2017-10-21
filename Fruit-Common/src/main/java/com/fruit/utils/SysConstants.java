package com.fruit.utils;

/**
 * ${DESCRIPTION} 定义常量
 * 
 * @author 张进
 * @create 2017-10-06 10:28
 **/
public interface SysConstants {
	/** 定义状态常量 0正常 1锁定 2删除 */
	Integer STATUS_NORMAL = 0;
	Integer STATUS_LOCKED = 1;
	Integer STATUS_DELELE = 2;

	Integer RUNTIME_ERROR = 1;
	Integer NULL_ERROR = 2;
	Integer CLASS_CAST_ERROR = 3;
	Integer IO_ERROR = 4;
	Integer NO_SUCH_ERROR = 5;
	Integer INDEX_OUT_ERROR = 6;
	Integer HTTP_NOTREABALE_ERROR = 7;
	Integer TYPE_MISMATCH = 8;
	Integer MISSING_SERVLET_REQUEST_PARAMTER_ERROR = 9;
	Integer HTTP_REQUEST_METHOD_NOT_SUPPORTED_ERROR = 10;
	Integer HTTP_MEDIA_TYPE_NOT_ACCEPTABLE_ERROR = 11;
	Integer CONVERSION_NOT_SUPPORTED_ERROR = 12;
	Integer STACK_OVER_ERROR = 13;
}