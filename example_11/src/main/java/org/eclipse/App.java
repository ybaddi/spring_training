package org.eclipse;



import org.eclipse.config.ApplicationConfig;
import org.eclipse.language.SalutationFr;
import org.eclipse.model.Adress;
import org.eclipse.model.LanguageSwitcher;
import org.eclipse.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        LanguageSwitcher fr = context.getBean("languageSwitcher", LanguageSwitcher.class);
//        fr.direBonjour();
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Student st = ctx.getBean("student", Student.class);
//        System.out.println(st);
        Student st2 = ctx.getBean("student", Student.class);
//        System.out.println(st2);
        
//        LanguageSwitcher fr = ctx.getBean("languageSwitcher", LanguageSwitcher.class);
//        fr.direBonjour();
//        
//        SalutationFr sltfr = ctx.getBean("salutationFr", SalutationFr.class);
//        sltfr.sayHello();
//        sltfr.setName("baddi");
//        
//        SalutationFr sltfr2 = ctx.getBean("salutationFr", SalutationFr.class);
//        sltfr2.sayHello();
//        System.out.println(sltfr2.getName());
//        
//        System.out.println(st == st2);
//        System.out.println(st);
//        System.out.println(st2);
        
        Adress adr1 = st.getAdress();
        Adress adr2 = st.getAdress();
        
        System.out.println(adr1 == adr2);
        
        
    }
}

/*
 * Singleton
 * prototype
 * request
 * session
 * application
 */




