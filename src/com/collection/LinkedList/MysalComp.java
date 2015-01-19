package com.collection.LinkedList;

import java.util.Comparator;

public class MysalComp implements Comparator<Emp> {
	
	

	@Override
	public int compare(Emp e1, Emp e2) {
		if(e1.getSalary() < e2.getSalary())
			return 1;
		return 0;
	}

}
