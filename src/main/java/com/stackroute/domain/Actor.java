package com.stackroute.domain;

public class Actor {

    String Name;

    public Actor(String name, String gender, int age) {
        Name = name;
        Gender = gender;
        Age = age;
    }

    String Gender;
    int Age;
    public void display(){
        System.out.println(Name +" "+ Gender+ " "+ Age);
    }



}
