package main.java.br.com.bfyamada.model.parts.engine;

public abstract class Engine {

    private String power;
    private String brand;

    public Engine(String power, String brand) {
        this.power = power;
        this.brand = brand;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract void getMaxSpeed();
}
