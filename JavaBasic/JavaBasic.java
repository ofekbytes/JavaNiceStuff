
//class: every line of code in java need to be in a "class".
public class JavaBasic {
	
	/*
	 * variable declaration
	 */
	
	public static int intCount = 0;	//static - no need for instance of the class
	private int age;	//ini - integer
	private String StDescribe;	// String sequence of characters.
	private boolean flage = false;
	private char grade = 'A';
	
	//constraction
	public JavaBasic() {
		//super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Methods examples
	 */
//	method with NO parameters
	public void methodCalling()	{
		System.out.println("this is a method without parameters");
	}

//	method with one parameters
	public void methodCalling(int parameterOne){
		System.out.println("method with a parameters , parameterOne >> " +  parameterOne);
	}
	
//	method + 2 parameters
	public void methodCalling(int parameterOne, int parameterTwo){
		System.out.println("method with a parameters , parameterOne >> " +  parameterOne + " , "+ parameterTwo);
	}
	

	public void methodPrePostFix(){
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

	}
	
	
	
	
	/*
	 * Getter , Setter
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
	/**
	 * /Getter , /Setter
	 */
	
	
	//main method (function)
	public static void main(String[] args) {


			
		JavaBasic jb = new JavaBasic();
		   intCount = 0;
		   intCount = intCount + 1;
		   
		   System.out.println("\nStatic int intCount === " + jb.intCount);	  		   
	}
}


