package com.smarttourism.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Destination {
    private Long id;
    private String name;
    private String region;
    private String description;
    private String imageUrl;
    private double price;
    private String meteo;
    private String duree;
    private List<String> activities;
}
