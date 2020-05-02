package com.ITSI.itsiweb.configurations.security;

public class GlobalSecurityConstant {

    private static int NUMBER_OF_EXPIRATION_DAYS=1;
    private static int MILISECONDS_AT_DAY = 86400000;

    // Spring Security

    public static final String LOGIN_URL = "/login";
    public static final String HEADER_AUTHORIZATION_KEY = "Authorization";
    public static final String TOKEN_BEARER_PREFIX = "Bearer ";

    // JWT

    public static final String ISSUER_INFO = "https://www.autentia.com/";
    public static final String SECRET_KEY = "1234";
    public static final long TOKEN_EXPIRATION_TIME = NUMBER_OF_EXPIRATION_DAYS * MILISECONDS_AT_DAY;
}
