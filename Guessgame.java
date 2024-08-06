import java.util.*;
class gameback {
    int guess = 0;

    int get_random() {                                                      //Genrates a random number from 1 to 100
        Random rand = new Random();
        int random = rand.nextInt(101);
        System.out.println(random);
        return random;
    }

    int input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 100");
        int number = sc.nextInt();
        if (number > 100 || number < 1) {
            System.out.println("Out of range");
            return input();
        }
        return number;
    }
    void output(int number, int random,int i) {
        if (number == random) {
            System.out.println("You Guessed the number \nYou Won!");
            sco(random,i);
            System.exit(0);
        }
        else if (number > random) {
            System.out.println("You selected a high number");
            if (i==6) {
                sco(random,i);
            }
        }
        else if (number < random) {
            System.out.println("You selected a low number");
            if (i==6) {
                sco(random,i);
            }
        }
        }
    void sco(int random,int i) {
        System.out.println("-------------------------------------");
        System.out.println("The Correct number Was " + random);
        System.out.println("You Guessed in " + i + "th chances");
        if (i==6) {
            i=0;
            System.out.println("You Lost the game");
        }
        }
    }

public class Guessgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        gameback g = new gameback();
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("Welcome to Guess Game");
        System.out.println("You have only 6 chances to guess the number");
        System.out.println("Select you want to play or not (y/n)");
        String b = sc.next();
        int random=g.get_random();
        if (b.equals("y")) {
            for (int i = 1; i <= 6; i++) {
                System.out.println("==============================");
            System.out.println("Your "+i+"'s guess");
            int number=g.input();
            g.output(number,random,i);
        }
    }
        else if (b.equals("n")) {
            System.out.println("Thank you for playing");
            System.out.println("----------------------------------------------------");
            System.out.println("----------------------------------------------------");
        }
    }
}