package privateMtdh;

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
public class PrivateMtdh_Of_Class {

	public static void main(String[] args) {
		try {
			Class<?> classobj=Class.forName("privateMtdh.Student");
			Student studobj=(Student)classobj.newInstance();
			Method method=classobj.getDeclaredMethod("showStudName",null);
			method.setAccessible(true);
			/*
			 * Parameters:
			 * 
			 * obj - the object the underlying method is invoked from
			 * 
			 * args - the arguments used for the method call
			 * 
			 * Returns: the result  of dispatching the mtdh
			 * represented by this object on obj with the parameters args
			 * 
			 */
			method.invoke(studobj, null);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
