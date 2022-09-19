// Lab 3 (part 2)
import java.util.Scanner;
public class Lab32 {

    public static void main(String[] args) {

        System.out.println("Enter the amount of water in kg: ");

        Scanner input1 = new Scanner(System.in);

        double m = input1.nextDouble();

        System.out.println("Enter the initial temperature of the water in degrees Celsius: ");

        Scanner input2 = new Scanner(System.in);

        double t0 = input2.nextDouble();

        System.out.println("Enter the final temperature of the water in degrees Celsius: ");

        Scanner input3 = new Scanner(System.in);

        double t = input3.nextDouble();

        double energy = m * (t - t0) * 4184;

        System.out.println("The energy needed is " + energy + " J");

    }
}
