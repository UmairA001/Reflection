package main;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/*
 * How to display the Metadata of a class 
 */
public class Metadata_Of_Class {

	public static void main(String[] args){
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the class name with their pkg name");
			String classname=br.readLine();
			
			Class<?> classobj=Class.forName(classname);
			System.out.println("Fields: ");
			
			/*
			 * Returns: the array of Fields objects representing all the declared
			 * fields of this class
			 */
			
			Field[] fieldArray=classobj.getDeclaredFields();
			for(Field f:fieldArray) {
				System.out.println(f);
			}
			
			System.out.println("--------------------");
			
			System.out.println("Constructors: ");
			/*
			 * Returns: the array of constructor  objects representing all the
			 * declared constructors of this class
			 */
			Constructor<?>[] constructArray=classobj.getDeclaredConstructors();
			for(Constructor c:constructArray) {
				System.out.println(c);
				
			}
			System.out.println("----------------------");
			
			System.out.println("Methods: ");
			/*
			 * Returns:the array of Method objects representing all the declared
			 * methods of this class
			 * 
			 */
			Method[] mtdhArray=classobj.getDeclaredMethods();
			for(Method m:mtdhArray) {
				System.out.println(m);
			}
			
		}catch(ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}

	}

}
