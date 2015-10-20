package com.itunetworkbuilders;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;


@Configuration
@ComponentScan(basePackages = "com.itunetworkbuilders")
@EnableAutoConfiguration
public class ItuNetworkBuildersApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(ItuNetworkBuildersApplication.class, args);
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
    	return application.sources(ItuNetworkBuildersApplication.class);
    }
    
    public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler)
throws Exception {
response.setHeader("Access-Control-Allow-Origin", "*");
response.setHeader("Access-Control-Allow-Methods",
        "GET, POST, PUT, DELETE, OPTIONS");
response.setHeader("Access-Control-Max-Age", "3600");
response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");

return true;
}

//@Bean
//@ConditionalOnMissingBean(HiddenFileFilter.class)
//public HiddenHttpMethodFilter hiddenHttpMethodFilter(){
//return new HiddenHttpMethodFilter();
//}
}
