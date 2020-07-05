package field;

import java.lang.reflect.Field;

/*
 * we can access the fields (member variables) of a class.
 */
public class Fields_Of_aClass {

	public static void main(String[] args) {
		Class<StudD> classObj=StudD.class; 
		/*
		 * Returns: the array of field Object representing the public class.
		 */
		Field[] fieldArray=classObj.getDeclaredFields();
		
		for(Field field:fieldArray) {
			System.out.println(field);
			System.out.println(field.getName());
			System.out.println("--------------------");
		}


	}

}
