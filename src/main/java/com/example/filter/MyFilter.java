package com.example.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author: Mr.Zhang
 * @Description:
 * @Date: 13:51 2019/6/11
 * @Modified By:
 */
public class MyFilter implements Filter {
    private Logger _LOG= LoggerFactory.getLogger(MyFilter.class);
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        _LOG.info("this is MyFilter,url:[{}]",request.getRequestURL());
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
}
