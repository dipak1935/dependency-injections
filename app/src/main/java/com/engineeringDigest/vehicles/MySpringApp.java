package com.engineeringDigest.vehicles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {


        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");

//        Vehicle vehicle=context.getBean("myVehicle",Vehicle.class);
        // Or;

         Vehicle bus= (Vehicle) context.getBean("myBus");

         Vehicle car=context.getBean("myCar",Vehicle.class);


//        System.out.println(bus.getMileage());
//        System.out.println(car.getMileage());


        System.out.println(bus.getDiscountMessage());

        System.out.println(bus.getBrandName());

        Car c=context.getBean("myCar",Car.class);

        System.out.println(c.getBrandName());




    }
}
