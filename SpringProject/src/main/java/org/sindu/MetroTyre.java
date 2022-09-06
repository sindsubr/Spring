package org.sindu;

import org.springframework.stereotype.Component;

@Component
public class MetroTyre implements Company{
    @Override
    public void companyName() {
        System.out.println("MetroTyre");
    }
}
