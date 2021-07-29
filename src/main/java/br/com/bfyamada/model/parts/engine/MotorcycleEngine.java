package main.java.br.com.bfyamada.model.parts.engine;

import main.java.br.com.bfyamada.model.parts.engine.Engine;

public class MotorcycleEngine extends Engine {
    public MotorcycleEngine(String power, String brand) {
        super(power, brand);
    }

    @Override
    public void getMaxSpeed() {
        System.out.println( "Max speed: 380");
    }
}
