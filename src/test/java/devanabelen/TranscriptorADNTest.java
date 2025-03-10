import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TranscriptorADNTest {

    @Test
    public void testTranscribeGuanineToCytosine() {
        TranscriptorADN transcriptor = new TranscriptorADN();
        assertEquals("C", transcriptor.transcribe("G"));
    }
}
