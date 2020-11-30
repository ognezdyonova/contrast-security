package com.contrastsecurity.api.constants;

import java.util.HashMap;
import java.util.Map;

public class Auth {
    public static Map<String, String> getCreds(){
        Map<String, String> auth = new HashMap<>();
        auth.put("API-Key", "bX47666VFgegeYZl8Jyj0ujmFguesCHv");
        auth.put("Authorization", "b2duZXpkeW9ub3ZhQGhlYWx0aHJlY292ZXJ5c29sdXRpb25zLmNvbTpWOEhWUVVHOTBRWDVEMUtK");
        return auth;
    }
}
