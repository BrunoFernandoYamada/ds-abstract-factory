package main.java.br.com.bfyamada.model.parts.transmission;

public class CarTransmission extends AbstractTransmission {
    public CarTransmission(String brand, String positions) {
        super(brand, positions);
    }

    @Override
    public void getMechanism() {
        System.out.println( "Hydraulic Transmission");
    }
}
