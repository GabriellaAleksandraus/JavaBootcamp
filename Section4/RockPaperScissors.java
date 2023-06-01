import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String playAnswer = scan.nextLine();

        if (playAnswer.equals("yes")) {
            System.out.println("Great!");
            System.out.println("rock - paper - scissors, shoot! \n");
            String yourChoice = scan.next();          
            String compChoice = computerChoice();
            String res = result(yourChoice, compChoice);
            printResult(yourChoice, compChoice, res);
   
        }else{
            System.out.println("Darn, some other time...!");
        }

        scan.close();
    }


    public static String computerChoice() {
        double rand_value = Math.random();
        int computer_value = (int)(rand_value*3);
        if (computer_value == 0) {
            return "rock";
        }else if (computer_value == 1) {
            return "paper";
        }else if (computer_value == 2) {
            return "scissors";
        }else {
            return "something went wrong";
        }

    } 


    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
            return "You win!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            return "You win!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            return "You win!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("rock")) {
            return "You lose";
        } else if (yourChoice.equals("rock") && computerChoice.equals("paper")) {
            return "You lose";
        } else if (yourChoice.equals("paper") && computerChoice.equals("scissors")) {
            return "You lose";
        }else if (yourChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else {
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }

        return result;

    }

     public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("You chose: " + yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);

     }

}
