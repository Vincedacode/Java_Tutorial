package Personal;

public class Encapsulation {

    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
        System.out.println(name);
    }

    public static void main (String[] args){
        Encapsulation useencap = new Encapsulation();
        useencap.setName("John");
        useencap.getName();
    }
}
