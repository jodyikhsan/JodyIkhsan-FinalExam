package uasNoDua;

public class ThreadClass  extends Thread{
	public static final String Name = "Thread";

	
			
			@Override
			public void run() {
				System.out.println(ThreadClass.Name + "for thread is running.,.,.,.,.,.");
				try {
				System.out.println(ThreadClass.Name + "-" +Thread.currentThread().getName());
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		

		
		
	}


