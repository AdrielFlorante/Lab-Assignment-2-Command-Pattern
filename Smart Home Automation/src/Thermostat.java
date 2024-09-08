public class Thermostat {
    private int temperature;

    public void turnOn() {
        System.out.println("The thermostat is on");
    }

    public void turnOff() {
        System.out.println("The thermostat is off");
    }

    public void setTemperature(int temperature) { // Nah we too cool for this
        this.temperature = temperature;
        System.out.println("Thermostat temperature is set to " + temperature + " degrees celsius.");
    }

    public void raiseTemp() {
        this.temperature += 1;
        System.out.println("Thermostat temperature increased by 1 degrees!");
    }

    public void lowerTemp() {
        this.temperature -= 1;
        System.out.println("Thermostat temperature decreased by 1 degrees!");
    }

    public int getTemperature() {
        System.out.println("Thermostat temperature is " + this.temperature);
        return temperature;
    }
}
