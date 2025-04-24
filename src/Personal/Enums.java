package Personal;

public class Enums {
    enum gameDifficulty{
        LOW,
        MEDIUM,
        HARD
    }
    public static void main(String[] args){
        gameDifficulty gamediff = gameDifficulty.HARD;
        switch (gamediff){
            case LOW :
                System.out.println("Game is easy for beginners!");
                break;
            case MEDIUM:
                System.out.println("Game is for intermediates!");
                break;
            case HARD:
                System.out.println("Game is for professionals!");
                break;
            default:
                System.out.println("Unable to determine game difficulty!");
                break;
        }
//        System.out.println(gamediff);
    }
}
