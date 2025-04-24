package Personal;

class Animal {
    public void AnimalSound(){
        System.out.println("Animals makes a sound");
    }
}
class Cat extends Animal{
    public void AnimalSound(){
        System.out.println("Cat makes meow meow");
    }

}

class Dog extends Animal{
    public void AnimalSound(){
        System.out.println("Dog makes bark bark");
    }

}
class Main{
    public static void main(String[] args){
        Cat mycat = new Cat();
        Dog mydog = new Dog();
        mydog.AnimalSound();
        mycat.AnimalSound();
    }
}

