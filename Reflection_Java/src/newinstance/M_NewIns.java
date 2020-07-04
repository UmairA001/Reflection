package newinstance;

public class M_NewIns {

	public static void main(String[] args) {
		try{
			Class classOb=Class.forName("newinstance.DisplayMang");
			/*
			 * Returns: a newly allocated instance of the represented 
			 * by this object
			 */
			DisplayMang dm=(DisplayMang)classOb.newInstance();
			dm.printer();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
