package constructor;

import java.lang.reflect.Constructor;

/*
 * Instantiating Objects using Constructor Object.
 */

public class InstantObj_UsiConstr {

	public static void main(String[] args) {
		try {
			Class classObj=String.class;
			
			/*
			 * Parameters:
			 * 
			 * parameterTypes: the parameter array
			 * 
			 * Returns: the constructor object of the public
			 * constructor that matches the specified parameterTypes.
			 */
			
			Constructor constructor=classObj.getConstructor(StringBuffer.class);
			StringBuffer sb=new StringBuffer("Arpit");
			
			/*
			 * Returns: a new object created by calling the constructor
			 * this object represents.
			 */
			
			String str=(String)constructor.newInstance(sb);
			System.out.println(str);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
