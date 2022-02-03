package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class DatasouceConfigFromAppProperties {
    String username;
    String password;

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String value)
    {
        username = value;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String value)
    {
        password = value;
    }
}
