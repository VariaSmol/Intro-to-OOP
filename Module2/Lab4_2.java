import java.util.Scanner;
public class Lab4_2 {

    public static void main(String [] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter coordinates of point 1 (x1 y1)
: ");

        double x1 = input.nextDouble(), y1 = input.nextDouble(); input.nextLine();

        System.out.print("\nEnter coordinates of point 2 (x2 y2)
: ");

        double x2 = input.nextDouble(), y2 = input.nextDouble(); input.nextLine();

        double distance = Math.pow(
                (
                        (Math.pow(
                                (x2-x1),2)
                        )+(Math.pow(
                                (y2-y1),2)
                        )
                ),0.5);

        System.out.print("\nThe distance between the two points is "+ distance);

        input.close();

    }
}