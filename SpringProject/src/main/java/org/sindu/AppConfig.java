package org.sindu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.sindu")
@PropertySource("classpath:info.properties")
public class AppConfig {
//    @Bean
//    public Tyre getTyre() {
//        return new Tyre();
//    }
//    @Bean
//    public Vehicle getVehicle(){
//    return new Car();
//    }
}
