package org.sindu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    @Autowired
    Tyre tyre;
    public void drive() {
        System.out.println("Vehicle Car");
        System.out.println("Tyre Brand:");
        tyre.call();
    }
}
