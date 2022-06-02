package com.filter;

import com.unit.Constant;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 黄建胜
 */
@WebFilter(urlPatterns = "/admin/*")
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        if (req.getSession().getAttribute(Constant.USER)==null){
            resp.sendRedirect("/CampusForum/page/login.html");
            return;
        }
        filterChain.doFilter(req,resp);
    }
}
