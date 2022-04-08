package edu.poniperro;

import edu.poniperro.hardware.Gangsta;
import edu.poniperro.hardware.GasHeater;
import edu.poniperro.hardware.Regulator;
import edu.poniperro.hardware.RemoteCommandSensor;
import edu.poniperro.interfaces.Heater;
import edu.poniperro.interfaces.Thermometer;

public class App {
    public static void main(String[] args) {
        final double minTemp = 15.0;
        final double maxTemp = 21.0;

        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();

        Regulator regulator = new Regulator();

        System.out.println("Arrancando...");
        regulator.regulate(thermometer, heater, minTemp, maxTemp);

        Gangsta nateDogg = new Gangsta();
        System.out.println("\nArrancando a Nate Dogg: ");
        regulator.regulate(thermometer, nateDogg, minTemp, maxTemp);
        nateDogg.speak();

        Heater warrenG = new Gangsta();
        // warrenG.speak(); // ups, The method speak() is undefined for the type Heater
    }

}
