package com.example.lab8parte2.dao;

import com.example.lab8parte2.entity.news;
import org.springframework.stereotype.Component;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class NewDao {

    public List<news> filtrar() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<news[]> response = restTemplate.getForEntity(
                "https://api.coinstats.app/public/v1/news?skip=0&limit=50", news[].class);

        return Arrays.asList(response.getBody());
    }
}
