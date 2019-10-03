package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;


public class Movie {


     Actor actor;



    public Movie(Actor actor) {
        this.actor=actor;
    }
    public void display() {
        System.out.println(actor.Name + "  " + actor.Gender + " " + actor.Age);
    }


}
