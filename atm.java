import java.util.*;
class atm_back{
        int pin=0000;
        float bal;

        public void checkpin(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the pin ");
            int en_pin = sc.nextInt();
            if (en_pin==pin){
                menu();
            }
            else{
                System.out.println("Invalid pin");
                System.out.println("Please Enter Again");
                checkpin();
            }
        }
        public void menu() {
            System.out.println("----------------------------------------");
            System.out.println("Welcome to ATM");
            System.out.println("Enter your choice");
            System.out.println("1. Check Account balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.println("----------------------------------------");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checkbal();
                    break;
                case 2:
                    withdraw();
                case 3:
                    deposit();
                case 4:
                    System.out.println("Thank you for using ATM");
                    System.out.println("----------------------------------------");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }

        public void checkbal(){
            System.out.println("Balance is "+bal);
            menu();
        }
        public void withdraw(){
            System.out.print("Enter Amount you would like to withdraw");
            Scanner sc = new Scanner(System.in);
            float amt=sc.nextFloat();
            if (amt>bal){
                System.out.println("Insufficient Balance");
                System.out.println("Please deposit some more money");
            }
            else {
                bal=bal-amt;
                System.out.print("Amount you debited = "+amt);
                System.out.print("New balance = "+bal);
                menu();
            }
        }
        public void deposit(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Amount you would like to deposit");
            float amt=sc.nextFloat();
            bal=amt+bal;
            System.out.print("Amount you credited = "+amt);
            System.out.print("New balance = "+bal);
            menu();
        }
    }

public class atm{
        public static void main(String[] args) {
            atm_back money=new atm_back();
            money.checkpin();
        }
    }
