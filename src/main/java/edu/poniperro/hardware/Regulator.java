package edu.poniperro.hardware;

import edu.poniperro.interfaces.Heater;
import edu.poniperro.interfaces.Thermometer;
import edu.types.RegulatorDisplayCodes;

public class Regulator {
    public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp) {
        while (t.read() < maxTemp) {
            RegulatorDisplayCodes.HEATING.message(t.read());
            h.engage();
        }
        while (t.read() > minTemp) {
            RegulatorDisplayCodes.WAITING.message(t.read());
            h.disengage();
        }
    }
}
