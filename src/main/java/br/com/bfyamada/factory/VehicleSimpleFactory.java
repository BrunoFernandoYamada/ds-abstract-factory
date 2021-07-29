package main.java.br.com.bfyamada.factory;

import main.java.br.com.bfyamada.model.parts.engine.Engine;
import main.java.br.com.bfyamada.model.Vehicle;
import main.java.br.com.bfyamada.model.impl.Car;
import main.java.br.com.bfyamada.model.impl.Motorcycle;
import main.java.br.com.bfyamada.model.parts.transmission.Transmission;

public class VehicleSimpleFactory {

    public static Vehicle createVehicle(String type, Engine engine, Transmission transmission){

        Vehicle vehicle = null;

        if("motorcycle".equals(type)){
            vehicle = new Motorcycle(type, engine, transmission);
        }else if("car".equals(type)){
            vehicle = new Car(type, engine, transmission);
        }else{
            throw new UnsupportedOperationException("Not implemented");
        }

        vehicle.startVeihicle();
        vehicle.departureVeicle();
        vehicle.stopVehicle();
        System.out.println("Engine brand: "+ vehicle.getEngine().getBrand());
        System.out.println("Engine Power: " + vehicle.getEngine().getPower());
        vehicle.getEngine().getMaxSpeed();
        System.out.println("Transmission brand: " +vehicle.getTransmission().getBrand());
        System.out.println("Transmission positions: " +vehicle.getTransmission().getPositions());
        vehicle.getTransmission().getMechanism();


        return vehicle;

    }
}
