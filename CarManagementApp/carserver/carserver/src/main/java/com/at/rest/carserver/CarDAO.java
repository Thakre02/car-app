package com.at.rest.carserver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.at.rest.carserver.carmodel.Car;

@Repository
public interface CarDAO extends JpaRepository<Car,Integer> {

}
