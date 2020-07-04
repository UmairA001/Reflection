package main;
import pkg.*;

public class Reflection_2 {

	public static void main(String[] args) {
		Employee emp=new Employee("Umair",22);
		
		/*
		 * 2) getClass()
		 * 
		 * Returns: the class object that represents the runtime 
		 * class of this object.
		 */
		
		Class<? extends Employee> classobj=emp.getClass();
		System.out.println(classobj.getName());
	}

}
