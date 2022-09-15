package org.example;

import org.example.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        Student st = ctx.getBean("student", Student.class);
        System.out.println(st);
    }
}
