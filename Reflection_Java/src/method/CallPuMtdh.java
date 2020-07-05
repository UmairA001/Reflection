package method;

import java.lang.reflect.Method;

/*
 * Invoking Methods using Method Object.
 */

public class CallPuMtdh {

	public static void main(String[] args) {
		try {
			Class<DispMsg> classObj=DispMsg.class;
			Method method =classObj.getMethod("displayMessage", new Class[] {String.class});
			
			DispMsg dispMessageObj=classObj.newInstance();
			/*
			 * Invokes the underlying method represented by this method object,
			 * on the specified object with the specified parameters.
			 */
			method.invoke(dispMessageObj, "Hello Aryan");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
