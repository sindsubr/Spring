package org.sindu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Tyre {
    @Autowired
    @Qualifier("metroTyre")
    Company company;
    String brand;

//     constructor Injection -> contructor-arg tag in xml
//    public Tyre(String brand) {
//        this.brand = brand;
//    }

    // Setter Injection -> property tag in xml
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }

    @Override
    public String toString() {
        return "Tyre{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public void call(){
        company.companyName();
    }
}
