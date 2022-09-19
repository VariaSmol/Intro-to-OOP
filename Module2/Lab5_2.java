import java.util.Scanner;
public class Lab5_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight of the package: ");

        double weight = input.nextFloat();

        input.nextLine();

        if (cost(weight) == 0) System.out.println("Overweight! The package cannot be shipped.");

        else if (cost(weight) == 1) System.out.println("Invalid input.");

        else {
            System.out.print("The shipping cost: $");

            System.out.printf("%.1f", cost(weight)
            );
        }

        input.close();

    }

    public static double cost(double w) {

        if (0 < w && w <= 1) return 3.5;

        else if (1 < w && w <= 3) return 5.5;

        else if (3 < w && w <= 10) return 8.5;

        else if (10 < w && w <= 20) return 10.5;

        else if (20 < w) return 0;

        return 1;

    }
}