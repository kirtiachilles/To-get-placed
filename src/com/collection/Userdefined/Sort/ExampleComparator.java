package com.collection.Userdefined.Sort;

import java.util.*;

public class ExampleComparator {
public static void main(String[] args) {

    List<Person> list = new ArrayList<Person>();
    list.add(new Person("kirti",24));
    list.add(new Person("shruti",14));
    list.add(new Person("preity",11));
    list.add(new Person("siddhi",14));
    list.add(new Person("suraj",6));
    for (Person person : list) {
        System.out.println(person.getName()+ "   "+ person.getAge());
    }
    Collections.sort(list,new PersonComparator());
    System.out.println("After sorting\n");
    for (Person person : list) {
        System.out.println(person.getName()+ "   "+ person.getAge());
    }
}
}




