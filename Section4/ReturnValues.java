public class ReturnValues {
    public static void main(String[] args) {

        double length = -3.1;
        double width = 2.3;
        String option = "area";
        double area = measureRectangle(length, width, option);
        stringPrinter(length, width, area, "area");

        length = 3.1;
        width = 2.3;
        option = "perimeter";
        area = measureRectangle(length, width, option);
        stringPrinter(length, width, area, "perimeter");


    }


    public static double measureRectangle(double length, double width, String option) {
        if (length < 0 || width <0) {
            System.out.println("Length or width cannot be negative");
            System.exit(0);
        }
        switch (option){
            case "area": return length * width;
            case "perimeter": return 2 * (length * width);
            default: return 404;
        }
        //double area = length * width;
        //System.out.println(length + " * " + width + " = " + area + "\n");
        //return area;
    }

    public static void stringPrinter(double length, double width, double area, String option) {
        System.out.println(option + ": " + length + " * " + width + " = " + area + "\n");

    }

}
