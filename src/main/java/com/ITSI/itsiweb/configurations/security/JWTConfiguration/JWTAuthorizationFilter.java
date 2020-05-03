package com.ITSI.itsiweb.configurations.security.JWTConfiguration;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ITSI.itsiweb.utils.TokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import static com.ITSI.itsiweb.configurations.security.GlobalSecurityConstant.*;

public class JWTAuthorizationFilter extends OncePerRequestFilter {

    @Autowired
    private UserDetailsService userDetailsService;

    public JWTAuthorizationFilter(){}

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                    FilterChain filterChain) throws ServletException, IOException {
        String authorizationHeader = httpServletRequest.getHeader(HEADER_AUTHORIZATION_KEY);

        if (StringUtils.isEmpty(authorizationHeader) || !authorizationHeader
                .startsWith(TOKEN_BEARER_PREFIX)) {
            filterChain.doFilter(httpServletRequest, httpServletResponse);
            return;
        }
        final String token = authorizationHeader.replace(TOKEN_BEARER_PREFIX + " ", "");

        String userName = TokenProvider.getUserName(token);
        UserDetails user = userDetailsService.loadUserByUsername(userName);

        UsernamePasswordAuthenticationToken authenticationToken = TokenProvider.getAuthentication(token, user);
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
