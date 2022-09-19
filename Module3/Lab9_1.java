// Lab 9 (Part 1)
import java.util.Scanner;
public class Lab9_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");

        String strng = input.next();
        input.nextLine();

        System.out.println("Enter a character: ");

        char chct = input.next()
                .charAt(0);

        System.out.print("The number of occurrences of the character in the string: " + count(strng, chct)
        );

        input.close();

    }

    public static int count(String str, char a) {

        int times = 0;

        for (int i = 0; i < str.length(); i++)

            if (str.charAt(i) == a) times++;

        return times;

    }
}