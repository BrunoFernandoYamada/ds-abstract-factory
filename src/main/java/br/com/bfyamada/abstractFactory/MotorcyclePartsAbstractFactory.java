package main.java.br.com.bfyamada.abstractFactory;

import main.java.br.com.bfyamada.model.parts.engine.AbstractEngine;
import main.java.br.com.bfyamada.model.parts.engine.MotorcycleEngine;
import main.java.br.com.bfyamada.model.parts.transmission.MotorcycleTransmission;
import main.java.br.com.bfyamada.model.parts.transmission.AbstractTransmission;

public class MotorcyclePartsAbstractFactory implements VehiclePartsAbstractFactory{
    @Override
    public AbstractEngine constructEngine(String power, String brand) {
        return new MotorcycleEngine(power, brand);
    }

    @Override
    public AbstractTransmission constructTransmission(String brand, String positions) {
        return new MotorcycleTransmission(brand, positions);
    }
}
