package threadExample;


public class ThreadTtwo2 extends Thread {


	public String PuStName;
	
	
	public ThreadTtwo2(String StName) {		
		PuStName = StName;
	}


	
	public void run(){		
		for (int i = 0; i < 10; i++)
		{
			System.out.println(PuStName + " ==> " + i);
			try {
				sleep (10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	
	}
	
	public static void main(String [] args)
	{
		ThreadTtwo2 td1 = new ThreadTtwo2("Thread_1");
		ThreadTtwo2 td2 = new ThreadTtwo2("Thread_2");
		
		
		td1.start();
		td2.start();		

	}
}

