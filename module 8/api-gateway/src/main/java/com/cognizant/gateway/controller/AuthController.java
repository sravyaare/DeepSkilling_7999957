package com.cognizant.gateway.controller;

import com.cognizant.gateway.security.JwtUtil;
import com.nimbusds.jose.JOSEException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * Controller to handle token generation for testing microservices security.
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    /**
     * Endpoint to simulate login and receive a JWT token.
     * Accessible publicly under /auth/login.
     *
     * @param credentials Map representing username and password
     * @return Mono enclosing response map containing the JWT token
     */
    @PostMapping("/login")
    public Mono<ResponseEntity<Map<String, String>>> login(@RequestBody Map<String, String> credentials) {
        String username = credentials.get("username");
        String password = credentials.get("password");

        // Basic verification logic for demo
        if ("admin".equals(username) && "password".equals(password)) {
            try {
                String token = jwtUtil.generateToken(username, "ROLE_USER");
                Map<String, String> response = new HashMap<>();
                response.put("token", token);
                response.put("token_type", "Bearer");
                return Mono.just(ResponseEntity.ok(response));
            } catch (JOSEException e) {
                Map<String, String> errResponse = new HashMap<>();
                errResponse.put("error", "Failed to generate token");
                return Mono.just(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errResponse));
            }
        } else {
            Map<String, String> errResponse = new HashMap<>();
            errResponse.put("error", "Invalid credentials");
            return Mono.just(ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errResponse));
        }
    }
}
