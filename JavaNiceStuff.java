/****
 * JavaNiceStuff - 
 */


import utility.util;

public class JavaNiceStuff {
	
	private int Result; 
	

	public JavaNiceStuff() {
		// TODO Auto-generated constructor stub
	}

	
	
	public static void main(String[] args) {
		
		//Declare - instance of the class
		JavaNiceStuff jns = new JavaNiceStuff();		
		JavaBasic jb = new JavaBasic();
		util u = new util();
		
		
		jb.intCount += 3;		
		jns.Result = jb.getIntCount();
		System.out.println("Result/jb.getIntCount() === " + u.bsl + "\n\n--or-- jb.intCount === " + jb.intCount);
	}	
}

/***
 *  // create a box "/***" + enter 
 *  
 */
