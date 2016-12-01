package com.mms.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuditFilter implements Filter {

	String displayDate = null;

	public void init(FilterConfig filterConfig) throws ServletException {
		displayDate = filterConfig.getInitParameter("displayDate");

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		if (null != displayDate) {
			System.out.println("value of displayDate is " + displayDate);
			System.out.println("today's date and time is :" + new Date().toString());
			request.setAttribute("Audited", "true");
		} else {
			System.out.println("input param value is null from filter defination");
		}
		
		chain.doFilter(request, response);

	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

}
