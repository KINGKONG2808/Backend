package com.dev.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/** day la file cau hinh mvc cho project*/

@Configuration /** bao hieu cho spring boot biet day la file cau hinh*/
@EnableWebMvc /** file cau hinh nay dung cho web mvc*/
@ComponentScan(basePackages = {"com.dev"}) /** chi cho spring mvc biet noi chua cac controller*/
public class WebMVC implements WebMvcConfigurer {
	/** chi cho spring mvc biet noi chua cac views da tao ow phan front-end*/
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		bean.setViewClass(JstlView.class);
		bean.setPrefix("/WEB-INF/views/");
		bean.setSuffix(".jsp");
		return bean;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/css/**").addResourceLocations("classpath:/META-INF/css/");
		registry.addResourceHandler("/js/**").addResourceLocations("classpath:/META-INF/js/");
		registry.addResourceHandler("/img/**").addResourceLocations("classpath:/META-INF/img/");
		registry.addResourceHandler("/glyphicons/**").addResourceLocations("classpath:/META-INF/glyphicons/");
	}
}
