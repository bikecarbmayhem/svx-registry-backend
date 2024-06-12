package com.svx_registry.services;

import com.svx_registry.obj.Vehicle;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleService {


    List<Vehicle> vehicles = new ArrayList<>();
    private long frame = 100001;

    public VehicleService() {
        this.vehicles.add(new Vehicle(this.frame++,"VIN0001","Ota north plant","USDM",1992,"062 Cabernet","LS-L",false,250000));
        this.vehicles.add(new Vehicle(this.frame++,"VIN0002","Ota north plant","EUDM",1992,"062 Cabernet","LS-I",true,25000));
        this.vehicles.add(new Vehicle(this.frame++,"VIN0003","Ota north plant","JDM",1992,"062 Cabernet","L",true,2500));

    }

    public List<Vehicle> getVehiclesList() { return this.vehicles;}

    public Vehicle getVehicleByFrame(long frame) {
        for(Vehicle vehicle : this.vehicles) {
            if(vehicle.getFrame() == frame) {
                return vehicle;
            }
        }
        return null;
    }

    public void deleteVehicle(long frame) {
        List<Vehicle> vehicleList = this.vehicles;
        for(int i=0; i < vehicleList.size(); i++) {
            Vehicle vehicle = vehicleList.get(i);
            if(vehicle.getFrame() == frame) {
                this.vehicles.remove(i);
                return;
            }
        }
    }

    public Vehicle createVehicle(Vehicle vehicle) {
        vehicle.setFrame(this.frame++);
        this.vehicles.add(vehicle);
        return vehicle;
    }

    public Vehicle updateVehicle(Vehicle updatedVehicle) {
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            if (vehicle.getFrame() == updatedVehicle.getFrame()) {
                vehicle.setVin(updatedVehicle.getVin());
                vehicle.setFactory(updatedVehicle.getFactory());
                vehicle.setMarket(updatedVehicle.getMarket());
                vehicle.setYear(updatedVehicle.getYear());
                vehicle.setColor(updatedVehicle.getColor());
                vehicle.setGrade(updatedVehicle.getGrade());
                vehicle.setPendingVerification(updatedVehicle.isPendingVerification());
                vehicle.setMileage(updatedVehicle.getMileage());
                return vehicle;
            }
        }
        return null; // Or throw an exception if the vehicle is not found
    }




    //    private long frame;
    //    private String vin;
    //    private String factory;
    //    private String market;
    //    private int year;
    //    private String color;
    //    private String grade;
    //    private boolean isVerified;
    //    private long mileage;

}
