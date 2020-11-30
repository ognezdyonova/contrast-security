package com.contrastsecurity.api.constants;

public enum BaseURI {
    BASE_URL("https://ce.contrastsecurity.com/Contrast/api"),
    NG("/ng");

    private final String value;

    BaseURI(String i) {
        this.value = i;

    }

    public String get() {
        return value;
    }
}
