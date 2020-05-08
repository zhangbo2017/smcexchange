package com.smc.utils;

public class ResponseCode {

	protected ResponseCode() {

	}

	//成功
	public static final int SUCCESS = 200;
	//系统错误
	public static final int ERROR_SYS = 500;
	//数据库操作出错
	public static final int ERROR_ACCESS_DB = 501;
	//服务不可用
	public static final int ERROR_SERVICE_UNAVAILABLE = 405;

}
