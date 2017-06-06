
//class: every line of code in java need to be in a "class".
public class JavaBasic {
	
	//static - no need for instance of the class
	public static int intCount = 0;
	
	//ini - integer
	private int age;
	
	// String sequence of characters.
	private String StDescribe;
	
	private boolean flage = false;
	
	private char grade = 'A';

	
	/*
	 * Getter / Setter
	 */
	public static int getIntCount() {
		return intCount;
	}

	public static void setIntCount(int intCount) {
		JavaBasic.intCount = intCount;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStDescribe() {
		return StDescribe;
	}

	public void setStDescribe(String stDescribe) {
		StDescribe = stDescribe;
	}
	
	
	
	//main method (function)
	public static void main(String[] args) {

		//++increment++
		//--decrement--		
		//
		//prefix
		int a = 2;
		int b = ++a; // a=3, b=3
		System.out.println("prefix >> a = 2, b = ++a ====> a== " + a + " b== " + b);
		//
		//postfix
		int c = 3;
		int d = c--; // d=3 c=2
		System.out.println("postfix >> c = 3, d = c-- ====> c== " + c + " d == " + d);

			
		JavaBasic jb = new JavaBasic();
		   intCount = 0;
		   intCount = intCount + 1;
		   
		   System.out.println("\nStatic int intCount === " + jb.intCount);	  		   
	}
}


