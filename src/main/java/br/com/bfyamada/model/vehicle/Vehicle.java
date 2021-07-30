package main.java.br.com.bfyamada.model.vehicle;

import main.java.br.com.bfyamada.model.parts.engine.AbstractEngine;
import main.java.br.com.bfyamada.model.parts.transmission.AbstractTransmission;

public abstract class Vehicle{

    private String name;

    private AbstractEngine engine;

    private AbstractTransmission transmission;

    public Vehicle(String name, AbstractEngine engine, AbstractTransmission transmission){
        this.name = name;
        this.engine = engine;
        this.transmission = transmission;
    }

    public abstract void startVeihicle();

    public void departureVeicle(){
        System.out.println(name +" letf...");
    }

    public void stopVehicle(){
        System.out.println(name + " stops...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractEngine getEngine() {
        return engine;
    }

    public void setEngine(AbstractEngine engine) {
        this.engine = engine;
    }

    public AbstractTransmission getTransmission() {
        return transmission;
    }

    public void setTransmission(AbstractTransmission transmission) {
        this.transmission = transmission;
    }
}


