package annotation;

import java.lang.annotation.Annotation;

import paraPrivMtdh.Display;

/*
 * We can Access the class annotation of a class.
 */

public class Anno_Of_aClass {

	public static void main(String[] args) {
		Class<DisplayAnn> classObj=DisplayAnn.class;
		
		/*
		 * Returns: annotations present on this element.
		 */
		
		Annotation[] annotationArray=classObj.getAnnotations();
		
		for(Annotation annotation:annotationArray) {
			System.out.println(annotation);
		}

	}

}
