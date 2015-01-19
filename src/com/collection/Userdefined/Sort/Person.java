package com.collection.Userdefined.Sort;

public class Person {
private int age;
private String name;

Person (String name, int age){
    setName(name);
    setAge(age);
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
}
