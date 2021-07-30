package main.java.br.com.bfyamada.abstractFactory;

import main.java.br.com.bfyamada.model.parts.engine.CarEngine;
import main.java.br.com.bfyamada.model.parts.engine.AbstractEngine;
import main.java.br.com.bfyamada.model.parts.transmission.CarTransmission;
import main.java.br.com.bfyamada.model.parts.transmission.AbstractTransmission;

public class CarPartsAbstractFactory implements VehiclePartsAbstractFactory{
    @Override
    public AbstractEngine constructEngine(String power, String brand) {
        return new CarEngine(power, brand);
    }

    @Override
    public AbstractTransmission constructTransmission(String brand, String positions) {
        return new CarTransmission(brand,positions);
    }
}
