package com.cognizant.gateway.security;

import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;

/**
 * Utility class for local JWT creation and validation using Nimbus JOSE
 * library.
 */
@Component
public class JwtUtil {

    // Must be at least 256 bits long for HS256 algorithm
    private static final String SECRET_STRING = "cognizant-microservices-coursework-very-long-secret-key-32bytes-long";
    private static final long EXPIRATION_MS = 3600000; // 1 hour

    /**
     * Generates a signed JWT token.
     *
     * @param username The subject username
     * @param role     User role claim
     * @return Serialized signed JWT token
     * @throws JOSEException If signing fails
     */
    public String generateToken(String username, String role) throws JOSEException {
        JWTClaimsSet claimsSet = new JWTClaimsSet.Builder()
                .subject(username)
                .claim("role", role)
                .issueTime(new Date())
                .expirationTime(new Date(System.currentTimeMillis() + EXPIRATION_MS))
                .build();

        SignedJWT signedJWT = new SignedJWT(new JWSHeader(JWSAlgorithm.HS256), claimsSet);
        JWSSigner signer = new MACSigner(SECRET_STRING.getBytes());
        signedJWT.sign(signer);

        return signedJWT.serialize();
    }

    /**
     * Validates if the given token is authentic and not expired.
     *
     * @param token The serialized JWT token
     * @return True if valid, false otherwise
     */
    public boolean validateToken(String token) {
        try {
            SignedJWT signedJWT = SignedJWT.parse(token);
            JWSVerifier verifier = new MACVerifier(SECRET_STRING.getBytes());
            boolean isSignatureValid = signedJWT.verify(verifier);
            boolean isExpired = signedJWT.getJWTClaimsSet().getExpirationTime().before(new Date());
            return isSignatureValid && !isExpired;
        } catch (ParseException | JOSEException e) {
            return false;
        }
    }

    /**
     * Extracts username (subject) from the token.
     *
     * @param token The serialized JWT token
     * @return Username subject
     * @throws ParseException If parsing claims fails
     */
    public String getUsername(String token) throws ParseException {
        SignedJWT signedJWT = SignedJWT.parse(token);
        return signedJWT.getJWTClaimsSet().getSubject();
    }

    /**
     * Gets the secret key.
     *
     * @return Secret key bytes
     */
    public byte[] getSecretBytes() {
        return SECRET_STRING.getBytes();
    }
}
