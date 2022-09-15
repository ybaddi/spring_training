package org.eclipse.main;

import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.eclipse.model.Student;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student st = context.getBean("etudiant", Student.class);
        System.out.println(st);
        
        
        
        
        
        Student st2 = context.getBean("etudiant", Student.class);
        System.out.println(st2);
        
        Student st3 = context.getBean("etudiant", Student.class);
        BeanFactory bf = (BeanFactory)context;
        Student p = (Student) bf.getBean("etudiant");
        System.out.println(st2);
        
        }
}
