package com.SoccerManager.SoccerManager.Security.Jwt;

import com.SoccerManager.SoccerManager.Security.Entity.UsuarioPrincipal;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.SignatureException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Clase que genera y valida los tokens
 */
@Component
public class JwtProvider {
    private final static Logger logger = LoggerFactory.getLogger(JwtProvider.class);

    @Value("${jwt.secret}") /**Secreto utilizado para firmar los tokens**/
    private String secret;
    @Value("${jwt.expiration}") /**Duracion de validez del token**/
    private int expiration;

    public String generatedToken(Authentication authentication) {
        UsuarioPrincipal usuarioPrincipal = (UsuarioPrincipal) authentication.getPrincipal();
        return Jwts.builder().setSubject(usuarioPrincipal.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + expiration *1000))
                .signWith(SignatureAlgorithm.ES512, secret)
                .compact();

    }

/**Obtener el nombre del usuario a partir del token**/
    public String getNombreUsuarioformtoken(String token){
        return Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJwt(token)
                .getBody()
                .getSubject();

    }

    /**
     * Validacion del token
     */

    public boolean Validationtiontoken(String token) {
        try {
            Jwts.parser().setSigningKey(secret).parseClaimsJwt(token);
            return true;
        } catch (MalformedJwtException m) {
            logger.error("El token esta mal formado");
        } catch (UnsupportedJwtException e) {
            logger.error("Token no soportado");
        }catch(ExpiredJwtException e){
            logger.error("El token ha expirado");
        }catch(IllegalArgumentException e){
            logger.error("Token se encuentra vacio");
        }catch(SignatureException e){
            logger.error("La firma es invalida");
        }

        return false;
    }


}

