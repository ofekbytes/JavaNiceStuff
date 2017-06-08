package utility;

public class MathMethod {


	public MathMethod() {

		System.out.println("\nMath.method: ");
		System.out.println("Math.abs(10) ==> " + Math.abs(10)); //10
		System.out.println("Math.abs(10) ==> " + Math.abs(-20)); //20
		
		System.out.println("Math.ceil(3.23) ==> " + Math.ceil(3.23)); //4
		System.out.println("Math.floor(-3.23) ==> " + Math.floor(3.23)); //3
		
		System.out.println("Math.max(3,7) ==> " + Math.max(3,7)); //7
		System.out.println("Math.min(5,3) ==> " + Math.min(5,3)); //3
		
		System.out.println("Math.pow(3,2) ==> " + Math.pow(3,2)); //9.0
		
		//Math.method more example
		//Math.sqrt(), Math.sin(), Math.cos(), Math.PI(), Math.random()
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
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
