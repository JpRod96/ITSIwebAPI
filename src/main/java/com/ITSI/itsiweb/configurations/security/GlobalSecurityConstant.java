package com.ITSI.itsiweb.configurations.security;

public class GlobalSecurityConstant {

    private static final int EXPIRATION_DAYS =1;
    private static final int MILLISECONDS_A_DAY = 86400000;

    // Spring Security

    public static final String HEADER_AUTHORIZATION_KEY = "Authorization";
    public static final String TOKEN_BEARER_PREFIX = "Bearer ";

    // JWT

    public static final String ISSUER_INFO = "https://www.itsisrl.com/";
    public static final String SECRET_KEY = "1234";
    public static final long TOKEN_EXPIRATION_TIME = EXPIRATION_DAYS * MILLISECONDS_A_DAY;
    public static final String AUTHORITIES_KEY = "CLAIM_TOKEN";
}
