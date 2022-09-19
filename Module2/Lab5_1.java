import java.util.Scanner;
public class Lab5 {

    public static void main(String[] args) {

        double d, firstRoot, secondRoot;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c∶");

        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
        input.nextLine();

        d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {//If it is positive, the equation has two real roots.

            firstRoot = (-b + Math.pow(d, 0.5)
            ) / 2 * a;

            secondRoot = (-b - Math.pow(d, 0.5)
            ) / 2 * a;

            System.out.println("The equation has two real roots: " + firstRoot + " and " + secondRoot);

        }

        if (d == 0) {//If it is zero, the equation has one root

            firstRoot = (-b / 2 * a);

            System.out.println("The equation has one root: " + firstRoot);

        }

        if (d < 0) { // If it is negative, the equation has no real roots.

            System.out.println("The equation has no real roots!");

        }

        input.close();

    }
}
