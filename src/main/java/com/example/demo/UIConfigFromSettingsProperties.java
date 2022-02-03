package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "spring.setting")
public class UIConfigFromSettingsProperties {
    int interal;
    int sleepTime;

    public int getInterval()
    {
        return interal;
    }

    public void setInterval(int value)
    {
        interal = value;
    }

    public int getSleepTime()
    {
        return sleepTime;
    }

    public void setSleepTime(int value)
    {
        sleepTime = value;
    }
}
