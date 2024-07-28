import java.util.*;
public class grading {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks under 100");
        markcal c = new markcal();
        float mi = c.math();
        float sci = c.sci();
        float sos = c.sosc();
        float en = c.eng();
        float hi = c.hindi();
        float tot = mi + sci + sos + en + hi;
        System.out.println("So, Your Total Marks obtained is "+tot+"/500");
        float avg = (tot/500)*100;
        System.out.println("Your Average Marks percentage is "+avg+"%");
        if (avg < 40) {
            System.out.println("Grade obtained E");
        } else if (avg >= 40 && avg < 50) {
            System.out.println("Grade obtained D");
        } else if (avg >= 50 && avg < 60) {
            System.out.println("Grade obtained C");
        } else if (avg >= 60 && avg < 80) {
            System.out.println("Grade obtained B");
        } else if (avg >= 80 && avg < 100) {
            System.out.println("Grade obtained A");
        } else {
            System.out.println("Input Would be out of range");
        }
    }
}
class markcal {
    public float math() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks in Maths ");
        float m = sc.nextFloat();
        return m;
    }
    public float sci() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks in Science ");
        float sci = sc.nextFloat();
        return sci;
    }
    public float sosc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks in Social Science ");
        float sosc = sc.nextFloat();
        return sosc;
    }
    public float hindi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks in Hindi ");
        float hi = sc.nextFloat();
        return hi;
    }
    public float eng() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks in English ");
        float en = sc.nextFloat();
        return en;
    }
}
