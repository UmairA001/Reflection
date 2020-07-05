package field;

import java.lang.reflect.Field;

/*
 * Getting & Setting Field Values.
 */

public class SetGet_Fields {

	public static void main(String[] args) {
		try {
			Class<StudeD> classObj=StudeD.class;
			/*
			 * Returns: the Field object of this specified by name.
			 */
			
			Field ageField=classObj.getField("age");
			System.out.println("Field Name = "+ageField.getName());
			System.out.println("Field Type = "+ageField.getType());
			
			StudeD student=classObj.newInstance();
			/*
			 * Sets the field represented by this Field object on the specified
			 * object argument to the specified new value. 
			 */
			
			ageField.set(student, 24);
			Object  agevalue=ageField.get(student);
			System.out.println("age =  "+agevalue);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
