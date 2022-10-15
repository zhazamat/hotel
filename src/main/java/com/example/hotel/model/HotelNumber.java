package com.example.hotel.model;

import lombok.*;

@Getter
@Setter


@RequiredArgsConstructor
public class HotelNumber {
   private Integer id;
    private Integer HotelNumber;
    private  Type type;
    public enum Type{
        STANDARD,
        COMFORT,
        LUX,
        PRESIDENT
    }
    public Double getCost(){
        return getType() .equals(Type.COMFORT)? 270. :
                getType().equals(Type.STANDARD )? 150.:
                        getType().equals(Type.LUX)?550.:1300.;
    }
    private Valuta valuta;
    public enum Valuta{
        DOLLAR,
        EURO
    }
   private Integer floor;



}
