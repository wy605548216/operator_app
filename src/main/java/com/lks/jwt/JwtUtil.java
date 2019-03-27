package com.lks.jwt;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtil {

    static final String SECRET = "xp47oR72PF!aG$#K@SKGF2hF!ThTfm@KrFHmbkUEBnSKFJ8uexv7xp^JRs2RgAOVT%7UfvIdzLQ1NZkZDSo$satr&N";

    public static String generateToken(Map<String, Object> map) {
        //you can put any data in the map
        String jwt = Jwts.builder()
                .setClaims(map)
                .setExpiration(new Date(System.currentTimeMillis() + 3600_000_000L))// 1000 hour
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
        return "Bearer "+jwt; //jwt前面一般都会加Bearer
    }

    public static Map<String, Object> validateToken(String token) {
        try {
            // parse the token.
            Map<String, Object> body = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token.replace("Bearer ",""))
                    .getBody().setExpiration(new Date(System.currentTimeMillis() + 3600_000_000L));
            return body;
        }catch (Exception e){
            throw new IllegalStateException("Invalid Token. "+e.getMessage());
        }
    }
}
