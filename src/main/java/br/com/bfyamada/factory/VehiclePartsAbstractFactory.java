package main.java.br.com.bfyamada.factory;

import main.java.br.com.bfyamada.model.parts.engine.Engine;
import main.java.br.com.bfyamada.model.parts.transmission.Transmission;

public interface VehiclePartsAbstractFactory {

    Engine constructEngine(String power, String brand);

    Transmission constructTransmission(String brand, String positions);
}
