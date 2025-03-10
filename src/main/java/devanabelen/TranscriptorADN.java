package devanabelen;

public class TranscriptorADN {

    public String transcribe(String adn) {
        if (adn.equals("G")) {
            return "C";
        }
        if (adn.equals("C")) {
            return "G";
        }
        if (adn.equals("A")) {
            return "U";
        }
        return "";
    }
}
