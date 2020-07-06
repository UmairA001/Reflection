package reflectionDemo;

import java.lang.reflect.Method;

class MethodDem{
	public void printer() {
		System.out.println("Printer Called");
	}
	public int add(int x,int y) {
		return x+y;
	}
}

public class MtdhCall {

	public static void main(String[] args) {
		MethodDem md=new MethodDem();
		Class classObj=md.getClass();
		try {
			Method m=classObj.getMethod("printer");
			m.invoke(md);
			Method m2=classObj.getMethod("add",int.class,int.class);
			Integer it=(Integer)m2.invoke(md, 10,20);
			System.out.println("Sum is = "+it);
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
