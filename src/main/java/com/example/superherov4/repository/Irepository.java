package com.example.superherov4.repository;

import com.example.superherov4.DTO.CityDTO;
import com.example.superherov4.DTO.CountPowerDTO;
import com.example.superherov4.DTO.HeroPowerDTO;
import com.example.superherov4.model.Superhero;

import java.util.List;

public interface Irepository {
    public List<Superhero> getSuperheroes();
    public HeroPowerDTO heroPower(String name);
    public CityDTO heroCity(String name);
    public CountPowerDTO heroPowerCount(String name);

}
