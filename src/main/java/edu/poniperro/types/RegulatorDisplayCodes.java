package edu.types;

public enum RegulatorDisplayCodes {
    HEATING,
    WAITING;

    public void message(int temperature) {
        System.out.println(this.name() + " " + temperature);
    }
}
