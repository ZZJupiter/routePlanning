package com.hanma56.cloud.route.filter;

import java.io.IOException;
import java.net.URL;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

/**
 * @author 张钟
 * @date 2018/3/20
 */
public class UrlFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        // 接收到请求，记录请求内容
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;

        String urlString = httpServletRequest.getRequestURL().toString();
        URL url = new URL(urlString);
        String path = url.getPath();
        httpServletRequest.getSession().setAttribute("path", path);

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
