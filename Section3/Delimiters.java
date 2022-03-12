import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two intergers (on the same line)");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Enter two very big intergers (on the same line)");
        long bigNum1 = scan.nextLong();
        long bigNum2 = scan.nextLong();

        System.out.println("Enter two decimals (on the same line)");
        double decimal1 = scan.nextDouble();
        double decimal2 = scan.nextDouble();

        System.out.println("Enter two text values (on the same line)");
        String text1 = scan.next();
        String text2 = scan.next();

        scan.close();

        System.out.println("\tIntergers: " + num1 + " " + num2);
        System.out.println("\tBig Intergers: " + bigNum1 + " " + bigNum2);
        System.out.println("\tDecimals: " + decimal1 + " " + decimal2);
        System.out.println("\tIntergers: " + text1 + " " + text2);

//nextLine reads the whole line and prints it (even the white spaces)
//nextInt etc skips the white spaces and looks for the nest int (etc)
    }
    
}
