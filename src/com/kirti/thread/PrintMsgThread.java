package com.kirti.thread;

public class PrintMsgThread implements Runnable {
	String message;
	public PrintMsgThread(String msg)
	{
		this.message=msg;
	}
	
	public void run()
	{
		String threadName=Thread.currentThread().getName();
		System.out.println(threadName +"=>"+ this.message );
	}
}

class ThreadWithParameter {
	public static void main(String[] args)
	{
		PrintMsgThread target1=new PrintMsgThread("Morning Thread");
		Thread t1= new Thread(target1);
		t1.setName("Morning Thread");
		t1.start();
		
		PrintMsgThread target2=new PrintMsgThread("Aternoon Thread");
		Thread t2= new Thread(target2);
		t2.setName("Afternoon Thread");
		t2.start();
		
		PrintMsgThread target3=new PrintMsgThread("Evening Thread");
		Thread t3= new Thread(target1);
		t3.setName("Evening Thread");
		t3.start();
		
		new Thread(){
			public void run(){
				this.setName("kirti");
				String threadName=Thread.currentThread().getName();
				System.out.println(threadName);
			}
		}.start();
	}
}