package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		/*
		 * http.csrf().disable().authorizeRequests().antMatchers("/api/getAllInfo/**").
		 * hasAnyRole("admin","user").and() .formLogin();     
		 * http.csrf().disable().authorizeRequests().antMatchers("/api/getUserInfo/**").
		 * hasAnyRole("admin").and() .formLogin();
		 */
		//Refactore the code below 
		
		http.csrf().disable().authorizeRequests().antMatchers("/api/getAllInfo/**").hasAnyRole("admin", "user").and()
				.authorizeRequests().antMatchers("/api/getUserInfo/**").hasAnyRole("admin").and().formLogin();

	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		/*
		 * auth.inMemoryAuthentication().withUser("Rahul").password("{noop}pass@123").
		 * roles("user");
		 * auth.inMemoryAuthentication().withUser("Rohan").password("{noop}pass@123").
		 * roles("user", "admin");
		 */
		
		//Refactore the code below 
		auth.inMemoryAuthentication().withUser("Rahul").password("{noop}pass@123").roles("user").and().withUser("Rohan")
				.password("{noop}pass@123").roles("user", "admin");
	}

}