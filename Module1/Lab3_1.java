// Lab 3 Smolianova Varvara (Part 1)
import java.util.Scanner;
public class Lab3 {

    public static void main(String[] args) {

        System.out.println("Enter a degree in Celsius: ");

        Scanner input3 = new Scanner(System.in);

        double celsius = input3.nextDouble();

        double fahrenheit = (
                (9.0 / 5) * celsius) + 32;

        System.out.println("Celsius is " + fahrenheit + " Fahrenheit");

    }
}