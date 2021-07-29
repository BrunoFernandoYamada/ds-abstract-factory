package main.java.br.com.bfyamada.model.parts.transmission;

public class MotorcycleTransmission extends Transmission {
    public MotorcycleTransmission(String brand, String positions) {
        super(brand, positions);
    }

    @Override
    public void getMechanism() {
        System.out.println( "Mechanical Transmission");
    }
}
