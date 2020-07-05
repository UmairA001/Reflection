package pkgInfo;

import java.util.ArrayList;

public class PackInfo {

	public static void main(String[] args) {
		Class<ArrayList> classobj=ArrayList.class;
		/*
		 * Gets the package for this class. The class loader of this class is
		 * used to find package.
		 */
		Package packageObj=classobj.getPackage();
		/*
		 * Returns: The Fully-qualified name of this package
		 */
		System.out.println("Package name: "+packageObj.getName());;
		/*
		 * Returns: The title of the implementation,null is returned if it is not known.
		 */
		System.out.println("Implemenatation Title: "+packageObj.getImplementationTitle());
		/*
		 * Returns: The version of the implementation,null is returned if it is not known.
		 */
		System.out.println("Implementationversion: "+packageObj.getImplementationVersion());
		/*
		 * Returns: The Specification vendor,null is returned if it is not known.
		 */
		System.out.println("Specificationvendor: "+packageObj.getImplementationVendor());
		/*
		 * Returns: The Specification  title,null is returned if it is not known.
		 */
		System.out.println("Specifiaction Title: "+packageObj.getSpecificationTitle());
	}

}
