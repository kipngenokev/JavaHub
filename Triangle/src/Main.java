import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of side x");
        x=scanner.nextDouble();

        System.out.println("Enter the value of side y");
        y=scanner.nextDouble();

        z=Math.sqrt((x*x)+(y*y));
        System.out.println("Length of the hypotenuse is "+z);

        scanner.close();
    }
}