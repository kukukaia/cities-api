package com.github.kukukaia.citiesapi.states;

import com.github.kukukaia.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}