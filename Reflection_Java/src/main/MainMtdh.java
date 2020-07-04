package main;
import pkg.*;
public class MainMtdh {

	public static void main(String[] args) throws ClassNotFoundException {
		try {	
			
			//How to get the Object of a Class class?
			
			/*	3 ways to get the instance of Class class
					1)forName() methods of Class class
					2)getClass() method of Object class
					3)the .class syntax				*/
	
			/* 1) forNmae() method is used to load the class dynamically.
			
			Returns:the Class object for the class with the specified name.
			
			forName() method should be used if you know the fully
			qualified name of class.This cannot be used for primitive types.
			 */
			 
			 
			Class classobj=Class.forName("pkg.Employee");
			System.out.println(classobj.getName());
			System.out.println(classobj.getSimpleName());
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace(); 
		}
	}
}
