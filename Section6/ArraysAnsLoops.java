import java.util.ArrayList;

public class ArraysAnsLoops {
   public static void main(String[] args) {
       String[] kingdoms = {"M", "W", "N", "E"};
       System.out.println("The number of elements is " + kingdoms.length);
       for (int i = 0; i < kingdoms.length; i++) {
           System.out.println("The element at index " + i + " is " + kingdoms[i]);
       }

       ArrayList<String> kingdoms2 = new ArrayList<>();
       kingdoms2.add("M");
       kingdoms2.add("W");
       kingdoms2.add("N");
       kingdoms2.add("E");
       System.out.println("The number of elements is " + kingdoms2.size());
       for (int i = 0; i < kingdoms2.size(); i++) {
           System.out.println("The element at index " + i + " is " + kingdoms2.get(i));
       }


   } 
}
