package com.nt.interceptor;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class TimeCheckHandlerinterceptor implements HandlerInterceptor{
@Override
public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
	
	LocalDateTime time= LocalDateTime.now();
	int hour=time.getHour();
	if(hour>9 && hour<24)
	return true;
	else {
		if(request.getServletPath().equalsIgnoreCase("/"))
			return true;
		request.getRequestDispatcher("/time_checker.jsp").forward(request, response);;
	return false;
	}
	}
}
