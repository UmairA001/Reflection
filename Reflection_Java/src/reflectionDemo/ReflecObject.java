package reflectionDemo;

import java.lang.reflect.Array;

public class ReflecObject {

	public static void main(String[] args) {
		int[] a={1,2,3};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Class classObj=a.getClass();
		Class ct=classObj.getComponentType();
		int[] ar=(int[])Array.newInstance(ct, 20);
		System.arraycopy(a, 0, ar,0,Math.min(a.length,ar.length));
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"  ");
		}
		System.out.println();
	}

}
