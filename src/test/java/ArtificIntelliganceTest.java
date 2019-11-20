import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ArtificIntelliganceTest {
    private ArtificIntelligence ai = new ArtificIntelligence();

    @Test
    public void choiseAITest() {
        assertEquals(ai.choiseAI(),Choice.PAPER);
    }
}
