import java.sql.SQLOutput;

public class MusicPlayer {
    private int index = 1;
    private String[] songs = {
            "Jeanette - El muchacho de los ojos tristes",
            "boy pablo - everytime",
            "Cosmo Sheldrake - Solar Waltz",
            "Liana Flores - Rises the Moon"
    };

    // Getting lazy... I'll just put it on the on and off commands
    public void turnOn() {
        System.out.println("Now playing " + songs[0]);
        // Playlist always starts on the first song!
    }

    public void turnOff() {
        System.out.println("Stopping Music player...");
    }

    public void setSong(int index) {
        this.index = index;
        System.out.println("Going to index " + index + " of playlist...");
        System.out.println("Now playing " + songs[index]);
    }

    public void next() {
        if (this.index != songs.length - 1) {
            this.index++;
        } else {
            this.index = 0;
        }

        System.out.println("Next!");
        System.out.println("Now playing " + songs[index]);
    }

    public void previous() {
        if (this.index != 0) {
            this.index--;
        } else {
            this.index = songs.length - 1;
        }

        System.out.println("Back!");
        System.out.println("Now playing " + songs[index]);
    }
}
