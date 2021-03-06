package com.sjarno.springangularsecurity;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@Order(SecurityProperties.BASIC_AUTH_ORDER)
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.headers().frameOptions().sameOrigin();
        /* http.cors(); */

        http.httpBasic()
                    .and()
                    .authorizeRequests()
                    .antMatchers("/index.html", "/", "/home",
                                "/login", "/main*.js*", "/polyfills*.js",
                                "/runtime*.js", "/vendor*.js*", "/styles*.css*",
                                "/favicon.ico", "*.bundle.*").permitAll()
                    .anyRequest().authenticated()
                    .and()
                    .csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
    }

    
    
}
