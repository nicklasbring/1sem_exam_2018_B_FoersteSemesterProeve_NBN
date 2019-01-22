import org.junit.Test;

import static org.junit.Assert.*;

public class MediaIDTest {

    @Test
    public void generate() {
        /*
        Dette loop tjekker på generate metoden som genererer MediaIDs
        Jeg vil bruge den til at tjekke om hver medie får et unikt ID.
        Den er sat til at se gennem de første 300 IDs.
        --> testen er gennemprøvet og den laver et unikt ID hver gang.
         */
        for (int i = 0; i < 300; i++) {
            assertNotEquals(MediaID.generate(),MediaID.generate());
        }
    }
}