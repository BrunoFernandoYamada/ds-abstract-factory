package main.java.br.com.bfyamada.factory;

import main.java.br.com.bfyamada.model.parts.engine.Engine;
import main.java.br.com.bfyamada.model.parts.engine.MotorcycleEngine;
import main.java.br.com.bfyamada.model.parts.transmission.MotorcycleTransmission;
import main.java.br.com.bfyamada.model.parts.transmission.Transmission;

public class MotorcyclePartsAbstractFactory implements VehiclePartsAbstractFactory{
    @Override
    public Engine constructEngine(String power, String brand) {
        return new MotorcycleEngine(power, brand);
    }

    @Override
    public Transmission constructTransmission(String brand, String positions) {
        return new MotorcycleTransmission(brand, positions);
    }
}
