package main.java.br.com.bfyamada;

import main.java.br.com.bfyamada.factory.CarPartsAbstractFactory;
import main.java.br.com.bfyamada.factory.VehiclePartsAbstractFactory;
import main.java.br.com.bfyamada.factory.VehicleSimpleFactory;
import main.java.br.com.bfyamada.model.parts.engine.Engine;
import main.java.br.com.bfyamada.model.Vehicle;
import main.java.br.com.bfyamada.model.parts.transmission.Transmission;

public class Client {

    public static void main(String args[]){

        // Abstract Factory instanciation
        VehiclePartsAbstractFactory carPartsFactory =  new CarPartsAbstractFactory();

        System.out.println("Creating and running with a Car : ");

        //example - use of abstract factory
        Engine carEngine = carPartsFactory.constructEngine("V8", "Wolkswagem");
        Transmission carTransmission = carPartsFactory.constructTransmission("Carrozeria", "5");

        // FactoryMethod
        Vehicle carro = VehicleSimpleFactory.createVehicle("car", carEngine, carTransmission);

        System.out.println("\n\n");

        System.out.println("Creating and running with a Motorcycle : ");

        //example - use of abstract factory
        Engine motorcycleEngine = carPartsFactory.constructEngine("250cc", "Bross");
        Transmission motorcycleTransmission = carPartsFactory.constructTransmission("Tyon", "4");

        // FactoryMethod
        Vehicle motorcycle = VehicleSimpleFactory.createVehicle("motorcycle", motorcycleEngine, motorcycleTransmission);



    }
}
