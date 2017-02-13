package com.ljs.model;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class TestAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		
		System.out.println("testAdvice_before运行,运行通知的方法是："+arg0.getName()+",方法参数是："+arg1[0]+",执行方法的类是："+arg2.getClass().getName());
	}

}
