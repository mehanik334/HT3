public enum Choice {
    ROCK,SCISSORS,PAPER;

    public int compare (Choice choice) {
        if(this == choice) {
            return 0;
        }
        switch (this) {
            case ROCK:
                return choice == SCISSORS ? 1 : -1;
            case PAPER:
                return choice == ROCK ? 1 : -1;
            case SCISSORS:
                return  choice == PAPER ? 1 : -1;
        }
        return 0;
    }
}
