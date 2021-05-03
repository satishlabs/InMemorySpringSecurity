package com.spd.inmemory;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class ConfigureSecurity extends WebSecurityConfigurerAdapter	{
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//set your configuration on the auth object
		
		auth.inMemoryAuthentication()
			.withUser("satish")
			.password("satish")
			.roles("USER")
			.and()
			.withUser("admin")
			.password("admin")
			.roles("ADMIN");
	}
	
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
