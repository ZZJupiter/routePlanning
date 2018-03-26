package com.hanma56.cloud.route.filter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 张钟
 * @date 2018/3/20
 */
@Configuration
public class FiterConfig {

    /**
     * 过滤器
     * @return
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        List<String> urlPatterns = new ArrayList<String>();

        UrlFilter urlFilter = new UrlFilter();
        //new过滤器
        urlPatterns.add("*.htm");
        //指定需要过滤的url
        filterRegistrationBean.setFilter(urlFilter);
        //set
        filterRegistrationBean.setUrlPatterns(urlPatterns);
        //set
        return filterRegistrationBean;
    }
}
