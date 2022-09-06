package org.sindu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements Vehicle{
	@Value("${bike_info}")
	private String bikeInfo;
	
	public void setBikeInfo(String bikeInfo) {
		this.bikeInfo = bikeInfo;
	}
	@Autowired
    Tyre tyre;
    public void drive(){
        System.out.println("Vehicle Bike");
        System.out.println("Tyre Brand:");
        System.out.println(bikeInfo);
        tyre.call();
    }
}
