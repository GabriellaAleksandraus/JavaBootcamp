public class ForLoopsExamples {

    public static void main(String[] args) {
        for (int i = 1; i<11; i++){
            System.out.println(i);
        }

        for (int i = 0; i<5; i++){
            System.out.println("Hello world!");
        }

        System.out.println("\nMultiplaction table: ");
        for (int i = 1; i<11; i++){
            System.out.println(i + ": " + i * 5);
        }

        System.out.println("\nReverse order: ");
        for (int i = 10; i>0; i--){
            System.out.println(i);
        }

        System.out.println("\nEven numbers: ");
        for (int i = 0; i<10; i++){
            System.out.println(i * 2);
        }

        System.out.println("\nEven numbers test 2: ");
        for (int i = 0; i<19; i+=2){
            System.out.println(i);
        }
    }
    
}
