public class CommandClientDemo {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        // Lights
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);

        remote.setCommand(lightsOn);
        remote.pressButton();  // Output: The light is on

        remote.setCommand(lightsOff);
        remote.pressButton();  // Output: The light is off

        // Thermostat
        Thermostat thermostat = new Thermostat();
        Command thermostatOn = new ThermostatOnCommand(thermostat);
        Command thermostatOff = new ThermostatOffCommand(thermostat);

        Command thermostatRaise = new ThermostatRaiseCommand(thermostat);
        Command thermostatLower = new ThermostatLowerCommand(thermostat);

        Command thermostatGet = new ThermostatGetCommand(thermostat);

        int temperatureToSet = 21; // Imagine the Client set the temperature to this through their user interface
        Command thermostatSet = new ThermostatSetCommand(thermostat, temperatureToSet);

        remote.setCommand(thermostatOn);
        remote.pressButton();

        remote.setCommand(thermostatSet);
        remote.pressButton();

        remote.setCommand(thermostatRaise);
        remote.pressButton();

        remote.setCommand(thermostatLower);
        remote.pressButton();

        remote.setCommand(thermostatGet);
        remote.pressButton();

        remote.setCommand(thermostatOff);
        remote.pressButton();

        // MusicPlayer
        MusicPlayer musicPlayer = new MusicPlayer();
        Command musicPlayerOn = new MusicPlayerOnCommand(musicPlayer);
        Command musicPlayerOff = new MusicPlayerOffCommand(musicPlayer);

        int index = 1; // I want it to play the second song in the playlist
        Command musicPlayerSet = new MusicPlayerSetCommand(musicPlayer, index);

        Command musicPlayerPrev = new MusicPlayerPrevCommand(musicPlayer);
        Command musicPlayerNext = new MusicPlayerNextCommand(musicPlayer);

        remote.setCommand(musicPlayerOn);
        remote.pressButton();

        remote.setCommand(musicPlayerSet);
        remote.pressButton();

        remote.setCommand(musicPlayerPrev);
        remote.pressButton();

        remote.setCommand(musicPlayerPrev);
        remote.pressButton();

        remote.setCommand(musicPlayerNext);
        remote.pressButton();

        remote.setCommand(musicPlayerOff);
        remote.pressButton();
    }
}