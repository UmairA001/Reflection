package reflectionDemo;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

class Rdemo{
	public int age;
	protected String name;
	private char gender;
	int salary;
	
	public Rdemo(int i,String s,char c) {
		age=i;
		name=s;
		gender=c;
	}
}
public class Feilds {

	public static void main(String[] args) {
		Rdemo rd=new Rdemo(20,"Kashif Manzoor",'M');
		Class classObj=rd.getClass();
		System.out.println(classObj.getSuperclass());
		Field[] fields=classObj.getDeclaredFields();
		AccessibleObject.setAccessible(fields,true);
		try {
			for(Field f:fields) {
				System.out.println("Name = "+f.getName()+", ");
				System.out.println("Type = "+f.getType()+", ");
				System.out.println("Pararmeter value  =  "+f.get(rd)+", ");
				System.out.println("Modifiers = "+f.getModifiers()+", ");
				System.out.println("Acesssible = "+f.isAccessible()+", ");
				System.out.println("--------------------");
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
