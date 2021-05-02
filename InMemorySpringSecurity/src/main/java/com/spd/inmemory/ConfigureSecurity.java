package com.spd.inmemory;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class ConfigureSecurity extends WebSecurityConfigurerAdapter	{
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
	}
	
}
