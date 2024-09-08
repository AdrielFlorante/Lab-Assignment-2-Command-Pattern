public class MusicPlayerPrevCommand implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerPrevCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.previous();
    }
}
