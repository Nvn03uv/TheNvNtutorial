package com.nvn.thread;

// No Guarantee of execution.
public class YieldExp extends Thread {

	 public void run()  
	    {  
	        for (int i=0; i<10 ; i++)  
	            System.out.println(Thread.currentThread().getName() + " in control for I = "+(i+1));  
	    }  
	    public static void main(String[]args)  
	    {  
	    	YieldExp t1 = new YieldExp();  
	    	YieldExp t2 = new YieldExp();  
	        // this will call run() method  
	        t1.start();  
	        t2.start();  
//	        for (int i=0; i<3; i++)  
//	        {  
	            // Control passes to child thread  
	            t1.yield();  
	            System.out.println(Thread.currentThread().getName() + " in control");  
//	        }  
	    }  
}
