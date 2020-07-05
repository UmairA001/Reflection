package constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashSet;

/*
 * We can access the constructor of a class.
 */
public class Constructor_Of_Class {

	public static void main(String[] args) {
		Class<HashSet> classObj=HashSet.class;
		
		/*
		 * Returns: the array of constructor objects representing the public
		 * constructors of this class
		 */
		
		Constructor<?>[] constArray=classObj.getConstructors();
		
		for(Constructor constructor:constArray) {
			System.out.println("Constructor = "+constructor);
			System.out.println("Name = "+constructor.getName());
			System.out.println("ParameterCount = "+constructor.getParameterCount());
			System.out.println("----------------------------");
		
			/*
			 * Returns: an array of Parameter objects representing all the 
			 * parameters to the executable this object represents.
			 */
			
			Parameter[] parameterArray=constructor.getParameters();
			for(Parameter parameter:parameterArray) {
				System.out.println("Parameter Type =  "+parameter.getParameterizedType());
				System.out.println("Parameter Name =  "+parameter.getName());;
			}
			System.out.println("------------------------");
		}
		

	}

}
