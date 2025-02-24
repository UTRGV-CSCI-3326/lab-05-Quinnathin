import java.util.Scanner;

public class Input{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String userName = scanner.nextLine();

        System.out.println("Welcome " + userName + ". How old are you?");
        int userAge = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Great. Now what is your weight in ilbs?");
        double userWeight = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Do you smoke?");
        String userAnswer = scanner.nextLine();

        boolean userSmokes = (userAnswer.equalsIgnoreCase("no")) ? true : false;

        System.out.println("This is your recorded information:  Roger\npatient name:" + userName +"\nPatient age: " + 
            userAge + "\nPatient weight: " + userWeight);

        if (userSmokes){
            System.out.println("Patient does not smoke");
        } else {
            System.out.println("Patient does smoke");
        }

    }
}
