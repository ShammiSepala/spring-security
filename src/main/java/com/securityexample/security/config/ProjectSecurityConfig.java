package com.securityexample.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/api/v1/account/my-account")
                .authenticated()
                .antMatchers("/api/v/loan/my-loan").authenticated()
                .antMatchers("/api/v1/notice/my-notice").permitAll()
                .and()
                .formLogin()
                .and()
                .httpBasic();
        return http.build();
    }
}
