package paraPrivMtdh;

import java.lang.reflect.Method;

/*
 * How to call private method from another class in java?
 * 
 * We can call the private mtdh from outside the class by changing
 * the runtime behaviour of the class
 * 
 * By the help of "java.lang.Class" and "java.lang.reflect.Mathod"
 *  class, we can call private method from any other class.
 */

public class ParaPrivMtdh_Of_Class {

	public static void main(String[] args) {
		try{
			Class<Display> classObj=Display.class;
			Object displayObj=classObj.newInstance();
			
			Method method=classObj.getDeclaredMethod("displayNumber", new Class[] {int.class});
			method.setAccessible(true);
			method.invoke(displayObj, 10000001);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
