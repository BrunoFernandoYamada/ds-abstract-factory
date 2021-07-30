package main.java.br.com.bfyamada.model.vehicle.impl;

import main.java.br.com.bfyamada.model.parts.engine.AbstractEngine;
import main.java.br.com.bfyamada.model.parts.transmission.AbstractTransmission;
import main.java.br.com.bfyamada.model.vehicle.Vehicle;

public class Car extends Vehicle {

    public Car(String name, AbstractEngine engine, AbstractTransmission transmission) {
        super(name, engine, transmission);
    }

    @Override
    public void startVeihicle() {
        System.out.println("Vrum Vrum Vrum...");
    }
}
