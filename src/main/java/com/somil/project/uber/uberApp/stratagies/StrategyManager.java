package com.somil.project.uber.uberApp.stratagies;


import com.somil.project.uber.uberApp.stratagies.impl.DriverMatchingHighestRatingDriverImpl;
import com.somil.project.uber.uberApp.stratagies.impl.DriverMatchingNearestDriverImpl;
import com.somil.project.uber.uberApp.stratagies.impl.RideFareCalculationImpl;
import com.somil.project.uber.uberApp.stratagies.impl.RideFareSurgePricingFareCalculationImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@RequiredArgsConstructor
public class StrategyManager {

    private  final DriverMatchingHighestRatingDriverImpl driverMatchingHighestRatingDriver;
    private  final DriverMatchingNearestDriverImpl driverMatchingNearestDriver;
    private  final RideFareCalculationImpl rideFareCalculation;
    private  final RideFareSurgePricingFareCalculationImpl rideFareSurgePricingFareCalculation;

    public DriverMactingStratagy driverMactingStratagy(double riderRating){

   if(riderRating>=4.8){
   return  driverMatchingHighestRatingDriver;
   }else{
   return driverMatchingNearestDriver;
    }
    };

    public RideFareCalculationStratagy rideFareCalculationStratagy(){
        LocalTime surgeStartTime = LocalTime.of(18, 0);
        LocalTime surgeEndTime = LocalTime.of(21, 0);
        LocalTime currentTime = LocalTime.now();

        boolean isSurgeTime = currentTime.isAfter(surgeStartTime) && currentTime.isBefore(surgeEndTime);

        if(isSurgeTime) {
            return rideFareSurgePricingFareCalculation;
        } else {
            return rideFareCalculation;
        }
    };
}
