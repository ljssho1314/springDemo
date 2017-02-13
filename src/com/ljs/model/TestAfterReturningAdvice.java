package com.ljs.model;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class TestAfterReturningAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("AfterReturningAdvice运行,返回值："+arg0+"   "+arg1.getName()+"  "+arg3.getClass().getName());
	} 

}
