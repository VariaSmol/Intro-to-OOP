// Lab 2  (Second part)
import java.util.Scanner;
public class Lab22 {

    public static void main(String[] args) {

        System.out.println("Enter the starting velocity (v0) in m/sec: ");

        Scanner input1 = new Scanner(System.in);

        double v0 = input1.nextDouble();

        System.out.println("Enter the end velocity (v) in m/sec: ");

        Scanner input2 = new Scanner(System.in);

        double v = input2.nextDouble();

        System.out.println("Enter time (t) in sec: ");

        Scanner input3 = new Scanner(System.in);

        double t = input3.nextDouble();

        double a = (v - v0) / t;

        System.out.println("the average acceleration is " + a);

    }
}
