package Personal;

public class Tryclass2 {
    public void publicMethod(){
        System.out.println("Public method");
    }
    static void staticMethod(){
        System.out.println("Static method");
    }

    public  void driveSpeed(){
        System.out.println("The car is going as fast as it can!");
    }

    public  void maxSpeed(int speed){
        System.out.println("Max speed is "+ speed);
    }

    public  static  void main(String[] args){
        Tryclass2 usepublic = new Tryclass2();
        usepublic.publicMethod();

        staticMethod();

        usepublic.driveSpeed();
        usepublic.maxSpeed(200);
    }

}
