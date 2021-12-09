package com.github.kukukaia.citiesapi.countries.repository;

import com.github.kukukaia.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
