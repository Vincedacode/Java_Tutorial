package Quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MyQuestions{
    protected String question;
    protected String optionA;
    protected String optionB;
    protected String optionC;
    protected String optionD;
    protected char correctAnswer;
    public MyQuestions(String question, String optionA, String optionB, String optionC, String optionD, char correctAnswer){
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAnswer = correctAnswer;
    }
    public  boolean isCorrect(char answer) {
        return Character.toUpperCase(answer) == Character.toUpperCase(correctAnswer);
    }
}
public class Tryquiz {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Welcome to Anime Quiz🙂");
        List<MyQuestions> newQuestion = new ArrayList();
        newQuestion.add(new MyQuestions("Who did Madara acknowledge as the best in Taijutsu in Naruto Anime",
                "Naruto", "Rock Lee", "Might Guy", "Kakashi", 'C'));
        newQuestion.add(new MyQuestions("Who was the Demon Monarch in Solo Leveling Anime",
                "Baruka", "Beru", "Ensil", "Baran", 'D'));
        newQuestion.add(new MyQuestions("Who is known as the Crown Messenger in Blue Lock anime",
                "Michael Kaiser", "Marc Snuffy", "Julian Loki", "Isagi Yoichi", 'B'));
        newQuestion.add(new MyQuestions("Who is popularly known as humanity's strongest soldier in the anime world",
                "Levi Ackerman", "Sung Jin Woo", "Goku", "Saitama", 'A'));
        newQuestion.add(new MyQuestions("Who is the Wind Hashira",
                "Giyu Tomioka", "Muichiro Tokito", "Iguro Obanai", "Sanemi Shinazugawa", 'D'));
        newQuestion.add(new MyQuestions("What anime is the power system about cursed energy",
                "Naruto", "Jujutsu Kaisen", "Solo Leveling", "Blue Lock", 'B'));
        newQuestion.add(new MyQuestions("Who is the strongest fire soldier in Fire Force anime",
                "Benimaru Shinmon", "Captain Burns", "Shinra Kusakabe", "Obi Akinchawa", 'A'));
        newQuestion.add(new MyQuestions("Who was the leader of the Akatsuki in Naruto",
                "Pain", "Obito Uchiha", "Itachi Uchiha", "Kisame", 'B'));
        newQuestion.add(new MyQuestions("Who was the wielder of Armored Titan",
                "Annie Leonhart", "Eren Jaeger", "Reiner Braun", "Levi Ackerman", 'C'));
        newQuestion.add(new MyQuestions("Who has the ability to swallow curses in Jujutsu Kaisen",
                "Gojo Satoru", "Maki Zenin", "Toji Fushiguro", "Geto Seguru", 'D'));
        newQuestion.add(new MyQuestions("Who is the main character of Vinland Saga",
                "Thors", "Snake", "Thorfinn", "Thorkell", 'C'));
        newQuestion.add(new MyQuestions("Who gave the famous 'suicide speech' in anime",
                "Erwin Smith", "Madara", "Obito Uchiha", "Ego Jinpachi", 'A'));
        newQuestion.add(new MyQuestions("Who is known as 'Pervy Sage' in Naruto anime",
                "Orochimaru", "Jiraiya", "Lady Chiyo", "Ebisu", 'B'));
        newQuestion.add(new MyQuestions("Who scored the famous 'Two Gun volley goal' in Blue Lock anime",
                "Itoshi Rin", "Isagi Yoichi", "Nagi Seishiro", "Barou Shouei", 'B'));
        newQuestion.add(new MyQuestions("Who is famously known for his bald head and funny appearance",
                "Mashle", "Naruto", "Saitama", "Gojo", 'C'));
        newQuestion.add(new MyQuestions("Which anime is known for the famous phrase 'Bankai'",
                "Solo Leveling", "Naruto", "Dragon  Ball", "Bleach", 'D'));


        int score = 0;

        for (int i = 0; i < newQuestion.size(); i++) {
            MyQuestions q = newQuestion.get(i);
            System.out.println("\nQuestion " + (i + 1) + ": " + q.question);
            System.out.println(q.optionA);
            System.out.println(q.optionB);
            System.out.println(q.optionC);
            System.out.println(q.optionD);
            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = myscanner.next().charAt(0);

            if (q.isCorrect(userAnswer)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! The correct answer was " + q.correctAnswer);
            }
        }
        System.out.println("\n🎯 You got " + score + " out of " + newQuestion.size() + " correct!");


    }
}
