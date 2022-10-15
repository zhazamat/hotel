package com.example.hotel.service;

import com.example.hotel.model.HotelNumber;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class HotelNumberService {
    // HotelNumber hotelNumber;
    List<HotelNumber> hotelNumbers=new ArrayList<>();
    public HotelNumber save( HotelNumber hotelNumber){

       hotelNumbers.add(hotelNumber);
        return hotelNumber;
    }
    public List<HotelNumber> getHotelNumbers(){

        return hotelNumbers;
    }

    public  Double getDiscount(Integer day){
        return day>=3&&day<10?0.05:day>=10&&day<20?0.15:day>=20?0.30:0.0;
    }


    public  List<Double> getCostWithDiscount(Integer day){
        return getHotelNumbers()
                .stream()
                .map(i->i.getCost()-(i.getCost()*getDiscount(day)))
                .collect(Collectors.toList());
    }



}
