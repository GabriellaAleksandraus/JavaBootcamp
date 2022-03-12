public class ReturnValues {
    public static void main(String[] args) {

        double length = 3.1;
        double width = 2.3;
        double area = measureRectangle(length, width);
        stringPrinter(length, width, area);

        length = 4.1;
        width = 5.3;
        area = measureRectangle(length, width);
        stringPrinter(length, width, area);


    }


    public static double measureRectangle(double length, double width) {
        double area = length * width;
        //System.out.println(length + " * " + width + " = " + area + "\n");
        return area;
    }

    public static void stringPrinter(double length, double width, double area) {
        System.out.println(length + " * " + width + " = " + area + "\n");

    }

}
