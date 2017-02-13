package com.ljs.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ljs.service.Person;


public class User {

	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	private String uname = "史玉然";
	private String upass;
	private String[] loves;
	private Role role;
	private List<Role> ls  = new ArrayList<Role>();
	
	public List<Role> getLs() {
		return ls;
	}
	public void setLs(List<Role> ls) {
		this.ls = ls;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String[] getLoves() {
		return loves;
	}
	public void setLoves(String[] loves) {
		this.loves = loves;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	
//	public String sayHello(String str,String str1)
//	{
//		System.out.println("Hello........"+str);
//		return "返回值";
//	}
	
	public String say(String str)
	{
		System.out.println("hello.........:"+str);
		return str;
	}
	
	public static void main(String liu[]){
		ApplicationContext ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");
//		UserJdbcTest jt = (UserJdbcTest)ac.getBean("jdbct");
//		User u =new User();
//		u.setId(22);
//		u.setUname("史玉然");
//		u.setUpass("张文宝");
//		System.out.println(jt.updateUser(u));
//		List<User> ls = jt.getUsersByRowCallbackHandler();
//		for(User u1:ls)
//		{
//			System.out.println(u1.getUname()+"：哈哈："+u1.getUpass());
//		}
//		User u  = new User();
//		u.setId(9);
//		u.setUname("shiyuran");
//		u.setUpass("99999");
//		int u1 = jt.queryUserCount(u);
//		System.out.println(u1);
		
		Person p = (Person)ac.getBean("staticAdvisroTest");
		p.say();
//		p.eat();
//		p.la();
//		//String[] strs = user.getLoves();
		//System.out.println(strs[0]);
		//System.out.println(user.getUname()+"是"+user.getRole().getName());
//		List<Role> rs = user.getLs();
//		for(Role r:rs)
//		{
//			System.err.println(user.getUname()+"是"+r.getName());
//		}
//		AfterAdvice aa = (AfterAdvice)ac.getBean("pointCut"); 
//		Interceptor ic= new TestMethodInterceptor();
//		TestMethodInterceptor ti = new TestMethodInterceptor();
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		User user = (User)ac.getBean("user");
//		BeforeAdvice ba=new TestAdvice();//得到通知对象
//		TestAfterReturningAdvice ta = new TestAfterReturningAdvice();
//		ProxyFactory pf = new ProxyFactory(); //使用代理工厂
//		pf.setTarget(user);//设置代理目标
//		pf.addAdvice(ba);//把前置通知加入到代理工厂
//		pf.addAdvice(ta);//把后置通知加入到代理工厂
//		pf.addAdvice(ti);
//		User users = (User)pf.getProxy();//生成代理对象
//		users.say("史玉然旺旺");
	}
}
