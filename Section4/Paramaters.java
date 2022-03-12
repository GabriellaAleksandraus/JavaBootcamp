public class Paramaters {
    public static void main(String[] args) {
        double length = 3.1;
        double width = 2.3;

        measureRectangle(length, width);
        measureRectangle(2.1, 2.0);

    }
    
    public static void measureRectangle(double length, double width) {
        double area = length * width;
        System.out.println(length + " * " + width + " = " + area + "\n");
    }

}
