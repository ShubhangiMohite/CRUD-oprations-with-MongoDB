package com.example.vehiclemonodb.service;

import com.example.vehiclemonodb.dao.VehicleRepository;
import com.example.vehiclemonodb.entity.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService
{
    @Autowired
    VehicleRepository vehicleRepository;

    public Vehicle create(Vehicle vehicle)
    {
        return vehicleRepository.save(vehicle);
    }
    public Vehicle getById(Integer id)
    {
        return vehicleRepository.findById(id).get();
    }
    public List<Vehicle> getAll()
    {
        return vehicleRepository.findAll();
    }
    public Vehicle update(Vehicle vehicle)
    {
        return vehicleRepository.save(vehicle);
    }
    public void delete(Integer id)
    {
        vehicleRepository.deleteById(id);
    }

}
