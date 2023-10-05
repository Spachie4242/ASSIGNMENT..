import java.util.Scanner;

public class student login {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String correctUsername = "your_username";
        String correctPassword = "your_password";
        int attempts = 3;
        System.out.println("Welcome to the login program!");
        while (attempts>0){
            System.out.println("Welcome to the login Program!");
            while (attempts>0){
                System.out.print("Enter your username:");
                String Username= Scanner.nextLine();
                System.out. print("Enter your password:");
                String Password= Scanner.nextLine();
                if(Username.equals("emmanuel") && Password.equals(correctPassword)) {
                System.out.println("Login successful!");
                break;
                } else {
                System.out.println("Login failed. Please try again.");
                attempts--;

                if (attempts > 0) {
                    System.out.println("You have " + attempts + " attempts remaining.");
                } else {
                    System.out.println("No more attempts. Account locked.");
                }
            }
        }

        Scanner.close();
    }
                
            
        }
        }
