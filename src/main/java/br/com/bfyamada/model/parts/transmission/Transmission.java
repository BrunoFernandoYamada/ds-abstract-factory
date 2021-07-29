package main.java.br.com.bfyamada.model.parts.transmission;

public abstract class Transmission {

    private String brand;
    private String positions;

    public Transmission(String brand, String positions) {
        this.brand = brand;
        this.positions = positions;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPositions() {
        return positions;
    }

    public void setPositions(String positions) {
        this.positions = positions;
    }

    public abstract void getMechanism();

}
