package threadExample;

public class javaThread extends Thread {

	//private static int intCount = 0;
	public String PuStName;
	
	
	public javaThread(String StName) {		
		PuStName = StName;
	}


	
	public void run(){
		//intCount++; 
		//System.out.println("intCount = " + intCount);
		
		
		
		for (int i = 0; i < 100; i++)
		{
			System.out.println(PuStName + " ==> " + i);
		}
		
		
	}

	
	public String getPuStName() {
		return PuStName;
	}



	public void setPuStName(String puStName) {
		PuStName = puStName;
	}

	
	
	public static void main(String [] args)
	{
		javaThread td1 = new javaThread("Thread_1");
		javaThread td2 = new javaThread("Thread_2");
		javaThread td3 = new javaThread("Thread_3");
		
		
		td1.start();
		td2.start();		
		td3.start();				
	}
}
