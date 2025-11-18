import java.util.Scanner;
public class AndOrNot {
    public static void main (String[] arg) {
        // && = And
        // || = OR
        // ! = Not
        Scanner scanner = new Scanner(System.in);
        /*
        Username must be between 4-12 characters
        Username must not contain space and underscores
        */
        String name;
        System.out.println("What is your name?");
        name = scanner.nextLine();
        if(name.length()<4 || name.length()>12){
            System.out.println("Username must be between 4-12 characters");
        }
        else if (name.contains(" ") || name.contains("_")) {
            System.out.println("Username must not contain space and underscores");
        }
        else System.out.println("Your name is "+ name);











    }
}
