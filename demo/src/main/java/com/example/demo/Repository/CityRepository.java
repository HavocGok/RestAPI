package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.City;
import com.example.demo.Entity.Country;

public interface CityRepository extends JpaRepository<City,Long> {

	List<City> findAll();
}
