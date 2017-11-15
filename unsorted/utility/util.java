package utility;

public class util extends MathMethod {

//	public util() {
//		// TODO Auto-generated constructor stub
//	}
	
	
	//
	// constnas variable
	//
	
	// chars can also contain escaped characters
	public static final char bs = '\b'; //backSpace
	public static final char ff = '\f'; //formFeed
	public static final char lf = '\n'; //lineFeed
	public static final char cr = '\r'; //carriageReturn
	public static final char ht = '\t'; //horizontalTab
	public static final char dq = '\"'; //doubleQuote
	public static final char sq = '\''; //singleQuote
	public static final char bsl = '\\'; //backSlash	
	
	
	
	//check if number 
	/*
	 * 1. void 
	 * 2.void || <0  
	 * 3. void 
	 * 4. void || ""
	 * 5. void || String.length <= 0
	 * English UPPER case to lowercase converter
	 * English lowercasae to UpperCase converter
	 * 
	 */
	
	
	

	public static void main(String[] args) {
	
	util u = new util();
	System.out.println("22" + bsl + "11");
	
//	Scanner s = new Scanner(System.in);
//	
//	String StrOutput = "";
//	int intOutput = 0;
//	
//	if (s.hasNextLine() == true) {
//		StrOutput = s.nextLine();
//	}
//	else if (s.hasNextInt() == true) {
//		intOutput = s.nextInt();
//	}
//	else
//		System.out.println("else");
//	
//	System.out.println("output result: " );
//	System.out.println("String = " + StrOutput);
//	System.out.println("int = " + intOutput);
//			
			

	System.out.println("extends MathMethod");
	MathMethod m = new MathMethod();
	System.out.println("m.intRandom == " + m.intRandom);
	m.intRandom = 22;
	System.out.println("m.intRandom == " + m.intRandom);
	
	

	
	}

}
