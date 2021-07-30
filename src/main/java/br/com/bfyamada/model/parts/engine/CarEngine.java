package main.java.br.com.bfyamada.model.parts.engine;

public class CarEngine extends AbstractEngine {

    public CarEngine(String power, String brand) {
        super(power, brand);
    }

    @Override
    public void getMaxSpeed() {
        System.out.println( "Max speed: 180");
    }
}
