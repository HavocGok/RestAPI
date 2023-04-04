package com.example.demo.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   
    @Column(name = "name", unique = true)
    //@Size(min = 3, max = 150)
    private String name;

    private Set<City> cities = new HashSet<>();
    // Getters and Setters

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(Long id, String name, Set<City> cities) {
		super();
		this.id = id;
		this.name = name;
		this.cities = cities;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<City> getCities() {
		return cities;
	}
	public void setCities(Set<City> cities) {
		this.cities = cities;
	}
  
    
}
