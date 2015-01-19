package com.collection.Userdefined.Sort;
/*This Example uses comparator*/
import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

@Override
public int compare(Person obj1, Person obj2) {
    return obj1.getAge() - obj2.getAge();
	}
}
