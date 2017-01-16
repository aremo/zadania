package zad3;

public enum Directions {
    NORTH("PÓŁNOC"),
    EAST("WSCHÓD"),
    SOUTH("POŁUDNIE"),
    WEST("ZACHÓD"),
    UNDEFINED("NIEZNANY");

    private final String translation;

    Directions(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return this.translation;
    }

    public static Directions convert(int number) {
        switch (number) {
            case 0:
                return NORTH;
            case 1:
                return EAST;
            case 2:
                return SOUTH;
            case 3:
                return WEST;
            default:
                return UNDEFINED;
        }
    }

    public static Directions convertInput(String userInput)
    {
        switch(userInput)
        {
            case "NORTH":
                return NORTH;
            case "EAST":
                return EAST;
            case "SOUTH":
                return SOUTH;
            case "WEST":
                return WEST;
            default:
                return UNDEFINED;
        }
    }

}