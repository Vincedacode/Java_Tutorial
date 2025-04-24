package Personal;

interface Staff{
    public void staffreg(String staffname);
}

interface Student{
    public void studentreg(String studentname);
}

class mystaffs implements Staff{
    @Override
    public void staffreg(String staffname) {
        double staffid = Math.random() * 100;
        System.out.println( staffname + " has been successfully registered! With a staff id of " + staffid );


    }
}

class mystudents implements Student{
    @Override
    public void studentreg(String studentname) {
        double studentid = Math.random() * 100;

        System.out.println( studentname + " has been successfully registered! With a student id of " + studentid);
    }
}

public class Interface {
    public static void main(String[] args){
        mystaffs addstaff = new mystaffs();
        mystudents addstudent = new mystudents();
        addstaff.staffreg("Gina Thompson");
        addstudent.studentreg("Dave Friend");
    }
}
