package uasNoDua;

public class RunnableClass implements Runnable{
	public static final String Name ="Runnable";

		@Override
		public void run() {
	
		System.out.println("Thread is Running.,.,..,.,.,");
		System.out.println("Please Wait");
		try {
		Thread.sleep(1000);	
		} catch (Exception e) {
		
			e.printStackTrace();
				}
			}

	}


