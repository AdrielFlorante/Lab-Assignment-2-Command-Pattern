public class MusicPlayerNextCommand implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerNextCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.next();
    }
}
