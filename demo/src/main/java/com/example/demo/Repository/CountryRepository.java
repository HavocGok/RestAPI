package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long>{

	List<Country> findAll();
}
