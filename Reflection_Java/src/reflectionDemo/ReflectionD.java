package reflectionDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
 * Reflection: is a feature of Core Java.Using it we can analyze
 * object at run time;
 * 
 * Using Java Reflection we can inspect Java Classes at runtime.
 * Inspecting classes is often the first thing we do when using Reflection.
 * From the classes we can obtain info about:-
 * 
 * 1)we can also get Class & it's properties dynamically
 * 2)Properties are methods,constructors,variables
 * 3)we can also get it's modifiers (Access & Non-Access).
 * 4)Class Name,Package Info,Superclass,Annotations
 */

class MyClass{
	private int age;
	public String name;
	float salary;
	
	public MyClass() {}
	public MyClass(int a,String s) {
			age=a;
			name=s;
	}
	
	public int add(int x,int y) {
		return x+y;
	}
	private void printer() {
		System.out.println("Hello,World");
	}
}

public class ReflectionD {
	
	public static void printFields(Class cl) {
		Field[] f=cl.getDeclaredFields();
		for(int i=0;i<f.length;i++) {
			Class type=f[i].getType();
			String name=f[i].getName();
			//System.out.println();
			String modifiers=Modifier.toString(f[i].getModifiers());
			if(modifiers.length()>0) {
				System.out.print(modifiers+ " ");
			}
			System.out.println(type.getName()+ " "+name+";");
		}
		System.out.println("-------END OF FIELDS----------");
		System.out.println();
	}
	

	public static void printMethods(Class cl) {
		Method[] methods=cl.getDeclaredMethods();
		for(Method m:methods) {
			Class reType=m.getReturnType();
			String name=m.getName();
			System.out.print("");
			String modifiers=Modifier.toString(m.getModifiers());
			if(modifiers.length()>0) {
				System.out.print(modifiers+" ");
			}
			System.out.print(reType.getName()+" "+name+"(");
			Class[] paramTypes=m.getParameterTypes();
			for(int i=0;i<paramTypes.length;i++) {
				if(i>0)System.out.print(", ");
				System.out.print(paramTypes[i].getName());
			}
			System.out.println(");");
		}
		System.out.println("-----------END OF METHODS-----------");
		System.out.println();
	}
	
	public static void printConstructors(Class cl) {
		Constructor[] constructor=cl.getDeclaredConstructors();
		for(Constructor c:constructor) {
			String name=c.getName();
			System.out.print("");
			String modifiers=Modifier.toString(c.getModifiers());
			if(modifiers.length()>0) {
				System.out.print(modifiers+" ");
			}
			System.out.print(name+"(");
			Class[] paramTypes=c.getParameterTypes();
			for(int i=0;i<paramTypes.length;i++) {
				if(i>0)System.out.print(", ");
				System.out.print(paramTypes[i].getName());
			}
			System.out.println(");");
		}
		System.out.println("---------END OF CONSTRUCTOR-----------");
		System.out.println();
	}
	
	public static void main(String[] args) {
		String s=new String("Lucknow");
		Class cl=s.getClass();
		//Class cls=String.class;
		System.out.println(cl.getName());
		Class ic=int.class;
		System.out.println(ic.getName());
		
		try {
//			Class cs=Class.forName(cl.getName());
//			String ob=(String)cs.newInstance();
//			System.out.println(ob);
//			System.out.println(s);
					
			printFields(MyClass.class);
			printMethods(MyClass.class);
			printConstructors(MyClass.class);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
