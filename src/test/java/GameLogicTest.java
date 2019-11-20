import org.junit.Assert;
import org.junit.Test;

public class GameLogicTest {

    private GameLogic gameLogic = new GameLogic();
    private Player player = new Player("Sasha");

    @Test
    public void getChoicePlayerTest() {
        Assert.assertEquals(gameLogic.getChoicePlayer(player),Choice.ROCK);
    }
}
