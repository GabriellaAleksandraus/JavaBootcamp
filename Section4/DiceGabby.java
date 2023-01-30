import java.util.Scanner;
import java.lang.Math;

public class DiceGabby {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three numbers between 1 and 6");

        int num1 = getGuess(scan);
        int num2 = getGuess(scan);
        int num3 = getGuess(scan);

        int sumOfRolls = roll1 + roll2 + roll3;
        int sumOfGuess = num1 + num2 + num3;

        System.out.println("Dice: " + sumOfRolls + "\nGuess: " + sumOfGuess);

        if (checkWin(sumOfGuess, sumOfRolls)) {
            System.out.println("gj");
        }else{
            System.out.println("bg");
        }
        
        scan.close();
    }

    public static boolean checkWin(int guesses, int rolls){
        return (rolls < guesses && (guesses - rolls) < 3);
    }

    public static int getGuess(Scanner scan) {
        int num = scan.nextInt();
        if (num < 1 || num > 6){
            System.out.println("values can only be between 1 and 6");
            System.exit(0);
        }
        return num;
    }

    public static int rollDice() {
        //get a random number
        double rand_val = Math.random();
        //let it go between 1-6
        int dice_value = (int)(rand_val*6)+1; // 1-6 
        //return the number
        return dice_value;
    }
    
}
