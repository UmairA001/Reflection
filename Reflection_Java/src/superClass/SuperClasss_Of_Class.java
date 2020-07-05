package superClass;

import java.util.ArrayList;

/*
 * From the class object we can access the superclass of the class
 */

public class SuperClasss_Of_Class {

	public static void main(String[] args) {
		Class<ArrayList> classObj=ArrayList.class;
		
		/*
		 * Returns: the superclass of the class represented by this object
		 */
		
		Class<? super ArrayList> superclass=classObj.getSuperclass();
		
		System.out.println(superclass);
		System.out.println("Name = "+superclass.getName());
		System.out.println("Simple Name = "+superclass.getSimpleName());
		
	}

}
