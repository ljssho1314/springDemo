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

	private String uname = "ʷ��Ȼ";
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
//		return "����ֵ";
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
//		u.setUname("ʷ��Ȼ");
//		u.setUpass("���ı�");
//		System.out.println(jt.updateUser(u));
//		List<User> ls = jt.getUsersByRowCallbackHandler();
//		for(User u1:ls)
//		{
//			System.out.println(u1.getUname()+"��������"+u1.getUpass());
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
		//System.out.println(user.getUname()+"��"+user.getRole().getName());
//		List<Role> rs = user.getLs();
//		for(Role r:rs)
//		{
//			System.err.println(user.getUname()+"��"+r.getName());
//		}
//		AfterAdvice aa = (AfterAdvice)ac.getBean("pointCut"); 
//		Interceptor ic= new TestMethodInterceptor();
//		TestMethodInterceptor ti = new TestMethodInterceptor();
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		User user = (User)ac.getBean("user");
//		BeforeAdvice ba=new TestAdvice();//�õ�֪ͨ����
//		TestAfterReturningAdvice ta = new TestAfterReturningAdvice();
//		ProxyFactory pf = new ProxyFactory(); //ʹ�ô�����
//		pf.setTarget(user);//���ô���Ŀ��
//		pf.addAdvice(ba);//��ǰ��֪ͨ���뵽������
//		pf.addAdvice(ta);//�Ѻ���֪ͨ���뵽������
//		pf.addAdvice(ti);
//		User users = (User)pf.getProxy();//���ɴ������
//		users.say("ʷ��Ȼ����");
	}
}
