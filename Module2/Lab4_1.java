import java.util.Scanner;
public class Lab4 {

    public static void main (String [] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance: ");

        int balance = input.nextInt();

        input.nextLine();

        System.out.print("\nEnter your Interest rate (e.g., 3 for 3 %)
: ");

        float rate = input.nextFloat();

        input.nextLine();

        float interest = balance * (rate/1200);

        System.out.print("The interest is "+ interest);

        input.close();

    }
}