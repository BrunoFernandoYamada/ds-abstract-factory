package main.java.br.com.bfyamada.model;

import main.java.br.com.bfyamada.factory.CarPartsAbstractFactory;
import main.java.br.com.bfyamada.model.parts.engine.Engine;
import main.java.br.com.bfyamada.model.parts.transmission.Transmission;

public abstract class Vehicle{

    private String name;

    private Engine engine;

    private Transmission transmission;

    public Vehicle(String name, Engine engine, Transmission transmission){
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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}


