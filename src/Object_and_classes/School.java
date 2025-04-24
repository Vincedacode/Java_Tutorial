package Object_and_classes;

public class School {
    private String name;
    private int score1, score2, score3 ;
    private double totalClasses, classAttended;

    public  School(String studentname, int studentscore1, int studentscore2, int studentscore3, double thetotalclasses, double studentclasses){
        this.name = studentname;
        this.score1 = studentscore1;
        this.score2 = studentscore2;
        this.score3 = studentscore3;
        this.totalClasses = thetotalclasses;
        this.classAttended = studentclasses;

    }



    public void studentresult(){
        double add = score1 + score2 + score3;
        double result = add / 3;

        double calc = classAttended / totalClasses;
        double secondresult = calc * 100;



        if(result >= 50 && secondresult >= 75){
            System.out.println(name + "passed with an average of "+ result + " and an attendance percentage of " + secondresult + "%" );
        }else{
            System.out.println("Student failed! with an average of"+ result + " and attendance percentage of " + secondresult + "%");
        }
    }



    public static  void main (String[] args){
        School newschool = new School("Alice "  , 60, 70, 80, 40, 30 );
        newschool.studentresult();

    }
}

