package main.java.br.com.bfyamada.model.impl;

import main.java.br.com.bfyamada.model.parts.engine.Engine;
import main.java.br.com.bfyamada.model.Vehicle;
import main.java.br.com.bfyamada.model.parts.transmission.Transmission;

public class Motorcycle extends Vehicle {

    public Motorcycle(String name, Engine engine, Transmission transmission) {
        super(name, engine, transmission);
    }

    @Override
    public void startVeihicle() {
        System.out.println("Brumm Brumm Brumm...");
    }
}
