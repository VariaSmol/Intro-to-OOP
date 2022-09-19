// Lab 7 (Part 1)
import java.util.Scanner;
public class Lab7_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter phone number: ");

        String phoneNumb = input.next();

        System.out.print("Formatted phone number : ");

        System.out.print( "(" + phoneNumb.substring(0,3) + ")" + phoneNumb.substring(3,6)+ "-"+ phoneNumb.substring(6)
        );

        input.close();

    }
}