package com.example.vehiclemonodb.controller;

import com.example.vehiclemonodb.entity.Vehicle;
import com.example.vehiclemonodb.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vehicle-app")
public class VehicleController
{
    @Autowired
    VehicleService vehicleService;

    @PostMapping("/create")
    public Vehicle create(@RequestBody Vehicle vehicle)
    {
        return vehicleService.create(vehicle);
    }
    @GetMapping("/getById/{id}")
    public Vehicle getById(@PathVariable Integer id)
    {
        return vehicleService.getById(id);
    }
    @GetMapping("/getAll")
    public List<Vehicle> getAll()
    {
        return vehicleService.getAll();
    }

    @PutMapping("/update")
    public Vehicle update(@RequestBody Vehicle vehicle)
    {
        return vehicleService.update(vehicle);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id)
    {
        vehicleService.delete(id);
    }

}
