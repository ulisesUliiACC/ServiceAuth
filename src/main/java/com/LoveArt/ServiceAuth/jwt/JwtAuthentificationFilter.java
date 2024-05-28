package com.LoveArt.ServiceAuth.jwt;

import jakarta.servlet.FilterChain;
import org.springframework.http.HttpHeaders;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;



@Component
public class JwtAuthentificationFilter extends OncePerRequestFilter {


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        final String token = getTokenFromRequest(request);
        if (token == null) {
            filterChain.doFilter(request,response);
            return ;
        }
        filterChain.doFilter(request,response);

    }

    private String getTokenFromRequest(HttpServletRequest request) {
        final String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
        if(StringUtils.hasText(authHeader) && authHeader.startsWith("bearer"))
        {
            return  authHeader.substring(7);
        }
        return null;
    }
}
