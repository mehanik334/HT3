import java.util.Scanner;

public class GameLogic {

    public void runGame(){
        System.out.println("Добро пожаловать в игру Камень - Ножницы - Бумага");
        System.out.println("Введите ваше имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Player player = new Player(name);
        ArtificIntelligence ai = new ArtificIntelligence();
        for( ; ; ) {
            Choice playerChoice = getChoicePlayer(player);
            int winner = ai.choiseAI().compare(playerChoice);
            switch (winner) {
                case 1:
                    System.out.println(player.getName() + " you lose");
                    return;
                case 0:
                    System.out.println("Ничья");
                    continue;
                case -1:
                    System.out.println(player.getName() + " you win");
                    return;
            }
        }
    }

    public Choice getChoicePlayer(Player player) {
        System.out.println("Выберите один из вариантов :");
        System.out.println("1 - камень ;");
        System.out.println("2 - ножницы ;");
        System.out.println("3 - бумага;");
        Scanner scanner = new Scanner(System.in);
        int choiseP = scanner.nextInt();
        if (choiseP > 0 && choiseP < 3) {
            switch (choiseP) {
                case 1 :
                    player.setChoicePlayer(Choice.ROCK);
                    return player.getChoicePlayer();
                case 2 :
                    player.setChoicePlayer(Choice.SCISSORS);
                    return player.getChoicePlayer();
                case 3 :
                    player.setChoicePlayer(Choice.PAPER);
                    return player.getChoicePlayer();
            }
        }else {
            System.out.println("Wrong enter");
        }
        return getChoicePlayer(player);
    }

}
