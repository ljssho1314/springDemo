package com.ljs.model;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class TestAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		
		System.out.println("testAdvice_before����,����֪ͨ�ķ����ǣ�"+arg0.getName()+",���������ǣ�"+arg1[0]+",ִ�з��������ǣ�"+arg2.getClass().getName());
	}

}
