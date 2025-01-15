package com.somil.project.uber.uberApp.service.impl;

import com.somil.project.uber.uberApp.service.DistanceService;
import lombok.Data;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service

public class DistanceServiceImpl implements DistanceService {
   private final String OSRM_API_BASE_URL ="https://router.project-osrm.org/route/v1/driving/";
    @Override
    public double calculateDistance(Point src, Point dest) {
        System.out.println(src);
        try {
            String uri = src.getX() +","+src.getY() +";"+dest.getX() +","+dest.getY();
            OSRMResponseDTO osrmResponseDTO =   RestClient.builder()
                    .baseUrl(OSRM_API_BASE_URL)
                    .build()
                    .get()
                    .uri(uri)
                    .retrieve()
                    .body(OSRMResponseDTO.class);
            return osrmResponseDTO.getRoutes().get(0).getDistance()/1000.0;
        }catch (Exception exception){
            throw  new RuntimeException("Error getting data from OSRM " + exception.getMessage());
        }

//        return 0;
    }
}

@Data
class  OSRMResponseDTO{
private List<OSRMRoute> routes;
}
@Data
class  OSRMRoute{
    private  double distance;
}