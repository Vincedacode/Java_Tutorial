import java.util.Arrays;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        System.out.println("hey");
        int age = 80;
        age = 100;
        System.out.println(age);

        int testnum = 40;
        int testnum2 = testnum;
        testnum = 70;
        System.out.println(testnum2);
        byte bit = 21;
        short shot = 234;
        int hint = 4_500_000;
        long lon = 593_333_335L;
        char chars = 'x';
        float floats = 2.345F;
        double doubles = 345.566;
        String name1 = "Vince";
        String name2 = name1;
        name1 = "code";


        System.out.println(name2);

        String welc = "Hello";
        welc.concat("World");
        System.out.println(welc);



        String[] myarray = {"x", "c", "h", "l"};
        System.out.println(myarray[1]);
        myarray[0] = "f";
        System.out.println(myarray);
        System.out.println(myarray.length);

        int[][] numbers = new int[3][4];

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(matrix[1][2]);

        int[][][] matrix2 = {
                {{1, 2, 3, 4}, {4, 5, 6, 7}, {7, 8, 9, 10}},
                {{1, 2, 3, 4}, {4, 5, 6, 7}, {7, 8, 9, 10}},
                {{1, 2, 3, 4}, {4, 5, 6, 7}, {7, 8, 9, 10}},
                {{1, 2, 3, 4}, {4, 5, 6, 7}, {7, 8, 9, 10}},
                {{1, 2, 3, 4}, {4, 5, 6, 7}, {7, 8, 9, 10}},
        };
        System.out.println(matrix2[2][2][1]);
        System.out.println(Arrays.deepToString(matrix2));

        int tryten = 56;
        String res = (tryten > 50) ? "Nice" : "Duh";
        System.out.println(res);

        int voterage = 15;
        String votecheck;

        if (voterage >= 18) {
            votecheck = "Congratulations! You are eligible to vote";
            System.out.println(votecheck);
        } else if (voterage < 10) {
            votecheck = "You are too young, wait for at least 8 years!";
            System.out.println(votecheck);
        } else {
            votecheck = "Wait till you are 18!";
            System.out.println(votecheck);
        }
        String concats = "Hey";
        concats += " there";
        System.out.println(concats);

        int tryloop[] = {1, 2, 3, 4, 5, 6};

// For each loop
        for (int access : tryloop) {
            int resu = access * 5;
            System.out.println(resu);
        }

// For loop
        for (int i = 0; i < tryloop.length; i++) {
            int resul = tryloop[i] *= 5;
            System.out.println(resul);
        }
        Scanner myscanner = new Scanner(System.in);

        int num, counter, sum;
        counter = 0;
        sum = 0;
        for (int i = 0; i < 11; i++){
            System.out.println("Sum is: " + sum);
            System.out.println("Enter a number: ");
            num =  myscanner.nextInt();
            myscanner.nextLine();
            sum = sum +  num;
            counter++;
        }

//  While loop
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }


    }
}


