public class ThermostatGetCommand implements Command {
    private Thermostat thermostat;

    public ThermostatGetCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.getTemperature();
    }
}
