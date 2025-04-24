package New_task;

enum Trafficlight{
    RED,
    YELLOW,
    GREEN


}


public class Tryenum {
    public static void main(String[] args){
        Trafficlight light = Trafficlight.GREEN;



        switch (light) {
            case RED :
                System.out.println("Current light " + light + " - STOP!");
                break;
            case YELLOW:
                System.out.println("Current light " + light + " - READY!");
                break;
            case GREEN:
                System.out.println("Current light " + light + " - GO!");
                break;
        }
        }
    }


