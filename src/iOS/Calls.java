package iOS;

public class Calls implements Phone {
    public void call() {
        System.out.println("Calling...");
    }
    
    public void receive() {
        System.out.println("Received");
    }
    
    public void recordVoicemail() {
        System.out.println("Recording Voicemail");
    }
} 