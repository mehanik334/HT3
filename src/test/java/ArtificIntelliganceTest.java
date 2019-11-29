import org.junit.Test;
import ua.epam.javacore.ArtificIntelligence;
import ua.epam.javacore.Choice;

import static org.junit.Assert.assertEquals;


public class ArtificIntelliganceTest {
    private ArtificIntelligence ai = new ArtificIntelligence();

    @Test
    public void choiseAITestFalse() {
        Choice choice = ai.choiseAI();
        assertEquals(choice, null);
    }
}
