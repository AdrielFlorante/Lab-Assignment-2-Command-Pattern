public class ThermostatLowerCommand implements Command {
    private Thermostat thermostat;

    public ThermostatLowerCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.lowerTemp();
    }
}
