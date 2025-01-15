package com.somil.project.uber.uberApp.config;


import com.somil.project.uber.uberApp.DTO.PointDTO;
import com.somil.project.uber.uberApp.util.GeometryUtil;
import org.locationtech.jts.geom.Point;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper mapper = new ModelMapper();

        mapper.typeMap(PointDTO.class, Point.class).setConverter(
                mappingContext -> {
                    PointDTO pointDTO = mappingContext.getSource();
                    Point point = GeometryUtil.createPoint(pointDTO);
                    point.setSRID(pointDTO.getSrid()); // Explicitly set SRID
                    return point;
                }
        );

        // Point -> PointDTO
        mapper.typeMap(Point.class, PointDTO.class).setConverter(
                mappingContext -> {
                    Point point = mappingContext.getSource();
                    return new PointDTO(
                            new double[]{point.getX(), point.getY()},
                            "Point",
                            point.getSRID()
                    );
                }
        );



        return mapper;
    }
}
