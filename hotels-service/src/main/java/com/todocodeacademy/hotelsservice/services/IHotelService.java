package com.todocodeacademy.hotelsservice.services;

import com.todocodeacademy.hotelsservice.entities.Hotel;

import java.util.List;

public interface IHotelService {

    public List<Hotel> getHotelsByCityId (Long city_id);

}
