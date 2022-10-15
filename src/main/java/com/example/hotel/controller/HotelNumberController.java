package com.example.hotel.controller;

import com.example.hotel.model.HotelNumber;
import com.example.hotel.service.HotelNumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hotelNumber")
@RequiredArgsConstructor
public class HotelNumberController {

    private final HotelNumberService hotelNumberService;
    @PostMapping("/add")
    public HotelNumber save(@RequestBody HotelNumber hotel){
        return hotelNumberService.save(hotel);
    }

    @GetMapping("/all_hotel_numbers")
    public List<HotelNumber> getAllNumbers(){
        return hotelNumberService.getHotelNumbers();
    }
    @GetMapping("/discount")
    public Double getDiscount(@RequestParam Integer day){
        return hotelNumberService.getDiscount(day);
    }

    @GetMapping("/cost_with_discount")
    public List<Double> getCostWithDiscount(@RequestParam Integer day){
       return hotelNumberService.getCostWithDiscount(day);
    }


}
