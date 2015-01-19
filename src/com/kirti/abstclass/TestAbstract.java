package com.kirti.abstclass;

class TestAbstract extends MyAbstract{

	public TestAbstract(int j) {
		super(j);				
	}
	public void play(){
		System.out.println("implemented in derived");
		return;
	}
	void joy(){
		System.out.println("Enjoying in derived "+i);
	}
	public static void main(String[] args) {
		MyAbstract obj=new TestAbstract(30);
		obj.play();
		obj.joy();		
	}

}
