package iOS;

public class MusicPlayer implements Ipod {
    
    public void play() {
        System.out.println("Playing...");
    }
    
    public void pause() {
        System.out.println("Paused");
    }
    
    public void select() {
        System.out.println("Track selected");
    }
}