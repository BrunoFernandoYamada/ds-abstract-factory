package main.java.br.com.bfyamada.abstractFactory;

import main.java.br.com.bfyamada.model.parts.engine.AbstractEngine;
import main.java.br.com.bfyamada.model.parts.transmission.AbstractTransmission;

public interface VehiclePartsAbstractFactory {

    AbstractEngine constructEngine(String power, String brand);

    AbstractTransmission constructTransmission(String brand, String positions);
}
