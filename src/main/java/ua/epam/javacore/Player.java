import java.util.Scanner;

public class Player {

    private String name;
    private Choice choicePlayer;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Choice getChoicePlayer() {
        return choicePlayer;
    }

    public void setChoicePlayer(Choice choicePlayer) {
        this.choicePlayer = choicePlayer;
    }
}
