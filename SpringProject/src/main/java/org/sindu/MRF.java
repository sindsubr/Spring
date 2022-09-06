package org.sindu;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mrf")
public class MRF implements Company{
    @Override
    public void companyName() {
        System.out.println("MRF");
    }
}
