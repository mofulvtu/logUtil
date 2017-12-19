package com.liuzg.study.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Desc: 存储共性值
 * @author  liuzg
 * @date  2017/10/23
 */
@WebFilter(filterName="myfilter",urlPatterns="/*")
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("==================过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, javax.servlet.FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        System.out.println("This is MyFilter, url :"+request.getRequestURI());
        /**
         * 线程对象存入共性信息
         */
        VariableContainer.getThreadInstance().setAge(111);
        HttpSession session = request.getSession();
        String name = null;
        if (session.isNew()){

        }else {
            Object obj = session.getAttribute("userName");
             if (obj!=null){
                 name = session.getAttribute("userName").toString();
             }
        }
        VariableContainer.getThreadInstance().setName(name);
        filterChain.doFilter(servletRequest, servletResponse);
    }


    @Override
    public void destroy() {
        System.out.println("=============过滤器销毁");
    }



}
