package main.java.br.com.bfyamada.factory;

import main.java.br.com.bfyamada.model.parts.engine.CarEngine;
import main.java.br.com.bfyamada.model.parts.engine.Engine;
import main.java.br.com.bfyamada.model.parts.transmission.CarTransmission;
import main.java.br.com.bfyamada.model.parts.transmission.Transmission;

public class CarPartsAbstractFactory implements VehiclePartsAbstractFactory{
    @Override
    public Engine constructEngine(String power, String brand) {
        return new CarEngine(power, brand);
    }

    @Override
    public Transmission constructTransmission(String brand, String positions) {
        return new CarTransmission(brand,positions);
    }
}
