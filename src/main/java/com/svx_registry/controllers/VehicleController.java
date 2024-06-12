package com.svx_registry.controllers;


import com.svx_registry.services.VehicleService;
import com.svx_registry.obj.Vehicle;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("cars")
@RestController
public class VehicleController {
        private final VehicleService vehicleService;

        public VehicleController(VehicleService vehicleService) { this.vehicleService = vehicleService; }

        @GetMapping("list")
        public List<Vehicle> getVehicles() { return this.vehicleService.getVehiclesList(); }

        @GetMapping("{id}")
        public Vehicle getVehicleById(@PathVariable long id) { return this.vehicleService.getVehicleByFrame(id);}

        @PostMapping("create")
        public Vehicle createVehicle(@RequestBody Vehicle vehicle) {return this.vehicleService.createVehicle(vehicle); }

        @PutMapping("update")
        public Vehicle updateVehicle(@RequestBody Vehicle vehicle) {return this.vehicleService.updateVehicle(vehicle); }

        @DeleteMapping("{id}")
        public void deleteVehicle(@PathVariable long id) { this.vehicleService.deleteVehicle(id); }


}
