import java.util.ArrayList;

public class ArraysAnsLoops {
   public static void main(String[] args) {
       String[] kingdoms = {"M", "W", "N", "E"};
       System.out.println("The number of elements is " + kingdoms.length);
       for (int i = 0; i < kingdoms.length; i++) {
           System.out.println("The element at index " + i + " is " + kingdoms[i]);
       }

       ArrayList<String> kingdoms2 = new ArrayList<>("M", "W", "N", "E");
       System.out.println("The number of elements is " + kingdoms2.size());
       for (int i = 0; i < kingdoms2.size(); i++) {
           System.out.println("The element at index " + i + " is " + kingdoms2.get(i));
       }


   } 
}
