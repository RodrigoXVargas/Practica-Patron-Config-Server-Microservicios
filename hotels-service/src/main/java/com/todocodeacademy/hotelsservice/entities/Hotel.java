package com.todocodeacademy.hotelsservice.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {

    private Long id;
    private String name;
    private int stars;
    private Long city_id;
}
