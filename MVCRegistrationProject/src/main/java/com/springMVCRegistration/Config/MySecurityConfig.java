package com.springMVCRegistration.Config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.authorization.AuthenticatedAuthorizationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

import com.springMVCRegistration.filters.MySecurutyFilters;

@Configuration
@EnableWebSecurity(debug = true)
public class MySecurityConfig  {

	@Autowired
	HttpSecurity httpSecurity;
//	
//	@Autowired
//	MySecurutyFilters filters;
	
	
//	@Bean
//	public InMemoryUserDetailsManager setUpUsers() {
//		UserDetails user1 = User.withUsername("Mahesh").password("1234").roles("admin", "user").build();
//		return new InMemoryUserDetailsManager(user1);
//	}
	
	

	@Bean
	PasswordEncoder passwordEncoder() {

		return NoOpPasswordEncoder.getInstance();
	}
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//
//		return new BCryptPasswordEncoder();
//	}

	@Bean
	SecurityFilterChain settingUpHttpSecurity() throws Exception {

	      httpSecurity.authorizeHttpRequests(customizer -> {
	            customizer.requestMatchers("/helloworld", "/hello").authenticated()
	                      .requestMatchers("/register").permitAll()
	                      .anyRequest().authenticated();
	        });
		httpSecurity.formLogin(Customizer.withDefaults());
//		httpSecurity.httpBasic(Customizer.withDefaults());
//		httpSecurity.csrf().disable();
//		httpSecurity.addFilterBefore(filters,UsernamePasswordAuthenticationFilter.class);
		return httpSecurity.build();
	}

	@Bean(name = "mvcHandlerMappingIntrospector")
	public HandlerMappingIntrospector mvcHandlerMappingIntrospector() {
		return new HandlerMappingIntrospector();
	}
	
	@Bean
	 public DataSource dataSource () {
		 DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource() ;
		 
		 driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/MVCRegistration");
		 driverManagerDataSource.setUsername("root");
		 driverManagerDataSource.setPassword("root");
		 driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		 
		 return driverManagerDataSource;
	 }
	
	
	@Bean
	public JdbcUserDetailsManager jdbcUserDetailsManager() {
		return new JdbcUserDetailsManager(dataSource());
	}
	
}
