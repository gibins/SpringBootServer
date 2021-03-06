package com.gibin.server.security;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableConfigurationProperties
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	   @Override
	   protected void configure(HttpSecurity http) throws Exception {
	     
		   //disabling Cross-Site Request Forgery
		   http.csrf().disable();
		   //no authentication required
		   http.authorizeRequests().antMatchers("/","/home" ,"/login", "/logout","/signUp").permitAll();
		   //authenticated users
		/*   http.authorizeRequests().antMatchers("/getStudents","/adminHome","/userHome").authenticated();
		   
		   // restricting access
		   http.authorizeRequests().antMatchers("/getUsers").hasAnyAuthority("admin").and()
		   .exceptionHandling().accessDeniedHandler(accessDeniedHandler());
		   
		   //configure login form
		   http.authorizeRequests().and().formLogin().loginPage("/login")
			   .successHandler(customAuthSuccessHandler)
			   .failureUrl("/login?failed").usernameParameter("username")
			   .passwordParameter("password")
			   
			   // Config for Logout Page
		       .and().logout().logoutUrl("/logout").logoutSuccessUrl("/login?logout");*/
	   }

}
