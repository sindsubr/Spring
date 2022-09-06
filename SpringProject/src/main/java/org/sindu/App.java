package org.sindu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By Sinduja
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Xml Based Configuraiton - Spring Framework
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        //Annotation Based Configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


//        Vehicle vehicle = new Bike();
//        Vehicle vehicle = (Vehicle) context.getBean("car"); //casting
//        vehicle.drive();
        System.out.println(2<<10);

        Vehicle vehicle = (Vehicle) context.getBean(Vehicle.class); //casting
        vehicle.drive();
    }
}
