package com.SoccerManager.SoccerManager.Security.Jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Clase que se utiliza para el manejo de excepciones durante la authorizacion
 */

@Component
public class JwtEntryPoint implements AuthenticationEntryPoint {
    private final static Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class); /**Se utiliza para registrar diferente tipo de informacion en base
 a  la aplicacion**/

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException)
            throws IOException, ServletException {
        logger.error("Fallo el commence");
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED);/**Indica que el cliente no tiene permiso para acceder a la aplicacion**/

    }
}
