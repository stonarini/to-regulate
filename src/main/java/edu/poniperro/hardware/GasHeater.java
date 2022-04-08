package edu.poniperro.hardware;

import edu.poniperro.IO.FileIO;
import edu.poniperro.interfaces.Heater;

public class GasHeater implements Heater {
    @Override
    public void engage() {
        String temperature = FileIO.readFromFile("temperature.txt");
        FileIO.writeToFile("temperature.txt", String.valueOf(Integer.valueOf(temperature) + 1));
    }

    @Override
    public void disengage() {
        String temperature = FileIO.readFromFile("temperature.txt");
        FileIO.writeToFile("temperature.txt", String.valueOf(Integer.valueOf(temperature) - 1));
    }

}
