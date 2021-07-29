package main.java.br.com.bfyamada.model.impl;

import main.java.br.com.bfyamada.model.parts.engine.Engine;
import main.java.br.com.bfyamada.model.Vehicle;
import main.java.br.com.bfyamada.model.parts.transmission.Transmission;

public class Car extends Vehicle {

    public Car(String name, Engine engine, Transmission transmission) {
        super(name, engine, transmission);
    }

    @Override
    public void startVeihicle() {
        System.out.println("Vrum Vrum Vrum...");
    }
}
