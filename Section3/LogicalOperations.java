public class LogicalOperations {
    public static void main(String[] args) {
        int chemistryGrade = 71;
        int englishGrade = 65;
        String language = "Java";

        if (chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")) {
            System.out.println("Congratz, u got the scholarship");
        } else {
            System.out.println("sry, u didn't get the scholarship");
        }

        int credits = 40;
        double GPA = 1.9;

        if (credits >= 40 && GPA >= 2.0) {
            System.out.println("Diploma!");
        } else {
            System.out.println("No diploma");
        }
    }
}
