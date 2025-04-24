package Object_and_classes;

public class School2 {
    private String name;
    private int score1, score2, score3, score4 ;
    private double totalClasses, classAttended;

    public  School2(String studentname, int studentscore1, int studentscore2, int studentscore3, int studentscore4, double thetotalclasses, double studentclasses){
        this.name = studentname;
        this.score1 = studentscore1;
        this.score2 = studentscore2;
        this.score3 = studentscore3;
        this.score4 = studentscore4;
        this.totalClasses = thetotalclasses;
        this.classAttended = studentclasses;

    }



    public void studentresult(){
        double add = score1 + score2 + score3 + score4;
        double result = add / 4;

        double calc = classAttended / totalClasses;
        double secondresult = calc * 100;

        String lettergrade = "";



        if(result <= 100 && result >= 90){
            lettergrade = "A";
        }else if(result <= 89 && result >= 80){
            lettergrade = "B";
        }else if(result <= 79 && result >= 70) {
            lettergrade = "C";
        }
        else if(result <= 69 && result >= 60) {
            lettergrade = "D";
        }else if(result < 60){
            lettergrade = "F";
        }else{
            System.out.println("Average cannot be more than 100!");
        }





        if(result >= 50 && secondresult >= 75 && !lettergrade.equals("F")){
            System.out.println(name + "passed with an average of "+ result + " and an attendance percentage of " + secondresult + "%" + " and a grade of " + lettergrade );
        }else{
            System.out.println("Student failed! with an average of"+ result + " and attendance percentage of " + secondresult + "%" + " and a grade of " + lettergrade);
        }
        if (score1 < 0 || score1 > 100 ||
                score2 < 0 || score2 > 100 ||
                score3 < 0 || score3 > 100 ||
                score4 < 0 || score4 > 100) {
            throw new IllegalArgumentException("Scores must be between 0 and 100.");
        }

        if (totalClasses <= 0 || classAttended < 0 || classAttended > totalClasses) {
            throw new IllegalArgumentException("Invalid class attendance data.");
        }

    }



    public static  void main (String[] args){
        School2 newschool = new School2("Alice "  , 60, 70, 80, 60,40, 30 );
        newschool.studentresult();

    }
}
