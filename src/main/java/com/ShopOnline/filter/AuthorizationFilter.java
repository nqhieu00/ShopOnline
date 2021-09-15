package com.ShopOnline.filter;

import com.ShopOnline.Utils.SessionUtil;
import com.ShopOnline.model.UserModel;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthorizationFilter implements Filter {

    private ServletContext context;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.context=filterConfig.getServletContext();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest) request;
        HttpServletResponse resp=(HttpServletResponse) response;
        String url=req.getRequestURI();
        UserModel userModel=(UserModel) SessionUtil.getInstance().getValue(req, "USERMODEL");
        if(url.contains("/admin")&& !url.contains("/admin/login")&&!url.contains("/admin/logout")){
            if(userModel!=null) {
                chain.doFilter(req,resp);
            }else {
                resp.sendRedirect(req.getContextPath()+"/admin/login");
            }
        }
        else if(url.contains("/admin/login")){
            if(userModel!=null){
                resp.sendRedirect(req.getContextPath()+"/admin-home");
            }
            else{
                chain.doFilter(req,resp);
            }

        }
        else if(url.contains("/admin/logout")){
            SessionUtil.getInstance().removeValue(req,"USERMODEL");
            chain.doFilter(req,resp);
        }
        else {
            chain.doFilter(req,resp);
        }
    }

    @Override
    public void destroy() {

    }
}
