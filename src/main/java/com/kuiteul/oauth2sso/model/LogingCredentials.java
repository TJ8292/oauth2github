package com.kuiteul.oauth2sso.model;

public class LogingCredentials {

    private String clientId;
    private String password;


    public LogingCredentials(String clientId, String password) {
        this.clientId = clientId;
        this.password = password;
    }

    public String getClientId() {
        return clientId;
    }

    public String getPassword() {
        return password;
    }
}
