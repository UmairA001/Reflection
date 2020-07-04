package main;

import pkg.Employee;

public class Reflection_3 {

	public static void main(String[] args) {
		/*
		 * 3) .class
		 * If a type is available but there is no instance then it is possible 
		 * to obtain a Class by appending ".class" to the name of the type.
		 * It can be used for primitive data type also.
		 */
		
		Class<Employee> empClassObj=Employee.class;
		System.out.println(empClassObj.getName());
		
		Class<Integer> intClassObj=int.class;
		System.out.println(intClassObj.getName());
	}

}
