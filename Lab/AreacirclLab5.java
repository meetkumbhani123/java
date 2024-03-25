import java.util.Scanner;

class Circle {
    double radius;

    public double AreacircleLab5(double radius) {
        return Math.PI * radius * radius;
    }
}

public class AreacirclLab5 {

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Plese Enter radius");
        Scanner sc= new Scanner(System.in);
        double radius=sc.nextDouble();

        System.out.println(c.AreacircleLab5(radius));


    }
}