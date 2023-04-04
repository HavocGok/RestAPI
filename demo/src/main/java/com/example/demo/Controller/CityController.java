package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CityService;

@RestController
@RequestMapping("/api")
public class CityController {

	@Autowired
	private CityService cityService;
	
	@GetMapping("/cities")
	public List<Map<String,String>> getAllCitiesAndCountries(){
		return cityService.getAllCitiesAndCountries();
	}
}
