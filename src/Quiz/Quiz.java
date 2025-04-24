package Quiz;

import java.util.*;

class Question {
    String questionText;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    char correctAnswer;

    public Question(String questionText, String optionA, String optionB, String optionC, String optionD, char correctAnswer) {
        this.questionText = questionText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrect(char answer) {
        return Character.toUpperCase(answer) == Character.toUpperCase(correctAnswer);
    }
}

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();

        // Add questions
        questions.add(new Question(
                "What is the capital of France?",
                "A. Berlin", "B. Madrid", "C. Paris", "D. Rome", 'C'));

        questions.add(new Question(
                "Which planet is known as the Red Planet?",
                "A. Earth", "B. Mars", "C. Venus", "D. Saturn", 'B'));

        questions.add(new Question(
                "Who wrote 'Romeo and Juliet'?",
                "A. Charles Dickens", "B. Mark Twain", "C. William Shakespeare", "D. Jane Austen", 'C'));

        int score = 0;

        // Loop through questions
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQuestion " + (i + 1) + ": " + q.questionText);
            System.out.println(q.optionA);
            System.out.println(q.optionB);
            System.out.println(q.optionC);
            System.out.println(q.optionD);
            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = scanner.next().charAt(0);

            if (q.isCorrect(userAnswer)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! The correct answer was " + q.correctAnswer);
            }
        }

        System.out.println("\n🎯 You got " + score + " out of " + questions.size() + " correct!");
    }
}
