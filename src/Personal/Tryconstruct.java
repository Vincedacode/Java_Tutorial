package Personal;

public class Tryconstruct {
   private int x ;
    int y;

    int year;

String model;
    public Tryconstruct(int z, int modelyear, String name){
        this.x= 98;
        y = z;
        year = modelyear;
        model = name;
    }
     public  static  void main(String[] args){
        Tryconstruct useconstructor = new Tryconstruct(23, 2003, "Benz234");
        System.out.println(useconstructor.x);
        System.out.println(useconstructor.y);
        System.out.println("The model of my car is "+ useconstructor.model + " and it was made in the year "+ useconstructor.year);
    }
}


