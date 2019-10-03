package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie= context.getBean(Movie.class);
        movie.display();


    }
}
