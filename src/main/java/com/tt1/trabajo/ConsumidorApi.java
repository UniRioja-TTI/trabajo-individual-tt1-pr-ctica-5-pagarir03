package com.tt1.trabajo;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ConsumidorApi {

    private final RestTemplate restTemplate = new RestTemplate();
    
    private final String URL_BASE = "http://localhost:9090/Resultados";

    public String obtenerDatosGrid(String token) {
        try {
            String finalUrl = "http://localhost:9090/Resultados?usuario=paula&tok=" + token;
            
            return restTemplate.postForObject(finalUrl, null, String.class);
            
        } catch (Exception e) {
            return "Error al conectar con la MV: " + e.getMessage();
        }
    }
}