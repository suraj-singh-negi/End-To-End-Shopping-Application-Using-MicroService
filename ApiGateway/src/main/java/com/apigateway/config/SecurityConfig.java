package com.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.web.reactive.config.EnableWebFlux;

//This is local repo
@Configuration
@EnableWebFlux
public class SecurityConfig {

	@Bean
	public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity serverHttpSecurity) {
		serverHttpSecurity.csrf()
			.disable()
			.authorizeExchange(exchange -> exchange.pathMatchers("/eureka/**")
					.permitAll()
					.anyExchange()
					.authenticated())
			.oauth2ResourceServer(ServerHttpSecurity.OAuth2ResourceServerSpec::jwt);
		return serverHttpSecurity.build();
			
	}
	
}
//This is local repo