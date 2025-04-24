package New_task;

interface Vehicle{
    public void start();

    public void stop();

    public int getSpeed();
}

class Bike implements Vehicle{
    private int speed;
    private String name;

    public Bike(int bikespeed, String bikename){
        this.speed = bikespeed;
        this.name = bikename;
    }

    @Override
    public void start() {
        System.out.println(name + " has started moving!");
    }

    @Override
    public void stop() {
        System.out.println(name + " has stopped moving!");
    }

    @Override
    public int getSpeed() {
        System.out.println(name + " is moving at a speed of " + speed + "km/hr");
        return speed;
    }
}

class Car implements Vehicle{
    private int speed;

    private String name;
    public Car(int carspeed, String carname){
        this.speed = carspeed;
        this.name = carname;
    }


    @Override
    public void start() {
        System.out.println(name + " has started moving!");
    }

    @Override
    public void stop() {
        System.out.println(name + " has stopped moving!");
    }

    @Override
    public int getSpeed() {
        System.out.println(name + " is moving at a speed of " + speed + "km/hr");
        return speed;
    }
}
public class Tryinter {
    public static void main(String[] args){
        Car addcar = new Car(20, "Ford Mustang");
        Bike addbike = new Bike(35, "Desert Bike");
        addcar.start();
        addcar.stop();
        addcar.getSpeed();
        addbike.start();
        addbike.stop();
        addbike.getSpeed();
    }
}
