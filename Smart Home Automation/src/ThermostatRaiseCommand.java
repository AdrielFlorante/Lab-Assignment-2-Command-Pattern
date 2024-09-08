public class ThermostatRaiseCommand implements Command {
    private Thermostat thermostat;

    public ThermostatRaiseCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.raiseTemp();
    }
}
