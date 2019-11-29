import org.junit.Assert;
import org.junit.Test;
import ua.epam.javacore.Choice;
import ua.epam.javacore.GameLogic;
import ua.epam.javacore.Player;

public class GameLogicTest {

    private GameLogic gameLogic = new GameLogic();
    private Player player = new Player("Sasha");

    @Test
    public void getChoicePlayerTest() {
        Assert.assertEquals(gameLogic.getChoicePlayer(player), Choice.ROCK);
    }
}
