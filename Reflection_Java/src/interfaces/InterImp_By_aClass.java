package interfaces;

import java.util.ArrayList;

/*
 * It is possible to get a list of the interfaces implemented  by a given class.
 */

public class InterImp_By_aClass {

	public static void main(String[] args) {
		Class<ArrayList> classObj=ArrayList.class;
		
		/*
		 * Returns: An array of Interfaces implemented by this class.
		 * 
		 * A class can implement many interfaces.Therefore an array of Class is
		 * returned.Interfaces are also represented by Class objects in Java 
		 * Reflection
		 */
		
		Class[]classArray=classObj.getInterfaces();
		
		for(Class c:classArray) {
			System.out.println(c.getName());
		}
	}

}
