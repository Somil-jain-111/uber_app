package com.somil.project.uber.uberApp.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PointDTO {
    private double[] coordinates; // Longitude, Latitude
    private String type = "Point"; // Default GeoJSON type
    private int srid = 4326; // Explicit SRID for clarity
}