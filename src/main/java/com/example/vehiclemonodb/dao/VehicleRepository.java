package com.example.vehiclemonodb.dao;

import com.example.vehiclemonodb.entity.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends MongoRepository<Vehicle,Integer>
{

}
