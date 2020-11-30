package com.contrastsecurity.api.constants;

public enum Endpoints {
    PROFILE("/profile"),
    ORGANIZATIONS("/organizations"),
    APPLICATIONS("/applications"),
    ID("{id}"), 
    APP_ID("/{app_id}"), SCORE("/scores"),
    LIBRARIES("/libraries"),
    BREACKPOINTS("/breakdown"),
    TRACE("/trace");

    private final String value;

    Endpoints(String i) {
        this.value = i;

    }

    public String get() {
        return value;
    }
}
