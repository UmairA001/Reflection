package method;

import java.lang.reflect.Method;

/*
 * Invoking Static Methods using Method Object.
 */
public class CallStatMtdh {

	public static void main(String[] args) {
		try {
			Class<DispMsg> classObj=DispMsg.class;
			
			Method method =classObj.getMethod("displayMessage2", new Class[] {String.class});
			
			/*
			 * Invokes the underlying method represented by this method object,
			 * on the specified object with the specified parameters.
			 */
			method.invoke(null, "Hello Atul");
			}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
