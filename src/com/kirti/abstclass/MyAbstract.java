package com.kirti.abstclass;

public abstract class MyAbstract {
	int i;
	public MyAbstract(int j){
		this.i=j+20;
	}
	abstract void play();
	void joy(){
		System.out.println("Enjoying");
	}
}
