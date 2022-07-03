package com.gibin.server.viewresolver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
//@ComponentScan("com.gibin.server")
public class WebConfig extends WebMvcConfigurerAdapter implements WebMvcConfigurer{
	
	/*@Bean
	public ViewResolver internalResourceViewResolver() {
	    InternalResourceViewResolver bean = new InternalResourceViewResolver();
	    bean.setViewClass(JstlView.class);
	    //bean.setPrefix("/");
	    bean.setSuffix(".html");
	    return bean;
	}*/
	
	@Bean
	public BeanNameViewResolver beanNameViewResolver(){
	    return new BeanNameViewResolver();
	}
	
	@Bean
	public View sample() {
	    return new JstlView("/static/view/index.jsp");
	}
	
/*    @Override
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    } */
	
	  @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/**")
	        .addResourceLocations("classpath:/");
	    }

	  
	  @Bean
	  public InternalResourceViewResolver jspViewResolver() {
	      InternalResourceViewResolver resolver= new InternalResourceViewResolver();
	      //resolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
	      resolver.setPrefix("/WEB-INF/");
	      resolver.setSuffix(".jsp");
	      return resolver;
	  } 
	 
}
