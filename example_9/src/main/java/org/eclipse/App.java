package org.eclipse;



import org.eclipse.model.LanguageSwitcher;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        LanguageSwitcher fr = context.getBean("languageSwitcher", LanguageSwitcher.class);
        fr.direBonjour();
        
    }
}
