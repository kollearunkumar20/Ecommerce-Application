package com.springproject.ecommerceApplication;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.function.Function;
import java.util.*;


@Service
public class JwtService {

    private final Key signingKey;
    private final long expirationTime;

public JwtService(@Value("${jwt.secret}") String secretKey, 
                  @Value("${jwt.expiration}") long expirationTime) {

    byte[] keyBytes = Decoders.BASE64.decode(secretKey);
    
    System.out.println("Decoded Secret Key (Bytes): " + Arrays.toString(keyBytes)); 
    System.out.println("Decoded Secret Key (String): " + Base64.getEncoder().encodeToString(keyBytes)); 
    
    this.signingKey = Keys.hmacShaKeyFor(keyBytes);

    System.out.println("Signing Key: " + this.signingKey.getAlgorithm()); 
    System.out.println("Expiration Time: " + expirationTime);
    System.out.println("Decoded Secret Key: " + Base64.getEncoder().encodeToString(signingKey.getEncoded()));
    this.expirationTime = expirationTime;
}


    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
                .signWith(signingKey, SignatureAlgorithm.HS256)
                .compact();
    }

    public String extractUserName(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    public boolean validateToken(String token, UserDetails userDetails) {
        return extractUserName(token).equals(userDetails.getUsername()) && !isTokenExpired(token);
    }

    private boolean isTokenExpired(String token) {
        return extractClaim(token, Claims::getExpiration).before(new Date());
    }

    private <T> T extractClaim(String token, Function<Claims, T> claimResolver) {
        return claimResolver.apply(extractAllClaims(token));
    }

    private Claims extractAllClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(signingKey)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }
}
