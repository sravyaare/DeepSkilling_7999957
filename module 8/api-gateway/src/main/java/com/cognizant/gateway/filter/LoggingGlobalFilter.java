package com.cognizant.gateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.time.Instant;

/**
 * Global logging filter that logs Request Method, URI, Timestamp, and Response
 * Status.
 */
@Component
public class LoggingGlobalFilter implements GlobalFilter, Ordered {

    private static final Logger logger = LoggerFactory.getLogger(LoggingGlobalFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        String method = request.getMethod().name();
        String uri = request.getURI().toString();
        Instant requestTime = Instant.now();

        logger.info("[Gateway Logger] Incoming Request - Method: {}, URI: {}, Timestamp: {}",
                method, uri, requestTime);

        return chain.filter(exchange).then(Mono.fromRunnable(() -> {
            ServerHttpResponse response = exchange.getResponse();
            Integer statusCode = response.getStatusCode() != null ? response.getStatusCode().value() : null;
            Instant responseTime = Instant.now();
            logger.info("[Gateway Logger] Outgoing Response - Method: {}, URI: {}, Status: {}, Timestamp: {}",
                    method, uri, statusCode, responseTime);
        }));
    }

    @Override
    public int getOrder() {
        // High priority filter (logs incoming request first and outgoing response last)
        return Ordered.LOWEST_PRECEDENCE;
    }
}
