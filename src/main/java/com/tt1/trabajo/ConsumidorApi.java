package com.tt1.trabajo;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
@Component
public class ConsumidorApi {

    private final RestTemplate restTemplate = new RestTemplate();
    
    private final String URL_BASE = "http://localhost:9090/Resultados";

   

    public String obtenerDatosGrid(String token) {
        try {
            String url = "http://localhost:9090/Resultados";

            MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
            map.add("usuario", "paula");
            map.add("tok", token);

            return restTemplate.postForObject(url, map, String.class);

        } catch (Exception e) {
            return "Error al conectar con la MV: " + e.getMessage();
        }
    }
}