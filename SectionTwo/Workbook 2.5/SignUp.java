import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");

        System.out.println("\nWhat is your first name?");
        String firstName = scan.nextLine();

        System.out.println("\nWhat is your last name?");
        String lastName = scan.nextLine();

        System.out.println("\nHow old are you?");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("\nMake a username");
        String username = scan.nextLine();

        System.out.println("\nWhich city do you live in?");
        String city = scan.nextLine();

        System.out.println("\nWhat country is that from?");
        String country = scan.nextLine();

        scan.close();



        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        //Ask for their last name.
        //Ask: how old are you?
        //Ask them to make a username.
        //Ask what city they live in.
        //Ask what country that's from.


        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram!");

        System.out.println("Here is your information:");
        System.out.println("\tFirst name: " + firstName);
        System.out.println("\tLast name: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);



        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //


        //close scanner. It's good practice :D ! 
    }
}