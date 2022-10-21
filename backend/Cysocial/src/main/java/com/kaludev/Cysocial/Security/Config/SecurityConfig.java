package com.kaludev.Cysocial.Security.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

import com.kaludev.Cysocial.appuser.AppUserService;

import lombok.AllArgsConstructor;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class SecurityConfig{

	private final AppUserService appUserService;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		http
		.csrf().disable()
			.authorizeRequests()
			.antMatchers("/css/**").permitAll()
			.antMatchers("/js/**").permitAll()
			.antMatchers("/img/**").permitAll()
			.antMatchers("/api/v*/registration/**").permitAll()
			.anyRequest().authenticated()
			.and()
			.formLogin()
			.loginPage("/login")
			.permitAll()
			.and().authenticationProvider(daoAuthenticationProvider());
		return http.build();
	}
	/*@Bean
	public  WebSecurityCustomizer webSecurityCustomizer() {
        
   }*/
	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setPasswordEncoder(bCryptPasswordEncoder);
		provider.setUserDetailsService(appUserService);
		return provider;
	}
}
