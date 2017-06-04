
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
		int prefix_a = 3;
		System.out.println("prefix_a  === " + "" +  prefix_a);
		int prefix_b = ++prefix_a;
		System.out.println("++prefix_a  === " + "" +  prefix_a  + " prefix_b === " + prefix_b);

		
		System.out.println("");
		
		
		int postfix_a = 2;
		System.out.println("postfix_a  === " + "" +  postfix_a);
		int postfix_b = postfix_a--;
		System.out.println("postfix_a  === " + "" +  postfix_a  + " postfix_b === " + postfix_b);
		
		
		
		JavaBasic jb = new JavaBasic();
		   intCount = 0;
		   intCount = intCount + 1;
		   
		   System.out.println("\nStatic int intCount === " + intCount);
		  
		   
	}

}