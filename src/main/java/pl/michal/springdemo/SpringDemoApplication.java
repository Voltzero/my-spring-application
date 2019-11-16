package pl.michal.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

    //this method runs Sprin container
    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }

}
