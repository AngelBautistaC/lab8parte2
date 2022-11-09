package com.example.lab8parte2.dao;


import com.example.lab8parte2.entity.coins;
import org.springframework.stereotype.Component;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class CoinsDao {

    public List<coins> listarCategorias() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<coins[]> response = restTemplate.getForEntity(
                "https://api.coinstats.app/public/v1/coins?skip=0&limit=10", coins[].class);

        return Arrays.asList(response.getBody());
    }

}
