import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Quiz1 {
    public static void main(String[] args) {
        Question1 questions = new Question1();
        System.out.println("Welcome to the Quiz!");
        System.out.println("You have 4 questions");
        System.out.println("Instructions:");
        System.out.println("* Only select the option number corresponding to the options");
        questions.startQuiz();
    }
}

class Question1 {
    private Scanner scanner = new Scanner(System.in);
    private Timer timer = new Timer();
    private int score = 0;

    void startQuiz() {
        int q=1;
        switch (q) {
            case 1:
                question1();
                question2();
                question3();
                question4();
                score();
        }
    }

    void timer() {
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println("You exceeded 10 seconds!");
                score = 0;
            }
        }, 10000);
    }

    void question1() {
        timer();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Question 1: Who is the PM of India?");
        System.out.println("1. Narendra Modi");
        System.out.println("2. Rahul Gandhi");
        System.out.println("3. Donald Trump");
        System.out.println("4. Putin");
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.println("Correct Answer!");
            score++;
        } else {
            System.out.println("Wrong Answer!");
        }
    }

    void question2() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Question 2: What is the capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. Kolkata");
        System.out.println("3. Delhi");
        System.out.println("4. Agra");
        int option = scanner.nextInt();
        if (option == 3) {
            System.out.println("Correct Answer!");
            score++;
        } else {
            System.out.println("Wrong Answer!");
        }
    }

    void question3() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Question 3: How many days are in a week?");
        System.out.println("1. 20 Days");
        System.out.println("2. 7 Days");
        System.out.println("3. 6 Days");
        System.out.println("4. 3 Days");
        int option = scanner.nextInt();
        if (option == 2) {
            System.out.println("Correct Answer!");
            score++;
        } else {
            System.out.println("Wrong Answer!");
        }
    }

    void question4() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Question 4: What is the national river of India?");
        System.out.println("1. Yamuna River");
        System.out.println("2. Son River");
        System.out.println("3. Ganga River");
        System.out.println("4. Saraswati River");
        int option = scanner.nextInt();
        if (option == 3) {
            System.out.println("Correct Answer!");
            score++;
        } else {
            System.out.println("Wrong Answer!");
        }
    }

    void score() {
        System.out.println("Total Score: " + score + " out of 4 questions");
        scanner.close();
    }
}
   class ti {
   Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println("Time's up!");
                timer.cancel();
                System.exit(0);
            }
        };
        }
