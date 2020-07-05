package method;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * We can access the methods of a class.
 */

public class Methods_Of_aClass {

	public static void main(String[] args) {
		
		Class<ArrayList> classObj=ArrayList.class;
		
		/*
		 * Returns: the array of method objects representing the public
		 * methods of this class.
		 */
		Method[] methodArray=classObj.getDeclaredMethods();
		for(Method method:methodArray) {
			System.out.println(method);
		}
	}

}
