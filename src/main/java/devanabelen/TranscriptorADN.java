package devanabelen;

public class TranscriptorADN {

    public String transcribe(String adn) {
        // Si recibe "G", lo transcribe como "C"
        if (adn.equals("G")) {
            return "C";
        }
        return "";
    }
}
