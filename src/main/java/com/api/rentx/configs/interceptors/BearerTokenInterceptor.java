package com.api.rentx.configs.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class BearerTokenInterceptor implements HandlerInterceptor {

  @Override
  public boolean preHandle(HttpServletRequest request,
      HttpServletResponse response, Object handler) throws Exception {
    final String authorizationHeaderValue = request.getHeader("Authorization");
    if (authorizationHeaderValue != null && authorizationHeaderValue.startsWith("Bearer")) {
      String token = authorizationHeaderValue.substring(7, authorizationHeaderValue.length());
      System.out.println(token);
    }

    return true;
  }
}