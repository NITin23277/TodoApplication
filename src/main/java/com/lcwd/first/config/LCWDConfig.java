package com.lcwd.first.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "lcwd.config")
@Component
public class LCWDConfig {

    private String name;
    private String password;

    private String email ;

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmailExpTime() {
        return emailExpTime;
    }

    public void setEmailExpTime(int emailExpTime) {
        this.emailExpTime = emailExpTime;
    }

    private int emailExpTime;

    public String getName() {
        return name ;
    }

    @Override
    public String toString() {
        return "LCWDConfig{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", emailExpTime=" + emailExpTime +
                '}';
    }
}
