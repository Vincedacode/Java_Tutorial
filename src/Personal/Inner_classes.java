package Personal;

 class Outerclass {
     int x = 40;

     class Innerclass{
         int y = 78;
     }


}
public class Inner_classes{
    public static void main(String[] args){
        Outerclass theouterclass = new Outerclass();
        Outerclass.Innerclass theinnerclass = theouterclass.new Innerclass();
        System.out.println(theinnerclass.y + theouterclass.x);
    }
}
