package com.melardev.cloud.zuulfilters;

import com.melardev.cloud.zuulfilters.filters.ErrorFilter;
import com.melardev.cloud.zuulfilters.filters.PostFilter;
import com.melardev.cloud.zuulfilters.filters.PreFilter;
import com.melardev.cloud.zuulfilters.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulFiltersApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulFiltersApplication.class, args);
    }

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }

    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
}
