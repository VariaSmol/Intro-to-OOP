// Lab 7 (Part 2)
import java.util.Scanner;
public class Lab7_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a SSN in the format DDD-DD-DDDD: ");

        String ssn = input.next();

        if (ssn.charAt(3) == '-' && ssn.charAt(6) == '-' && ssn.length() == 11)

            System.out.print(ssn + " is a valid social security number");

        else

            System.out.print(ssn + " is an invalid social security number");

        input.close();

    }
}
