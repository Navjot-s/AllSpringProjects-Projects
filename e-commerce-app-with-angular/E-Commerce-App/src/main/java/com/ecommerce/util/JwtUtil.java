package com.ecommerce.util;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtUtil {
	
	public static final String SECRET_KEY = "my_project";
	
	public String getUserPasswordFromToken(String token) {
		return getClaimForToken(token, Claims::getSubject);
	}
	
	public <T> T getClaimForToken(String token, Function<Claims, T> claimResolver) {
		final Claims claims = getAllClaimsFromToken(token);
		return claimResolver.apply(claims);
	}
	
	public Claims getAllClaimsFromToken(String token) {
		return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
	}
	
}
