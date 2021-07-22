package uasNoDua;

public class MainProgram {
	
	public MainProgram (){

	RunnableClass rc1 = new RunnableClass();
	RunnableClass rc2 = new RunnableClass();
	RunnableClass rc3 = new RunnableClass();
	RunnableClass rc4 = new RunnableClass();
	RunnableClass rc5 = new RunnableClass();
	RunnableClass rc6 = new RunnableClass();
	RunnableClass rc7 = new RunnableClass();
	RunnableClass rc8 = new RunnableClass();
	RunnableClass rc9 = new RunnableClass();
	RunnableClass rc10 = new RunnableClass();
	
	Thread t1 = new Thread(rc1);
	Thread t2 = new Thread(rc2);
	Thread t3 = new Thread(rc3);
	Thread t4 = new Thread(rc4);
	Thread t5 = new Thread(rc5);
	Thread t6 = new Thread(rc6);
	Thread t7 = new Thread(rc7);
	Thread t8 = new Thread(rc8);
	Thread t9 = new Thread(rc9);
	Thread t10 = new Thread(rc10);
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	t6.start();
	t7.start();
	t8.start();
	t9.start();
	t10.start();
	
	(new Thread(new RunnableClass())).start();
	(new Thread(new RunnableClass())).start();
	(new Thread(new RunnableClass())).start();
	(new Thread(new RunnableClass())).start();
	(new Thread(new RunnableClass())).start();
	(new Thread(new RunnableClass())).start();
	(new Thread(new RunnableClass())).start();
	(new Thread(new RunnableClass())).start();
	(new Thread(new RunnableClass())).start();
	(new Thread(new RunnableClass())).start();
	
	(new ThreadClass()).start();
	(new ThreadClass()).start();
	(new ThreadClass()).start();
	(new ThreadClass()).start();
	(new ThreadClass()).start();
	(new ThreadClass()).start();
	(new ThreadClass()).start();
	(new ThreadClass()).start();
	(new ThreadClass()).start();
	(new ThreadClass()).start();
	
	
}

	public static void main(String[] args) {
				new MainProgram();
	}
	
	}


