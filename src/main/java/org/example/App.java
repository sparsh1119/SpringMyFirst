package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext a = new ClassPathXmlApplicationContext("Beans.xml");
        Mobile m1 = a.getBean(Mobile.class);
        m1.display();

        Mobile m2 = a.getBean(Mobile.class);
        m2.display();

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());

        a.close();
    }
}
