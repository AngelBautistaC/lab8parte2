package com.example.lab8parte2.entity;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class coins implements Serializable {
    private String id;
    private String symbol;
    private String price;
    private String volume;

}
