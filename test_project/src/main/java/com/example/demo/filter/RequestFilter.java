package com.example.demo.filter;

import java.util.logging.Filter;

import org.springframework.stereotype.Component;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

@Component
public class RequestFilter implements Filter{
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	throws IOException, ServletException {
		jakarta.servlet.http.HttpServletRequest req =(HttpServletRequest) request;
		System.out.println("[Filter] Request URL: "+req.getRequestURI());
		chain.doFilter(request, response);
	}

}
