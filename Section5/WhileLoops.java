public class WhileLoops {
    public static void main(String[] args) {
        double choice = 0.01;
        double guess = 0.99;

        int i = 0;
        while (guess > choice) {
            guess = Math.random();
            i++;
            System.out.println(i + ": " + guess);
        }
    }
    
}
