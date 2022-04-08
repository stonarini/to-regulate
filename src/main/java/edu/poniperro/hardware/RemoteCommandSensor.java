package edu.poniperro.hardware;

import edu.poniperro.IO.FileIO;
import edu.poniperro.interfaces.Thermometer;

public class RemoteCommandSensor implements Thermometer {
    @Override
    public int read() {
        String temperature = FileIO.readFromFile("temperature.txt");
        return Integer.valueOf(temperature);
    }
}
