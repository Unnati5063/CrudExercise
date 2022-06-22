package com.cognixia.jump.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.model.Renting;

@Repository
public interface RentingRepository extends JpaRepository<Renting, Integer> {

}