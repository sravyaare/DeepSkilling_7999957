package com.cognizant.gateway.config;

import com.cognizant.gateway.security.JwtWebFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.SecurityWebFiltersOrder;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

/**
 * Spring Security 6 configuration class for reactive gateway application.
 */
@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    private final JwtWebFilter jwtWebFilter;

    public SecurityConfig(JwtWebFilter jwtWebFilter) {
        this.jwtWebFilter = jwtWebFilter;
    }

    /**
     * Configures the security filter chain for WebFlux (API Gateway).
     *
     * @param http Spring Security builder
     * @return SecurityWebFilterChain instance
     */
    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        return http
                .csrf(ServerHttpSecurity.CsrfSpec::disable)
                .authorizeExchange(exchanges -> exchanges
                        // Public endpoints
                        .pathMatchers("/greet-service/greet").permitAll()
                        .pathMatchers("/auth/**").permitAll()
                        // Protected endpoints (requires authentication via JWT token)
                        .pathMatchers("/account-service/**").authenticated()
                        .pathMatchers("/loan-service/**").authenticated()
                        // Any other matching requests
                        .anyExchange().authenticated())
                // Inject custom JWT Web Filter before standard authorization check
                .addFilterAt(jwtWebFilter, SecurityWebFiltersOrder.AUTHENTICATION)
                .build();
    }
}
