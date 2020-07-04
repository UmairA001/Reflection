package main;

public class ReflectionDemo {

	public static void main(String[] args) {
		try {
			Class classObClass=Class.forName("java.util.List");
			
			/*
			 * Returns:true if this object represents an interface; false otherwise. 
			 */
			
			System.out.println("Is a instance ="+classObClass.isInterface());
			/*
			 * Returns: true if and only if this class is a member class. 
			 */
			System.out.println("Is a MemberClass ="+classObClass.isMemberClass());
			/*
			 * Returns: true if and only if this class represents a primitive type.
			 */
			System.out.println("Is a Primitive ="+ classObClass.isPrimitive());
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
