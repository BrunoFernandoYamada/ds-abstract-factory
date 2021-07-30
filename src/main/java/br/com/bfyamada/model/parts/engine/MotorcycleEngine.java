package main.java.br.com.bfyamada.model.parts.engine;

public class MotorcycleEngine extends AbstractEngine {
    public MotorcycleEngine(String power, String brand) {
        super(power, brand);
    }

    @Override
    public void getMaxSpeed() {
        System.out.println( "Max speed: 380");
    }
}
