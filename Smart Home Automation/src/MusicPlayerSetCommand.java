public class MusicPlayerSetCommand implements Command {
    private MusicPlayer musicPlayer;
    private int index;

    public MusicPlayerSetCommand(MusicPlayer musicPlayer, int index) {
        this.musicPlayer = musicPlayer;
        this.index = index;
    }

    @Override
    public void execute() {
        musicPlayer.setSong(index);
    }
}
