package com.ljs.model;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class TestMethodInterceptor implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		//arg0获得拦截对象
		System.out.println(arg0.getMethod()+"方法执行之前"+arg0.getArguments()[0]);
		Object o = arg0.proceed();
		System.out.println(arg0.getMethod()+"方法执行之后");
		return o;
	}
}
