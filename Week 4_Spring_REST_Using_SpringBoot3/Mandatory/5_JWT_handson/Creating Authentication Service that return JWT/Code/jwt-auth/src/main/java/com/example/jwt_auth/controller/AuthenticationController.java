package com.example.jwt_auth.controller;

import com.example.jwt_auth.util.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

@RestController
public class AuthenticationController {

	@GetMapping("/authenticate")
	public ResponseEntity<?> authenticate(HttpServletRequest request) {
	    System.out.println("Authenticate endpoint called");

	    String authHeader = request.getHeader("Authorization");

	    if (authHeader == null || !authHeader.startsWith("Basic ")) {
	        System.out.println("Invalid or missing Authorization header");
	        return ResponseEntity.status(401).body("Missing or invalid Authorization header");
	    }

	    String base64Credentials = authHeader.substring("Basic ".length());
	    byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
	    String credentials = new String(credDecoded);
	    String[] values = credentials.split(":", 2);

	    String username = values[0];
	    String password = values[1];

	    System.out.println("Username: " + username + ", Password: " + password);

	    if ("user".equals(username) && "pwd".equals(password)) {
	        String token = JwtUtil.generateToken(username);
	        return ResponseEntity.ok().body("{\"token\":\"" + token + "\"}");
	    } else {
	        return ResponseEntity.status(401).body("Invalid credentials");
	    }
	}

}
