package com.example.demo.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.City;
import com.example.demo.Repository.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository cityRepository;
	
	public List<Map<String, String>> getAllCitiesAndCountries(){
		List<City> cities = cityRepository.findAll();
		List<Map<String,String>> res = new ArrayList<>();
		for(City city : cities) {
			Map<String,String> city1 = new HashMap<>();
			city1.put("City", city.getName());
			city1.put("Country",city.getCountry());
			res.add(city1);
		}
		return res;
	}
	
}
