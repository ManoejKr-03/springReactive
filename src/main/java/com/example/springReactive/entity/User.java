package com.example.springReactive.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user_details")
public class User {
    
    @Id
    String userid;
    String userName;
    String email;

    public String getUserif() {
        return userid;
    }
    public void setUserif(String userif) {
        this.userid = userif;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
}
