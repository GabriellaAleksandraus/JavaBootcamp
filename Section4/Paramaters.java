public class Paramaters {
    public static void main(String[] args) {
        double length = 3.1;
        double width = 2.3;

        double area1 = measureRectangle(length, width);
        double area2 = measureRectangle(2.1, 2.0);
        System.out.println(area1);
        System.out.println(area2);


    }
    
    public static double measureRectangle(double length, double width) {
        double area = length * width;
        System.out.println(length + " * " + width + " = " + area + "\n");
        return area;
    }

}
