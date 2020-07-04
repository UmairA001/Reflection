package main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import pkg.Employee;

public class Reflection_Types {

	public static void main(String[] args) {
		try {
			Employee emp=new Employee("Akash",23);
			
			/*
			 * Returns: The Class Object that Represents the runtime
			 * class of this object.
			 */
			
			Class<? extends Employee> empClass=emp.getClass();
			
			/*
			 * Returns: the array of Methods objects representing the 
			 * public methods of this class. 
			 */
			
			Method[]  mtdhArray=empClass.getMethods();
			for(Method m:mtdhArray) {
				System.out.println(m.getName());
			}
			
			System.out.println("--------------------------");
			
			/*
			 * Returns: the array of Field objects representing all the
			 * declared fields of this class.
			 */
			
			Field[] fieldArray=empClass.getDeclaredFields();
			for(Field f:fieldArray) {
				System.out.println(f.getName());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
