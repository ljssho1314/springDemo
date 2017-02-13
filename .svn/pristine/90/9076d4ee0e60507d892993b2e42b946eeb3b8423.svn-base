package com.ljs.testProxy;

public class PeronProxy {

	
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public void getBeanPerson(String context)
	{
		System.out.println(context);
		person.say();
	}
	
	
	public static void main(String liu[])
	{
		Person p = new Person();
		String context = "¼ÇÂ¼ÈÕÖ¾";
		PeronProxy pp = new PeronProxy();
		pp.setPerson(p);
		pp.getBeanPerson(context);
	}
}
