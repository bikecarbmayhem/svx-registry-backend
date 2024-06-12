package com.svx_registry.controllers;


import com.svx_registry.services.VehicleService;
import com.svx_registry.obj.Vehicle;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("cars")
@RestController
public class VehicleController {
        private VehicleService vehicleService;

        public VehicleController(VehicleService vehicleService) { this.vehicleService = vehicleService; }

        @GetMapping("list")
        public List<Vehicle> getVehicles() { return this.vehicleService.getVehiclesList(); }

        @GetMapping("{id}")
        public Vehicle getVehicleById(@PathVariable Long id) { return this.vehicleService.getVehicleByFrame(id);}

        @PostMapping("create")
        public Vehicle createVehicle(@RequestBody Vehicle vehicle) {return this.vehicleService.createVehicle(vehicle); }

        @PostMapping("")
        public Vehicle Update

        @DeleteMapping("{id}")
        public void deleteVehicle(@PathVariable Long id) { this.vehicleService.deleteVehicle(id); }



    //    private long frame;
    //    private String vin;
    //    private String factory;
    //    private String market;
    //    private int year;
    //    private String color;
    //    private String grade;
    //    private List<String> imageId;
    //    private boolean isVerified;
    //    private long mileage;
}
