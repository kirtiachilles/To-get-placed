package com.kirti.thread;

public class PrintMsg implements Runnable{

	public void run() {
		String threadName=Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(threadName	+"Hello");
		}
	}
	
} 

class LoopThread {

public static void main(String[] args) {
	new Thread(new PrintMsg()){
		
	}.start();
	
	PrintMsg target=new PrintMsg();
	Thread t=new Thread(target);
	t.start();
	}
}
