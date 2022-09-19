// Lab 8 (Part 2)
import java.util.Scanner;
public class Lab8_2 {

    public static void main(String[] args) {

        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November",
                "December"};

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the date in format mm/dd/yyyy: ");

        String date = input.next();

        System.out.print("Formatted date : ");

        System.out.print(months[Integer.parseInt(date.substring(0, 2)
                )] + " " + (Integer.parseInt(date.substring(3, 5)
                )
                ) + ", " + date.substring
                        (6)
        );

        input.close();

    }
}