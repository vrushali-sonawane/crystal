package com.bikkadit.MakeMyTrip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadit.MakeMyTrip.entity.Passanger;

@Repository
public interface PassangerRepository extends JpaRepository<Passanger, Integer>{

}
