package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "address")
public class AddressConfigFromYml {
    private String country;
    private String address;
    private String city;
    private String postcode;
    
    public void setCountry(String value){
        country = value;
    }
    
    public String getCountry(){
        return country;
    }
    
    public void setAddress(String value){
        address = value;
    }
    
    public String getAddress(){
        return address;
    }

    public void setCity(String value){
        city = value;
    }
    
    public String getCity(){
        return city;
    }

    public void setPostcode(String value){
        postcode = value;
    }
    
    public String getPostcode(){
        return postcode;
    }
}
