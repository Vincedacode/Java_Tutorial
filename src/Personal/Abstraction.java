package Personal;

// Abstract class
abstract class Animals {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void Sleep(){
        System.out.println("ZZZZZ");
    }

}

// Subclass (inherit from Animal)
class Cats extends Animals{
    @Override
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("Cats makes meow meow");
    }
}

public class Abstraction {
    public static void main(String[] args){
        Cats mycat = new Cats();
        mycat.animalSound();
        mycat.Sleep();
    }
}