package com.Inheritence;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Amir");
		student.setEmail("sasa@a.com");
		
		Person person = new Person();
		person.setName("Amir");
		person.setEmail("sasa@a.com");
		person.setPhone(1234567890);
		String value = person.toString();
		System.out.println(value);
		System.out.println(person);
	}
	

}
