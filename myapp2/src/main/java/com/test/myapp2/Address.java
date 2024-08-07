package com.test.myapp2;

import org.springframework.stereotype.Component;

// @Component, @Service, @Repository, @RestController, @Controller
@Component
public class Address {
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
