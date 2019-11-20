import java.util.Random;

public class ArtificIntelligence {

    public final static String NAME_AI = "GOSHA";

    public Choice choiseAI() {
        Choice[] choices = Choice.values();
        Random random = new Random();
        int index = random.nextInt(choices.length);
        return choices[index];
    }
}
